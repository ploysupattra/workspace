import javax.swing.JOptionPane;

public class UserManager {
	private static String[] pointuser = new String[50];
	public User[] user = new User[50];

	public void addUser() {
		String input_user;
		for (int i = 0; i < 50; i++) {
			if (pointuser[i] == null) {
				input_user = JOptionPane.showInputDialog("Input Username..");
				user[i] = new User(input_user);
				pointuser[i] = "user" + i;
				break;
			}
		}
	}

	public void showUserDetail() {
		String text = "";
		for (int i = 0; i < 50; i++) {
			if (pointuser[i] != null) { text += "USERNAME :"+user[i].username+" "+"PASS :" + user[i].password + "\n"; }
		}
		System.out.println(text);
		//JOptionPane.showMessageDialog(null, text);
	}

}
