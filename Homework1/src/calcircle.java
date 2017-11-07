import javax.swing.JOptionPane;

public class calcircle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipnum = JOptionPane.showInputDialog("Please Input Number");
		System.out.println(ipnum);		
		double area = (double) 2*(22/7)*Double.parseDouble(ipnum);
		double circum = (double) 22/7*(Double.parseDouble(ipnum)*Double.parseDouble(ipnum));
		JOptionPane.showMessageDialog(null, area, "Area", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, circum, "Area", JOptionPane.INFORMATION_MESSAGE);

	}
}
