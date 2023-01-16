package CreationalDesignPattern.Singleton;

import java.sql.Date;
import java.util.List;

public class Meeting {
    private Date date;
    private String location;
    private List<String> attendees;

    public Meeting(Date date, String location, List<String> attendees) {
        this.date = date;
        this.location = location;
        this.attendees = attendees;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public List<String> getAttendees() {
        return attendees;
    }
}
