
public class Product {
	public String Proname;public double Price;public int stockAmount;
	public Product() {Proname=null;}
	public Product(String Proname) {this.Proname=Proname;}
	public void emptyStock() { stockAmount=0; }
	public void ProductDetail() {System.out.println(Proname+Price+stockAmount);}
	
}
