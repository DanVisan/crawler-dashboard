package ro.vis.crawlerdashboard.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BlacklistedNumber {
    @Id
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "BlacklistedNumber{" +
                "number='" + number + '\'' +
                '}';
    }
}
