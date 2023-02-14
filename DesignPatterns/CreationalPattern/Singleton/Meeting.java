package CreationalDesignPattern.Singleton;

import java.sql.Date;
import java.util.List;

public class Meeting {
    private Date date;
    private List<String> attendees;

    public Meeting(Date date, List<String> attendees) {
        this.date = date;
        this.attendees = attendees;
    }

    public Date getDate() {
        return date;
    }

    public List<String> getAttendees() {
        return attendees;
    }
}
