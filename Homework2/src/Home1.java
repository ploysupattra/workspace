import java.util.Arrays;

import javax.swing.JOptionPane;

public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] number = new double[30];
		int[] eve = new int[30];
		int[] odd = new int[30];
		//int np=0;
		//int pp = 0;
		//double oddnum = 0.0;
		//double evenum = 0.0;
		for(int n=0; n<=number.length ; n++) {
			String input = JOptionPane.showInputDialog("Plese Input Number");
			if(input.equals("stop")) { JOptionPane.showMessageDialog(null, "Stop Input Number"); break; }
			else{
				double output = Double.parseDouble(input);
				//System.out.print(output);
				int opint = (int) output;
				//int[] eve = new int[30]; int[] odd = new int[30];
				//int pp = opint%2 ;
				if(opint%2==0) { eve[n] = opint; }
				else {  odd[n] = opint; }
			}
		}
		//System.out.println(Arrays.toString(eve));
		JOptionPane.showMessageDialog(null, Arrays.toString(eve),"eveNumber",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, Arrays.toString(odd),"oddNumber",JOptionPane.INFORMATION_MESSAGE);
		//System.out.println(Arrays.toString(odd));
		//JOptionPane.showMessageDialog(null, np,"eve",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, pp ,"odd",JOptionPane.INFORMATION_MESSAGE);

	}

}
