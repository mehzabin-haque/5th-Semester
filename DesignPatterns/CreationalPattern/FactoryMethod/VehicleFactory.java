package DesignPatterns.CreationalPattern.FactoryMethod;

public abstract class VehicleFactory {
    
    public Vehicle orderVehicle(){
        System.out.println("Vehicle in order...");
        Vehicle vehicle = requestForVehicle();
        vehicle.requestInProcess();;
        return vehicle;
    }

    public abstract Vehicle requestForVehicle();
}
