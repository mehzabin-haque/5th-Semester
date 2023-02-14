package CreationalPattern.FactoryMethod;

public class MotorCycleFactory extends VehicleFactory{

    @Override
    public Vehicle requestForVehicle() {
        return new MotorCycle();
    }
    
}
