class TicketBooking {
    private String movieName;
    private int availableSeats;

    public TicketBooking(String movieName, int availableSeats) {
        this.movieName = movieName;
        this.availableSeats = availableSeats;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookTickets(int seats) {
        if (seats > 0 && seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Not enough seats available.");
        }
    }
}

public class TicketBookingSystem {
    public static void main(String[] args) {
        TicketBooking booking = new TicketBooking("Avengers: Endgame", 50);

        System.out.println("Movie: " + booking.getMovieName());
        System.out.println("Available Seats: " + booking.getAvailableSeats());

        booking.bookTickets(5);
        System.out.println("Updated Available Seats: " + booking.getAvailableSeats());
    }
}
