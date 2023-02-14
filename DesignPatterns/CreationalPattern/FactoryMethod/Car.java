package CreationalPattern.FactoryMethod;

public class Car implements Vehicle{

    @Override
    public void requestInProcess() {
        System.out.println("Car creation done.....");
    }

   
}
