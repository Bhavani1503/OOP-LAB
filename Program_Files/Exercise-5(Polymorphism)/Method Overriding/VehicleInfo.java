class Vehicle {
    private String make;
    private String model;
    private int year;
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start() {
        System.out.println("Starting the vehicle...");
    }
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
    public final void stop() {
        System.out.println("Stopping the vehicle...");
    }
}
class ElectricCar extends Vehicle {
    private int batteryCapacity;
    public ElectricCar(String make, String model, int year, int batteryCapacity) {
        super(make, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    public void start() {
        System.out.println("Starting electric motor silently...");
        checkBattery();
    }
    public void displayInfo() {
        super.displayInfo(); 
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
    private void checkBattery() {
        System.out.println("Battery level: 95%");
    }
}
class Motorcycle extends Vehicle {
    private boolean hasSideCar;
    public Motorcycle(String make, String model, int year, boolean hasSideCar) {
        super(make, model, year);
        this.hasSideCar = hasSideCar;
    }
    public void start() {
        System.out.println("Kickstarting the motorcycle...");
    }
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}
public class VehicleInfo {
    public static void main(String[] args) {
        Vehicle genericVehicle = new Vehicle("Generic", "Model", 2020);
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 2023, 100);
        Motorcycle harley = new Motorcycle("Harley-Davidson", "Sportster", 2022, false);
        System.out.println("--- Starting Vehicles ---");
        genericVehicle.start();
        tesla.start();  
        harley.start(); 
        System.out.println("\n--- Vehicle Information ---");
        genericVehicle.displayInfo();
        tesla.displayInfo();
        harley.displayInfo();
        System.out.println("\n--- Stopping Vehicles ---");
        genericVehicle.stop();
        tesla.stop();  
        harley.stop(); 
        System.out.println("\n--- Polymorphism Demonstration ---");
        Vehicle[] vehicles = {genericVehicle, tesla, harley};
        for (Vehicle v : vehicles) {
            v.start();  
        }
    }
}