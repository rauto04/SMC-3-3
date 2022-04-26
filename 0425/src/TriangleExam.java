
public class TriangleExam {

	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 12.7);
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());
		tr.setSize(7.5, 9.2);
		System.out.println("º¯°æµÈ »ï°¢ÇüÀÇ ³ÐÀÌ: " + tr.getArea());
	}
}

class Triangle {
	double bottom;
	double height;
	public Triangle(double bt, double hg) {
		this.bottom = bt;
		this.height = hg;
	}
	
	public void setSize(double bt, double hg) {
		this.bottom = bt;
		this.height = hg;
	}
	
	public double getArea() {
		return bottom * height / 2;
	}
}


