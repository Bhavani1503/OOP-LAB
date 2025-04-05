class ParkingSystem {
    protected int availableSpots;
    
    public ParkingSystem(int totalSpots) {
        this.availableSpots = totalSpots;
    }
    
    public boolean parkCar() {
        if (availableSpots > 0) {
            availableSpots--;
            System.out.println("Car parked successfully. Spots left: " + availableSpots);
            return true;
        }
        System.out.println("Parking full. Cannot park car.");
        return false;
    }
    
    public void exitCar() {
        availableSpots++;
        System.out.println("Car exited. Spots available: " + availableSpots);
    }
}

class PaidParkingSystem extends ParkingSystem {
    private double hourlyRate;
    private double totalRevenue;
    
    public PaidParkingSystem(int totalSpots, double hourlyRate) {
        super(totalSpots);
        this.hourlyRate = hourlyRate;
        this.totalRevenue = 0;
    }
    
    public double calculateFee(int hours) {
        return hours * hourlyRate;
    }
    
    public void makePayment(double amount) {
        totalRevenue += amount;
        System.out.println("Payment of $" + amount + " received.");
    }
    
    public void displayRevenue() {
        System.out.println("Total revenue: $" + totalRevenue);
    }
}
public class Parking_System {
    public static void main(String[] args) {
        System.out.println("Basic Parking System:");
        ParkingSystem basicParking = new ParkingSystem(3);
        basicParking.parkCar();
        basicParking.parkCar();
        basicParking.parkCar();
        basicParking.parkCar(); 
        basicParking.exitCar();
       
        System.out.println("\nPaid Parking System:");
        PaidParkingSystem paidParking = new PaidParkingSystem(2, 2.5);
        paidParking.parkCar();
        paidParking.parkCar();
        
        double fee = paidParking.calculateFee(3);
        paidParking.makePayment(fee);
        paidParking.exitCar();
        paidParking.displayRevenue();
    }
}