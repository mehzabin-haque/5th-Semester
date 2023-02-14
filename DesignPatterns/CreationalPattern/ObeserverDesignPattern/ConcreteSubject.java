package CreationalPattern.ObeserverDesignPattern;

import java.io.File;

public class ConcreteSubject extends Subject {
    private File file;

    public ConcreteSubject(File file) {
        this.file = file;
    }

    public void monitorFile() {
        notifyObservers(getFile());
    }

    public File getFile() {
        return file;
    }
}