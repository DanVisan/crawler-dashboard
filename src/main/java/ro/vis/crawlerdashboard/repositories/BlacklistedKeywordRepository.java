package ro.vis.crawlerdashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.vis.crawlerdashboard.entities.BlacklistedKeyword;

@Repository
public interface BlacklistedKeywordRepository extends JpaRepository<BlacklistedKeyword, Integer> {
}
