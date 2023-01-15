package DesignPatterns.CreationalPattern.Singleton;
public class ScheduleSingleton {
    // volatile makes the changes or the threads which are accessing
    // instance variable visible
    private static volatile ScheduleSingleton instance = null;
    private int bookNum;
    private ScheduleSingleton(){
        if(instance != null){
            throw new RuntimeException("PM is booked. Sorry :( ");
        }
    }

    public static ScheduleSingleton getInstance(){
        if(instance == null){
            // this block ensures no two threads are initializing
            // the instances at the same time
            synchronized(ScheduleSingleton.class){
                if(instance == null){
                    instance = new ScheduleSingleton();
                }
            }
            
        }
        return instance;
    }

    public void booking(String name){
        System.out.println(name +
                "  got an appoinment and appoint number is :  " 
                + ++bookNum );
    }

}
