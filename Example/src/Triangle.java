
public class Triangle extends Shape2D {
	
	double base, height;
	double right_side;
	
	public Triangle(double base, double height, String color) {
		// TODO Auto-generated constructor stub
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		area =  0.5*base*height;
		return area;
	}

	@Override
	double calculatePerimeter() {
		// TODO Auto-generated method stub
		double right_side 
		= Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));
		perimeter = right_side + base + height;
		return perimeter;
	}

	@Override
	void printShapeInfo() {
		// TODO Auto-generated method stub
		String info = "Base = " + this.base + " Height = " + this.height 
				+ " Area = " + this.area + " Perimeter = " + this.perimeter;
		System.out.println(info);
	}

}
