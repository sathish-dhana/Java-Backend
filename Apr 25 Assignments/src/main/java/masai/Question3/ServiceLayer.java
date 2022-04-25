package masai.Question3;

public class ServiceLayer {
	
	public int AreaOfSquare(int side) {
		return side * side;
	}
	
	public int AreaOfRectangle(int length, int breadth) {
		return length * breadth;
	}
	
	public double AreaOfTriangle(int height, int length) {
		return (height * length) / 2;
	}
	
	public double AreaOfCircle(int radius) {
		return 3.14 * (radius * radius);
	}
}
