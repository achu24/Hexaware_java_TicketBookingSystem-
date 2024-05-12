package Task_5;

public class Concert extends Event {
	
	String artist; 
	String type;

	Concert(){
		
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

	public void  display_concert_details(){
		super.display_concert_details();
		System.out.println("Concert [artist=" + artist + ", type=" + type + "]");

	}
	
}
