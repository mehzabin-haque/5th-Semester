package CreationalPattern.ObeserverDesignPattern;

public abstract class Observer {
    protected String name;

    public Observer(String name) {
        this.name = name;
    }

    public abstract void update(String message);
    
    
}
