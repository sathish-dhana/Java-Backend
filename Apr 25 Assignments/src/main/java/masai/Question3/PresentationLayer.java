package masai.Question3;

public class PresentationLayer {
	ServiceLayer areaCalculator;
	
	public void setAreaCalculator(ServiceLayer areaCalculator) {
		this.areaCalculator = areaCalculator;
	}
	
	public void printAreaOfSquare(int side) {
		int area = areaCalculator.AreaOfSquare(side);
		System.out.println("Area of a Square : " + area);
	}
	
	public void printAreaOfRectangle(int length, int breadth) {
		int area = areaCalculator.AreaOfRectangle(length, breadth);
		System.out.println("Area of a Rectangle : " + area);
	}
	
	public void printAreaOfTriangle(int height, int length) {
		double area = areaCalculator.AreaOfTriangle(height, length);
		System.out.println("Area of a Traingle : " + area);
	}
	
	public void printAreaOfCircle(int radius) {
		double area = areaCalculator.AreaOfCircle(radius);
		System.out.println("Area of a Circle : " + area);
	}
}
