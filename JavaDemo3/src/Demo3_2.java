import javax.swing.JOptionPane;

public class Demo3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[100];
		double sum =0.0;
		int max=0,min=0;
		for(int i=0 ; i<num.length; i++)
		{ 
			String inputnum = JOptionPane.showInputDialog("Input Number");
			if (inputnum.equals("Stop")) {  JOptionPane.showMessageDialog(null, "��ش���ǹ�ٻ�����ʴ���"); break; }
			//if() {}
			else { int outnum = Integer.parseInt(inputnum);
					sum=sum+outnum;
					if(outnum<0) { JOptionPane.showMessageDialog(null, "Error System"); continue; }
					if(i==0) { max=outnum; min=outnum;}
					if(outnum>max) {max=outnum;}
					if(outnum<min) {min=outnum;}					
			}
		}
		
		double average = sum/num.length;
		JOptionPane.showMessageDialog(null, sum ,"�����",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, average,"��������",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, max,"����٧�ش",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, min,"��ҵ���ش",JOptionPane.INFORMATION_MESSAGE);
		
	}

}
