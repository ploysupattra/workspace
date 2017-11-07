package helloworld;

import javax.swing.JOptionPane;

public class hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String m="15"; 
		int p = 7;
		p++;
		int a = Integer.parseInt(m);
		*/
		String pp = JOptionPane.showInputDialog("hello");
		System.out.println(pp);
		JOptionPane.showMessageDialog(null, pp , "Your P", JOptionPane.INFORMATION_MESSAGE);
	}

}
