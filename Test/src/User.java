
public class User {
	public String username;
	public String password;
	public User(String username) { this.username=username; this.password=Randompass();}
	//function random password
	public String Randompass() {
		String Seed = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		String p ="";
		for(int n=0; n<8; n++) {
			int numran = (int)(Math.random()*Seed.length());
			p = p+Seed.charAt(numran); }
		return p ;
	}
	public void showUserDetail() {
		System.out.println("User :"+this.username+""+"Pass :"+this.password);
	}
}
