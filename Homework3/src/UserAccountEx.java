
public class UserAccountEx {

	public static void main(String[] args) {
		String[] username = new String[5];
		username[0]="bob";username[1]="Alice";username[2]="John";
		String[] password = new String[5];
		password[0]="W9F1D1HL";password[1]="V4IJ6Z7F";password[2]="UV5WS4X7";		
		displayAllUsers(username,password);
		
		
	}
	
	//Part 2
	public static void displayAllUsers(String myusername[],String mypassword[]) {
		for(int i=0; i<myusername.length; i++) {
			if(myusername[i]!=null) { System.out.println(myusername[i]+mypassword[i]); }
		}		
		
	}
	
	//Part 3
	public static void checkExistingUser(String myusername,String mypassword) {
		
	}

}
