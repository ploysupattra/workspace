
public class RactangleShape implements GraphicShape {

	@Override public String getShapName() { return null;}
	@Override public double ShapePerimeter() { return 0; }
	@Override public double ShapeArea() { return 0; }
	@Override public String PrintShapeIn() { return null; }
	@Override public int setPosition(int Insys) {return 0;}
	//public double Area;
	public double Width;
	public double Height;
	public String Color;
	public RactangleShape(String Color) { this.Color=Color; }
}
