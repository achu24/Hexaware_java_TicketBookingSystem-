package Task_4;

public class Venue {
	String venue_name;
	String address;
	Venue(){
		
	}
	Venue(String venue_name, String address){
		this.venue_name=venue_name;
		this.address=address;
	}
	public String getVenue_name() {
		return venue_name;
	}
	public void setVenue_name(String venue_name) {
		this.venue_name = venue_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void display_venue_details() {
		System.out.println("Venue name: "+venue_name+"Address: "+address);
	}
	

}
