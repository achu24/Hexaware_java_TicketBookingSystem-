package Task_4;
import java.util.*;
public class Booking {
int booking_id;
	
	public Booking() {
		int booking_id=101;
    }
	
	public Booking(int booking_id) {
		this.booking_id=booking_id;
	}

    public static void main(String[] args) {
        Event e = new Event();
        Booking b=new Booking();
        
        e.book_tickets(11);
        b.cancelBooking(100,8);
        
        e.display_event_details();
        
        
        
        int available_tickets = getAvailableNoOfTickets();
        System.out.println("Available Tickets: " + available_tickets);
        
        calculate_booking_cost(10);
    }
    
    public void cancelBooking(int bookingId,int num_tickets) {
    	Event e=new Event();
        if (this.booking_id == bookingId) {
            e.setAvailable_seats(e.getAvailable_seats() + num_tickets);
            System.out.println(num_tickets + " tickets cancelled successfully.");
        } else {
            System.out.println("Invalid booking ID. Unable to cancel tickets.");
        }
    }
    public static int getAvailableNoOfTickets() {
        Event e = new Event();
        return e.getAvailable_seats();
    }

    public static void calculate_booking_cost(int num_tickets) {
        Event e = new Event();
        double ticket_price = e.getTicket_price();
        double total_cost = ticket_price * num_tickets;
        System.out.println("Total Cost for " + num_tickets + " tickets: " + total_cost);
    }
		
}
