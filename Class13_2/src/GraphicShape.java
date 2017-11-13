
public interface GraphicShape {
	String getShapName();
	double ShapePerimeter();
	double ShapeArea();
	String PrintShapeIn();
	int setPosition(int Insys);
	default void printAbout() { System.out.println("Graphic 1.0");}
	//public double Area;

}
