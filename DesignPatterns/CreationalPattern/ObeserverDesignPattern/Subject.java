package CreationalPattern.ObeserverDesignPattern;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer has been unregistered and won't receive notifications.");
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
                observer.update(message);
        }

        System.out.println("******************************");
    }
    
    
}
