import java.util.Scanner;

public class Nested_conditional_statement {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ticket Options:");
	        System.out.println("1. Silver");
	        System.out.println("2. Gold");
	        System.out.println("3. Diamond");

	        System.out.print("Enter option: ");
	        int Option = scanner.nextInt();
	        System.out.print("Number of tickets to be booked: ");
	        int noOfTicket = scanner.nextInt();


	        double ticketPrice;
	        if (Option == 1) {
	            ticketPrice = 50.0; 
	        } else if (Option == 2) {
	            ticketPrice = 100.0; 
	        } else if (Option == 3) {
	            ticketPrice = 150.0; 
	        } else {
	            System.out.println("Invalid category.");
	            return;
	        }

	        double totalCost = ticketPrice * noOfTicket;

	        System.out.println("Total cost:Rs " + totalCost);
	    }

}
