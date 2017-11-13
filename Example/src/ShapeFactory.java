
public class ShapeFactory {
	
	GraphicShape createShape(String shapename, String color) {
		if(shapename.equalsIgnoreCase("triangle"))
		{
			return new TriangleShape(color);
		}
		else if(shapename.equalsIgnoreCase("rectangle"))
		{
			return new RectangleShape(color);
		}
		else return null;
	}
}
