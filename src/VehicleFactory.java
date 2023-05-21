abstract class VehicleFactory {
    public void commonMethod() {
        System.out.println("Executing common method");
    }

    // Factory Method
    public abstract Vehicle createVehicle();
}