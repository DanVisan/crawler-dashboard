package ro.vis.crawlerdashboard.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BlacklistedKeyword {
    @Id
    private int id;

    private String keyword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "BlacklistedKeyword{" +
                "id=" + id +
                ", keyword='" + keyword + '\'' +
                '}';
    }
}
