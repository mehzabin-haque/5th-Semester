package DesignPatterns.CreationalPattern.Singleton;

public class ScheduleRequest {
    private final String name;
    
    public ScheduleRequest(String name){
        this.name = name;
    }

    public void currentSchedule(){
        ScheduleSingleton scheduleSingleton = ScheduleSingleton.getInstance();
        scheduleSingleton.booking(name);
    }
}
