package ro.vis.crawlerdashboard.services;

import org.springframework.stereotype.Service;
import ro.vis.crawlerdashboard.entities.BlacklistedKeyword;
import ro.vis.crawlerdashboard.repositories.BlacklistedKeywordRepository;

import java.util.List;

@Service
public class BlacklistedKeywordService {

    private final BlacklistedKeywordRepository repository;

    public BlacklistedKeywordService(BlacklistedKeywordRepository repository) {
        this.repository = repository;
    }

    public List<BlacklistedKeyword> findAll() {
        return repository.findAll();
    }

}
