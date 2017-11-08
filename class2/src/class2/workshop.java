package class2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class workshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String p = JOptionPane.showInputDialog("Plese input baht");
		double nn = Double.parseDouble(p);
		String pp = JOptionPane.showInputDialog("Plese input type");
		double b = exchange(nn, pp);
		
		
	}
	
	public static double exchange(double baht, String type) 
	{
		double usd = 32.73;
		double eur = 37.84;
		double jpy = 28.35;
		double calusd = 0;
		double caleur = 0;
		double caljpy = 0;
		
		if(type.equals("usd"))
		{
			double m = baht/usd;
			return m;
		}	
		
		return 0.0;
	}

}
