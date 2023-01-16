package CreationalDesignPattern.Singleton;

// import java.sql.*;
import java.sql.Date;
import java.util.*;

public class MeetingScheduler {
    private static MeetingScheduler instance;
    private Map<Date, Meeting> meetings;

    private MeetingScheduler() {
        this.meetings = new HashMap<>();
    }

    public static synchronized MeetingScheduler getInstance() {
        if (instance == null) {
            instance = new MeetingScheduler();
        }
        return instance;
    }

    public boolean scheduleMeeting(Meeting meeting) {
        if (meetings.containsKey(meeting.getDate())) {
            // There is already a meeting scheduled on that date
            return false;
        } else {
            meetings.put(meeting.getDate(), meeting);
            return true;
        }
    }

}

