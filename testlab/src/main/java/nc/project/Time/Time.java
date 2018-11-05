package nc.project.Time;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Виктор on 03.11.2018.
 */
@Document(value = "Time")
public class Time {
    @Id
    private int id;
    private int countHours;

    public Time(int id, int countHours) {
        this.id = id;
        this.countHours = countHours;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCountHours() {
        return countHours;
    }

    public void setCountHours(int countHours) {
        this.countHours = countHours;
    }

}
