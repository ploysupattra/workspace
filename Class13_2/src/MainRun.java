
public class MainRun {

	public static void main(String[] args) {
		RactangleShape newRec = new RactangleShape(null);
		System.out.println("Perimeter :"+newRec);
		//System.out.println("Area"+newRec);
		newRec.printAbout();
		CicrleShape newCicr = new CicrleShape();
		System.out.println(newCicr);
		TriangleShape newTri = new TriangleShape(null);
		System.out.println(newTri);
	}

}
