package CreationalDesignPattern.Singleton;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(2022, 10, 15);
        Date date2 = new Date(2022, 10, 15);
        List<String> attendees = Arrays.asList("John", "Jane", "Bob");

        Meeting meeting1 = new Meeting(date1, "Conference Room 1", attendees);
        Meeting meeting2 = new Meeting(date2, "Conference Room 2", attendees);

        MeetingScheduler scheduler = MeetingScheduler.getInstance();
        if(scheduler.scheduleMeeting(meeting1)){
            System.out.println("Meeting scheduled successfully");
        }else {
            System.out.println("Meeting could not be scheduled, another meeting is already scheduled on the same time");
        }
        if(scheduler.scheduleMeeting(meeting2)){
            System.out.println("Meeting scheduled successfully");
        }else {
            System.out.println("Meeting could not be scheduled, another meeting is already scheduled on the same time");
        }

        scheduler.cancelMeeting(meeting1);
        System.out.println("Meeting is canceled");
    }
}
