
import javax.swing.JOptionPane;

public class MenuEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuItem[] TableMenu = new MenuItem[4];
		for(int p=0; p<TableMenu.length; p++) {
			String menuName = JOptionPane.showInputDialog("Ples Input Menu");
			String price = JOptionPane.showInputDialog("Plese Input Price");
			double outprice = Double.parseDouble(price);
			TableMenu[p] = new MenuItem(p+1,menuName,"food",outprice); 
		}
		for(int p=0; p<TableMenu.length; p++) { TableMenu[p].displayMenuDetail();}
		TableMenu[2].increasePrice(10); TableMenu[3].increasePrice(20);
		for(int m=0; m<TableMenu.length; m++) { TableMenu[m].increasePrice(m); }
	}

}
