import javax.swing.JOptionPane;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fareheil = JOptionPane.showInputDialog("Plese Input Fareheil");
		System.out.println(fareheil);		
		float num1 = 5/9;
		float num2 = Float.parseFloat(fareheil);
		float num3 = num1 * num2;
		//float p = num1/num2;
		float centigrate = num3-32;
		JOptionPane.showMessageDialog(null, centigrate , "Total", JOptionPane.INFORMATION_MESSAGE);

	}

}
