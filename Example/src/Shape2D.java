
public abstract class Shape2D 
{
	public double area;
	public double perimeter;
	public String color;
	
	abstract double calculateArea();
	abstract double calculatePerimeter();
	abstract void printShapeInfo();
	
	public Shape2D() {
		this.color = "red";
	}
	public Shape2D(String color)
	{
		this.color = color;
	}
	public static void printDimension() {  
		System.out.println("Two Dimension");
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
}
