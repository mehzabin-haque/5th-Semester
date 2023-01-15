package DesignPatterns.CreationalPattern.FactoryMethod;

public class CarFactory extends VehicleFactory{
    
    @Override
    public Vehicle requestForVehicle() {
        return new Car();
    }
}
