import javax.swing.JOptionPane;

public class changprice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ipusd = JOptionPane.showInputDialog("Input Price Bath");
		//System.out.println(ipusd);
		float result = Float.parseFloat(ipusd);
		if (result <= 0 ) { 
		JOptionPane.showMessageDialog(null, "System Error","System Error",JOptionPane.ERROR_MESSAGE); } 
		else  {
		float changsud = (float)(Float.parseFloat(ipusd)/32.73);
		float changeur = (float)(Float.parseFloat(ipusd)/37.84);
		float changjpy = (float)(Float.parseFloat(ipusd)/28.35);
		JOptionPane.showMessageDialog(null, changsud, "Total USD Price", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, changeur, "Total USD Price", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, changjpy, "Total USD Price", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
