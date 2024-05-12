package Task_6;

public class Sports extends Event {
	
	String sportName; 
	String teamsName;
	Sports(){
		sportName="Tennis"; 
		teamsName="India";
		
	}
	Sports(	String event_name, String event_date, String event_time, String venue_name, int total_seats,int available_seats,double ticket_price,String event_type,String sportName,String teamsName){
		super(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price,event_type);
		this.sportName=sportName;
		this.teamsName=teamsName;
	}
	public String getSportName() {
		return sportName;
	}
	public void setSportName(String sportName) {
		this.sportName = sportName;
	}
	public String getTeamsName() {
		return teamsName;
	}
	public void setTeamsName(String teamsName) {
		this.teamsName = teamsName;
	}

	@Override
	public String toString() {
		return super.toString()+"Sports [sportName=" + sportName + ", teamsName=" + teamsName + "]";
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
		System.out.println("Sports [sportName=" + sportName + ", teamsName=" + teamsName + "]");
	}
	

}
