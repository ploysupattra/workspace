
public class UserManager {
	User[] users ;
	public void showDetail() {
		for(int p=0; p<50; p++) {
			if(users[p]==null) { break; }
			System.out.println(p);
		}	
	}
	public UserManager() {
		users = new User[50];
	}
	public void create(String username) {
		for(int i=0; i<50; i++) {
			if(users[i]==null) { users[i]= new User(username); break; }
		}
	}
}
