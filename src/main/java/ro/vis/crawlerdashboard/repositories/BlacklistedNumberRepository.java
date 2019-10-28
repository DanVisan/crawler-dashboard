package ro.vis.crawlerdashboard.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.vis.crawlerdashboard.entities.BlacklistedNumber;

@Repository
public interface BlacklistedNumberRepository extends JpaRepository<BlacklistedNumber, String> {
}
