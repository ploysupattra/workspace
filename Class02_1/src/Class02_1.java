import javax.swing.JOptionPane;

public class Class02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] myInt = new int[10];
		//myInt[5] = 20;
		String[] box = new String[5];
		box[3] = "Hello";
		//System.out.println(myInt[5] + box[3]);
		String user_input = JOptionPane.showInputDialog("Input :");
		if(user_input.equals(box[3]))
			//System.out.println("Welcome");
		JOptionPane.showMessageDialog(null, "Welcome");
	}

}
