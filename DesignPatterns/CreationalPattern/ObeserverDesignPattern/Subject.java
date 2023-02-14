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
    }

    public void notifyObservers(File file) {
        for (Observer observer : observers) {
            if (observers.contains(observer)) {
                observer.update(file);
            } else {
                System.out.println("Observer has been unregistered and won't receive notifications.");
            }
        }

        System.out.println("******************************");
    }
}