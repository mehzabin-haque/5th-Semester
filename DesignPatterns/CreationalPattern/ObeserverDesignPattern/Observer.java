package CreationalPattern.ObeserverDesignPattern;

import java.io.File;

public abstract class Observer {
    protected String name;

    public Observer(String name) {
        this.name = name;
    }

    public abstract void update(File file);
    
    
}
