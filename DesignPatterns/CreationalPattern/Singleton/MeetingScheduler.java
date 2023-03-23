package CreationalPattern.Singleton;

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

    public void scheduleMeeting(Meeting meeting) {
        if (meetings.containsKey(meeting.getDate())) {
            // There is already a meeting scheduled on that date
            System.out.println("Meeting could not be scheduled, another meeting is already scheduled on the same time");
            // return false;
        } else {
            meetings.put(meeting.getDate(), meeting);
            System.out.println("Meeting scheduled successfully");
            // return true;
        }
    }

}

