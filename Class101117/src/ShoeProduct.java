
public class ShoeProduct extends Product {
	public double size; public String Color;
	public ShoeProduct(String Proname,String Color,double size,int stockAmount) {
		this.Proname=Proname; this.Color=Color;this.size=size; this.stockAmount=stockAmount; 
	} 
	@Override public void ProductDetail() {super.ProductDetail(); System.out.println("shoe sive"+this.size);}
	@Override public void emptyStock() {super.emptyStock();}
	
}
