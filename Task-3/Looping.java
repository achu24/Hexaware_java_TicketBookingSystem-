import java.util.*;
public class Looping {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int input;
        
        int bookedTicket;
        double totalCost;
        double ticketPrice=0.0;
        while (true) {
            System.out.println("Ticket Options:");
            System.out.println("1. Silver");
            System.out.println("2. Gold");
            System.out.println("3. Diamond");
            System.out.println("4. Exit");
            System.out.print("Enter options : ");
            input = sc.nextInt();
            if(input==4) {
                System.out.print("terminating");
            	break;
            }

           
            if(input >3) {
            	System.out.println("Invalid ticket category. Please Enter valid categorty .");
            	continue;
            }
            
            System.out.print("Enter number of tickets to book: ");
            bookedTicket = sc.nextInt();
   
            if (input == 1) {
                ticketPrice = 50.0; 
            } 
            else if (input == 2) {
                ticketPrice = 100.0; 
            } 
            else if (input == 3) {
                ticketPrice = 150.0; 
            }

            totalCost = ticketPrice*bookedTicket;
            System.out.println("Total cost of tickets: $" + totalCost);
            	
        }
       
    }

}
