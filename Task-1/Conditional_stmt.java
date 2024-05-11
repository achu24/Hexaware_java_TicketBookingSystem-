import java.util.Scanner;

public class Conditional_stmt {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter available tickets: ");
        int availableTicket = sc.nextInt();
        
        System.out.print("Enter number of tickets to book: ");
        int noOfTicket = sc.nextInt();

        
        if(noOfTicket <= availableTicket) {
            int remainingticket =availableTicket - noOfTicket;
            System.out.println("Tickets booked successfully. Remaining tickets: " + remainingticket);
        } else {
            System.out.println("Tickets unavailable. Available tickets: " + availableTicket);
        }
    }

}
