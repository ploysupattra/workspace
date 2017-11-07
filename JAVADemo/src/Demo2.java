import javax.swing.JOptionPane;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipnum = JOptionPane.showInputDialog("Please Input Method");
		String ipnum2 = JOptionPane.showInputDialog("Please Input Method");
		System.out.println(ipnum);		
		System.out.println(ipnum2);		
		double triangle = (double) 0.5*(Double.parseDouble(ipnum)*Double.parseDouble(ipnum2));
		JOptionPane.showMessageDialog(null, triangle, "Area", JOptionPane.INFORMATION_MESSAGE);


	}

}
