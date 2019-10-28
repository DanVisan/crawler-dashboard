package ro.vis.crawlerdashboard.services;

import org.springframework.stereotype.Service;
import ro.vis.crawlerdashboard.entities.BlacklistedNumber;
import ro.vis.crawlerdashboard.repositories.BlacklistedNumberRepository;

import java.util.List;

@Service
public class BlacklistedNumberService {

    private final BlacklistedNumberRepository repository;

    public BlacklistedNumberService(BlacklistedNumberRepository repository) {
        this.repository = repository;
    }

    public List<BlacklistedNumber> findAll() {
        return repository.findAll();
    }
}
