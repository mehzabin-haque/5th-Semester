package CreationalPattern.ObeserverDesignPattern;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Path path = Paths.get("DesignPatterns/CreationalPattern/ObeserverDesignPattern/File");
        
        ConcreteSubject subject = new ConcreteSubject(path);
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
       
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.monitorFile();
    }
}
