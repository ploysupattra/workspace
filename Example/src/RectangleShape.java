
public class RectangleShape implements GraphicShape, Positionable {
	
	public String color;
	
	public RectangleShape(String color) {
		// TODO Auto-generated constructor stub
		this.color = color;
	}

	@Override
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "RECTANGLE";
	}

	@Override
	public double getShapePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String printShapeInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPosition(int x) {
		// TODO Auto-generated method stub
		
	}

	

}
