import javax.swing.JOptionPane;

public class class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		String inputnum = JOptionPane.showInputDialog("Plese Input Number");
		int num = Integer.parseInt(inputnum);
		int sum = 0;
		//�ó��� for
		//for(int i=1; i<=num; i++) { sum = sum+i;}
		
		//�ó��� while
		int p=1;
		while( p<=num) {sum = sum+p;
		if(sum>5)break;  p++;}
		
		JOptionPane.showMessageDialog(null,sum);
		
	}

}
