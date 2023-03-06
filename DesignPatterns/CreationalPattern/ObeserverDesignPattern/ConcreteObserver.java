package CreationalPattern.ObeserverDesignPattern;

import java.io.File;

public class ConcreteObserver extends Observer {
    
    public ConcreteObserver(String name) {
        super(name);
    }

    public void update(String message) {
        System.out.println( name + " received notification:");
        System.out.println(message);
        System.out.println("Time of change: " + System.currentTimeMillis());
        System.out.println("------------------------------");
    }
}
