package CreationalPattern.ObeserverDesignPattern;

import java.io.File;

public class ConcreteObserver extends Observer {
    
    public ConcreteObserver(String name) {
        super(name);
    }

    public void update(File file) {
        System.out.println( name + " received notification:");
        System.out.println("File name: " + file.getName());
        System.out.println("Time of change: " + System.currentTimeMillis());
        System.out.println("------------------------------");
    }
}
