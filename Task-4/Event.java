package Task_4;
public class Event {
	String event_name;
	String event_date; 
	String event_time;
	String venue_name; 
	int total_seats;
	int available_seats; 
	double ticket_price; 
	String event_type;
	
	
	Event(){
		event_name="Movie Night";
		event_date="2024-05-01"; 
		event_time="18:00";
		venue_name="Cinema"; 
		total_seats=100;
		available_seats=10; 
		ticket_price=10.0; 
		event_type="Movie";
		
	}
	
	public Event(String event_name,String event_date,String event_time,String venue_name,int total_seats,int available_seats,double ticket_price,String event_type){
		this.event_name=event_name;
		this.event_date=event_date; 
		this.event_time=event_time;
		this.venue_name=venue_name; 
		this.total_seats=total_seats;
		this.available_seats=available_seats; 
		this.ticket_price=ticket_price; 
		this.event_type=event_type;
	}
		
	public String getEvent_name() {
		return event_name;
	}

	public void setEvent_name(String event_name) {
		this.event_name = event_name;
	}

	public String getEvent_date() {
		return event_date;
	}

	public void setEvent_date(String event_date) {
		this.event_date = event_date;
	}

	public String getEvent_time() {
		return event_time;
	}

	public void setEvent_time(String event_time) {
		this.event_time = event_time;
	}

	public String getVenue_name() {
		return venue_name;
	}

	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public int getAvailable_seats() {
		return available_seats;
	}

	public void setAvailable_seats(int available_seats) {
		this.available_seats = available_seats;
	}

	public double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(double ticket_price) {
		this.ticket_price = ticket_price;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}
	
	
	public double calculate_total_revenue(){
        return ticket_price * (total_seats - available_seats);
    }
	
	public int getBookedNoOfTickets() {
        return total_seats - available_seats;
    }
	
	
	public void book_tickets(int num_tickets){
	
		if (num_tickets <= available_seats) {
            available_seats -= num_tickets;
            System.out.println(num_tickets + " tickets booked successfully.");
        } 
		else {
            System.out.println("Not enough available seats to book " + num_tickets + " tickets.");
        }
	}
	
	public void cancel_booking(int num_tickets) {
        available_seats += num_tickets;                                            
        System.out.println(num_tickets + " tickets canceled successfully.");
			
        }
	
	public void display_event_details() {
		System.out.println("Event Name: " + event_name);
        System.out.println("Event Date: " + event_date);
        System.out.println("Event Time: " + event_time);
        System.out.println("Venue Name: " + venue_name);
        System.out.println("Total Seats: " + total_seats);
        System.out.println("Available Seats: " + available_seats);
        System.out.println("Ticket Price: $" + ticket_price);
        System.out.println("Event Type: " + event_type);
	}
	
}
	
