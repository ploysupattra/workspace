//import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Demo3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		double sum =0.0;
		int max=0,min=0;
		for(int i=0 ; i<num.length; i++)
		{ 
			String inputnum = JOptionPane.showInputDialog("Input Number");
			int outnum = Integer.parseInt(inputnum);
			sum=sum+outnum;
			if(i==0) { max=outnum; min=outnum;}
			if(outnum>max) {max=outnum;}
			if(outnum<min) {min=outnum;}
		}
		double average = sum/num.length;
		JOptionPane.showMessageDialog(null, sum);
		JOptionPane.showMessageDialog(null, average);
		JOptionPane.showMessageDialog(null, max);
		JOptionPane.showMessageDialog(null, min);
		//�ó��� for
		//for(int i=1; i<=num; i++) { sum = sum+i;}		

	}

}
