package Task_6;

public class Concert extends Event {
	
	String artist; 
	String type;

	Concert(){
		artist="Anirudh"; 
		type="Music";
		
	}
	
	Concert(String event_name, String event_date, String event_time, String venue_name, int total_seats,int available_seats, double ticket_price, String event_type,String artist, String type){
		
		super(event_name,event_date,event_time,venue_name,total_seats,available_seats,ticket_price,event_type);
		this.artist=artist;
		this.type=type;

	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	@Override
	public String toString() {
		return super.toString()+"Concert [artist=" + artist + ", type=" + type + "]";
	}

	public void  display_event_details(){
		System.out.println("Event Name: " + event_name);
        System.out.println("Event Date: " + event_date);
        System.out.println("Event Time: " + event_time);
        System.out.println("Venue Name: " + venue_name);
        System.out.println("Total Seats: " + total_seats);
        System.out.println("Available Seats: " + available_seats);
        System.out.println("Ticket Price: $" + ticket_price);
        System.out.println("Event Type: " + event_type);
		System.out.println("Concert [artist=" + artist + ", type=" + type + "]");

	}
	
}
