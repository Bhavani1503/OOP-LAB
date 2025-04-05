class Transport {
    void bookRide() {
        System.out.println("Ride booked successfully.");
    }
}

class Taxi extends Transport {
    void fareEstimate() {
        System.out.println("Estimated fare: $15.");
    }
}

class Bus extends Transport {
    void busSchedule() {
        System.out.println("Next bus arrives in 10 minutes.");
    }
}

public class TransportBooking {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        taxi.bookRide();
        taxi.fareEstimate();

        Bus bus = new Bus();
        bus.bookRide();
        bus.busSchedule();
    }
}
