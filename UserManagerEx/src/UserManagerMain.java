
public class UserManagerMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserManager userObject = new UserManager();
		for(int i=1; i<=3;i++) {
			userObject.addUser();
			userObject.showUserDetail();
		}
		
	}

}