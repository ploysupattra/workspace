
public class MenuItem {
	
	public int itemID;
	public String MenuN;
	public String Category;
	public double Price;
	public MenuItem(int itemID,String Category,String MenuN,double Price) 
	{ this.itemID=itemID; this.Category=Category; this.MenuN=MenuN; this.Price=Price;	}
	public MenuItem(int itemID,String Category) 
	{ this.itemID=itemID; this.Category=Category; this.MenuN=""; this.Price=30;	}

	public double increasePrice(double percent) {
		double disPrice = this.Price+((percent/100)*this.Price);
		return disPrice;
	}
	public void displayMenuDetail(){
		System.out.println(itemID);
		System.out.println(MenuN);
		System.out.println(Category);
		System.out.println(Price);
	}
	
}
