
public class ShapeFactor {
	GraphicShape createShape(String getShapName,String Color) {
		if(getShapName.equals("Triangle")) { return new TriangleShape(Color);}
		//if() {}
		return null;
	}
}
