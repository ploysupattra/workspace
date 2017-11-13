
public interface GraphicShape {
	String getShapeName();
	double getShapePerimeter();
	String printShapeInfo();
	
	static void printAbout()
	{
		System.out.println("Graphic Shape 1.0");
	}
}
