
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuestRoom  room1 = new GuestRoom(1, 1500);
		GuestRoom  room2 = new GuestRoom(2,1750);
		room1.reserveRoom("10 Decembwr", 2);
		room2.reserveRoom("3 Jun 2016", 1);
		
		System.out.println(room1.RoomID +","+room1.RoomPrice +","+room1.getRoomser());
		System.out.println(room2.RoomID +","+room2.RoomPrice +","+room2.getRoomser());

	}

}
