import javax.swing.JOptionPane;

public class Home3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double w = 0 , h =0,r = 0,b = 0,area1 = 0,area2 = 0,area3 = 0;
		//input number
		String in = JOptionPane.showInputDialog("Enter number 1,2 or3:");
		int n = Integer.parseInt(in);
		//1.สีเหลี่ยม w*h
		//2.วงกลม pi *r*r
		//3.สามเหลี่ยม 1/2*b*h
		switch (n) {
		case 1:
			String inw = JOptionPane.showInputDialog("Enter w :");
			String inh = JOptionPane.showInputDialog("Enter h :");
			w = Integer.parseInt(inw);
			h = Integer.parseInt(inh);
			area1 = w*h;
			JOptionPane.showMessageDialog(null, area1 ,"Area 1",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 2:
			String inr = JOptionPane.showInputDialog("Enter r :");
			r = Integer.parseInt(inr);
			area2 = Math.PI*Math.pow(r, 2);
			JOptionPane.showMessageDialog(null, area2,"Area 2",JOptionPane.INFORMATION_MESSAGE);
			break;
		case 3:
			String inb = JOptionPane.showInputDialog("Enter b :");
			String ih = JOptionPane.showInputDialog("Enter h :");
			b=Integer.parseInt(inb);
			h=Integer.parseInt(ih);
			area3 = (1/2)*b*h;
			JOptionPane.showMessageDialog(null, area3,"Area 3",JOptionPane.INFORMATION_MESSAGE);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Shape not supported");
			break;
		}
		
	}


}
