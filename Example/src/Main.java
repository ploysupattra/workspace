
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory fac = new ShapeFactory();
		GraphicShape shape1 = fac.createShape("rectangle", "orange");
		GraphicShape shape2 = fac.createShape("triangle", "green");
		System.out.println(shape1.getShapeName());
		System.out.println(shape2.getShapeName());
	}

}
