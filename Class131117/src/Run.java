
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle newRec = new Rectangle("Yellow");
		System.out.println("Rec Color :"+newRec.color);
		Shap2D.printDim();
		Triangle newTri = new Triangle(1, 4, 10.25, 5.5);
		System.out.println(newTri.color);
		
	}

}
