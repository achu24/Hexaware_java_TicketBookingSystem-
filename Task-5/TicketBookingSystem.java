package Task_5;
import java.util.*;
public class TicketBookingSystem {
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

    
    
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n====== Ticket Booking System Menu ======");
            System.out.println("1. Book Tickets");
            System.out.println("2. View Event Details");
            System.out.println("3. Cancel Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 1:
                System.out.println("\n=== Book Tickets ===");
                System.out.print("Enter event type (movie, concert, sports): ");
                String eventType = scanner.nextLine();
                System.out.print("Enter event name: ");
                String eventName = scanner.nextLine();
                System.out.print("Enter date (yyyy-mm-dd): ");
                String date = scanner.nextLine();
                System.out.print("Enter time: ");
                String time = scanner.nextLine();
                System.out.print("Enter venue name: ");
                String venueName = scanner.nextLine();
                System.out.print("Enter total seats: ");
                int totalSeats = scanner.nextInt();
                System.out.print("Enter ticket price: ");
                double ticketPrice = scanner.nextDouble();
                scanner.nextLine(); 

                String attribute1 = "";
                String attribute2 = "";
                String attribute3 = "";

                if (eventType.equalsIgnoreCase("movie")) {
                    System.out.print("Genre: ");
                    attribute1 = scanner.nextLine();
                    System.out.print("Actor Name: ");
                    attribute2 = scanner.nextLine();
                    System.out.print("Actress Name: ");
                    attribute3 = scanner.nextLine();
                } 
                else if (eventType.equalsIgnoreCase("concert")) {
                    System.out.print("Artist: ");
                    attribute1 = scanner.nextLine();
                    System.out.print("Type: ");
                    attribute2 = scanner.nextLine();
                } 
                else if (eventType.equalsIgnoreCase("sports")) {
                    System.out.print("Sport Name: ");
                    attribute1 = scanner.nextLine();
                    System.out.print("Team Name: ");
                    attribute2 = scanner.nextLine();
                }

                Event newEvent = bookingSystem.create_event(eventType, eventName, date, time,
                                                            venueName, totalSeats, ticketPrice,
                                                            attribute1, attribute2, attribute3);
                if (newEvent != null) {
                    System.out.print("Enter number of tickets to book: ");
                    int numTickets = scanner.nextInt();
                    bookingSystem.book_tickets(newEvent, numTickets);
                }
                break;

                case 2:
                    System.out.println("\n=== View Event Details ===");
                    System.out.print("Enter event type (movie, concert, sports): ");
                    eventType = scanner.nextLine();
                    System.out.print("Enter event name: ");
                    eventName = scanner.nextLine();

                    Event existingEvent = bookingSystem.find_event(eventType, eventName);
                    bookingSystem.display_event_details(existingEvent);
                    break;

                case 3:
                    System.out.println("\n=== Cancel Tickets ===");
                    System.out.print("Enter event type (movie, concert, sports): ");
                    eventType = scanner.nextLine();
                    System.out.print("Enter event name: ");
                    eventName = scanner.nextLine();

                    existingEvent = bookingSystem.find_event(eventType, eventName);
                    if (existingEvent != null) {
                        System.out.print("Enter number of tickets to cancel: ");
                        int numTickets = scanner.nextInt();
                        bookingSystem.cancel_tickets(existingEvent, numTickets);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Ticket Booking System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}