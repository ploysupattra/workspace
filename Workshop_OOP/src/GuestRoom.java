
public class GuestRoom {

	public int RoomID;
	public double RoomPrice;
	private String RoomBD;
	private int RoomStan;
	
	public GuestRoom(int RoomID,double RoomPrice) {
		this.RoomID=RoomID; this.RoomPrice=RoomPrice;
		this.RoomBD=null; this.RoomStan=0;
		
	}
	
	//Calculate discount price
	//discountPC --> priceAfter
	public double getRoomDiscount(double discountPC) {
		double priceAfter = this.RoomPrice-((discountPC/100)*this.RoomPrice);
		return priceAfter; 
	}
	
	public void reserveRoom(String RoomBD,int RoomStan) {
		this.RoomBD=RoomBD;
		this.RoomStan=RoomStan;
	}  

	public boolean getRoomser() {
		if(this.RoomBD==null) {return false;}
		else {return true;}
	}
}
