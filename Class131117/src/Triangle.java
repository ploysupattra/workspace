
public class Triangle extends Shap2D {

	@Override double CalculArea() { return 0;}
	public double Base;
	public double height;
	//public double rightSide;
	public Triangle (double Area,double Perimeter,double Base,double height) {
		//double rightSide = new double();
		Area = 0.5*Base*height;
		return ;
	}
	public void CalculPerime(double Perimeter,double Base,double height) {
		double rightSide = Math.sqrt(Math.pow(height, 2)+Math.pow(Base,2));
		Perimeter = rightSide+Base+height;
		return;
	}

}
