package main.java.records;

import main.java.dto.CustomerDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MovieTicketBooking {
    List<Ticket> tickets = new ArrayList<>();

    CustomerDto customer1 = new CustomerDto("Stephen Ochieng", "dropquick@gmail.com", "071343434");
    Movie movie1 = new Movie("Call of Duty", 001, new Date());

    CustomerDto customer2 = new CustomerDto("Roselline", "dropquick02@gmail.com", "0713424562");
    Movie movie2 = new Movie("Terminator", 002, new Date());

    Ticket ticket1 = new Ticket("T001", customer1, movie1, "001", "3PM", 2000.00);
    Ticket ticket2 = new Ticket("T002", customer2, movie2, "002", "8 PM", 800.00);

//    tickets.add(ticket1);


//    public record Customer(String name, String email, String phone){}
    public record Movie(String name, int id, Date releaseDate){}
    public record Ticket(String bookingId, CustomerDto customer, Movie movie, String seatNumber, String showTime, double price){}

}
