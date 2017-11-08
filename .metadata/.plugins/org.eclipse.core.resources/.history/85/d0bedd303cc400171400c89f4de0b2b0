import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class home2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double usd = 32.73;
		double eur = 37.84;
		double jpy = 28.35;
		double calusd = 0;
		double caleur = 0;
		double caljpy = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		String in = JOptionPane.showInputDialog("Enter Baht :");
		double nBaht = Integer.parseInt(in);
		
		String intype = JOptionPane.showInputDialog("usd = 1,eur = 2 ,jpy = 3 : ");
		int check = Integer.parseInt(intype);
		switch (check) {
		case 1:
			calusd = Double.parseDouble(df.format(nBaht/usd));
			JOptionPane.showMessageDialog(null, calusd,"USD",JOptionPane.INFORMATION_MESSAGE);
			break;	
		case 2:
			caleur = Double.parseDouble(df.format(nBaht/eur));
			JOptionPane.showMessageDialog(null, caleur,"EUR",JOptionPane.INFORMATION_MESSAGE);
			break;		
		case 3:
			caljpy = Double.parseDouble(df.format(nBaht/jpy));
			JOptionPane.showMessageDialog(null, caljpy,"JPY",JOptionPane.INFORMATION_MESSAGE);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Currency not supported","Error",JOptionPane.ERROR_MESSAGE);
			break;
		}
				

	}
	

}
