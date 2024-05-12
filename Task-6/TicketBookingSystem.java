package Task_6;
import java.util.*;
public class TicketBookingSystem extends BookingSystem {
    private List<Event> events;

    public TicketBookingSystem() {
        this.events = new ArrayList<>();
    }

    public Event create_event(String event_type, String event_name, String date, String time,
                              String venue_name, int total_seats, double ticket_price,
                              String attribute1, String attribute2, String attribute3) {
        Event event = null;

        switch (event_type.toLowerCase()) {
            case "concert":
                event = new Concert(event_name, date, time, venue_name, total_seats, total_seats,
                                    ticket_price, event_type, attribute1, attribute2);
                break;
            case "movie":
                event = new Movie(event_name, date, time, venue_name, total_seats, total_seats,
                                  ticket_price, event_type, attribute1, attribute2, attribute3);
                break;
            case "sports":
                event = new Sports(event_name, date, time, venue_name, total_seats, total_seats,
                                   ticket_price, event_type, attribute1, attribute2);
                break;
            default:
                System.out.println("Invalid event type: " + event_type);
        }

        if (event != null) {
            events.add(event); 
        }

        return event;
    }

    public Event find_event(String event_type, String event_name) {
        for (Event event : events) {
            if (event.getEvent_type().equalsIgnoreCase(event_type) &&
                event.getEvent_name().equalsIgnoreCase(event_name)) {
                return event;
            }
        }
        return null; 
    }

    public void display_event_details(Event event) {
        if (event != null) {
            event.display_event_details();
        } else {
            System.out.println("Event not found.");
        }
    }

    public double book_tickets(Event event, int num_tickets) {
        if (event != null) {
            return event.book_tickets(num_tickets);
        } else {
            System.out.println("Event not found.");
            return 0.0;
        }
    }

    public void cancel_tickets(Event event, int num_tickets) {
        if (event != null) {
            event.cancel_booking(num_tickets);
        } else {
            System.out.println("Event not found.");
        }
    }

}