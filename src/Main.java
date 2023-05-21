public class Main {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        carFactory.commonMethod();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.commonMethod();
        Vehicle motorcycle = motorcycleFactory.createVehicle();
        motorcycle.drive();
    }
}