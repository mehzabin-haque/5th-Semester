package CreationalPattern.ObeserverDesignPattern;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("file.txt");

        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        ConcreteSubject subject = new ConcreteSubject(file);
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.monitorFile();
        
        subject.unregisterObserver(observer2);

        subject.monitorFile();

    }
}
