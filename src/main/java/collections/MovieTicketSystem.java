package main.java.collections;


import java.util.*;

public class MovieTicketSystem {
    List<Ticket> tickets = new ArrayList<>();
    Set<String> uniqueCustomers = new HashSet<>();
    Map<String, Integer> allCustomerBookings = new HashMap<>();

    public static void main(String[] args) {
        MovieTicketSystem mts = new MovieTicketSystem();
        mts.bookNewTicket();
        System.out.println("Unique Customers: " + mts.uniqueCustomers);
        System.out.println("All Bookings: " + mts.allCustomerBookings);
    }

    void bookNewTicket() {
        Customer customer1 = new Customer("Stephen", "072343434", "stephen@gmail.com", 1);
        Movie movie1 = new Movie("Call Of Duty", 1.30);
        Customer customer2 = new Customer("Rosellyn", "0723453453", "rosellyn@gmail.com", 1);
        Movie movie2 = new Movie("Forever Yours", 2.00);

        Ticket ticket1 = new Ticket(1, customer1, movie1);
        Ticket ticket2 = new Ticket(2, customer2, movie2);
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket2);

        for(Ticket ticket: tickets) {
            String email = ticket.customer.email;
            updateUniqueBookings(email);
            updateAllCustomerBookings(email);
            System.out.println(ticket);
        }
    }


    void updateAllCustomerBookings(String email) {
        int previous = allCustomerBookings.getOrDefault(email, 0);
        allCustomerBookings.put(email, previous + 1);
    }

    void updateUniqueBookings(String email) {
        uniqueCustomers.add(email);
    }

    public record Movie(String name, double duration){}
    public record Customer(String name, String phone, String email, int id){}
    public record Ticket (int id, Customer customer, Movie movie){

        @Override
        public String toString() {
            return "Ticket ID: " + id + " Customer Name: " + customer.name + " Customer Phone: " + customer.phone + " Movie Name: " + movie.name() + " Movie Duration: " + movie.duration;
        }
    }
}
