package DesignPatterns.CreationalPattern.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory tataMotors = new CarFactory();
        tataMotors.orderVehicle();

        System.out.println("******************");

        VehicleFactory marutiSuzuki = new MotorCycleFactory();
        marutiSuzuki.orderVehicle();
    }
}
