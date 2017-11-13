
public class Rectangle extends Shape2D {
	
	public double width;
	public double height;
	
	public Rectangle(double width, double height, String color) {
		// TODO Auto-generated constructor stub
		super(color);
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		area = width*height;
		return area;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		perimeter = (width*2) + (height*2);
		return perimeter;
	}

	@Override
	void printShapeInfo() {
		// TODO Auto-generated method stub
		String info = "Width = " + this.width + " Height = " + this.height 
				+ " Area = " + this.area + " Perimeter = " + this.perimeter;
		System.out.println(info);
	}
	
	

}
