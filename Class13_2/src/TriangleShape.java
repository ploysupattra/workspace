
public class TriangleShape implements GraphicShape {

	@Override public String getShapName() {return "Triangle";}
	@Override public double ShapePerimeter() {return 0;}
	@Override public double ShapeArea() {
	 //Area=0.5*Base*Height;	
	 return 0;}
	@Override public String PrintShapeIn() {return null;}
	@Override public int setPosition(int Insys) {return 0;}
	public double Area;
	public double Base;
	public double Height; 
	public String Color;
	public TriangleShape(String Color) { this.Color=Color;}
	

}
