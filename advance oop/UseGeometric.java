package UseGeometric;

public class UseGeometric {
	public static void main (String[] args) {
		Square square = new Square(5,5, "Square");
		
		System.out.println(square.toString());
		Triangle triangle = new Triangle (5,5, "Triangle");
		
		System.out.println(triangle.toString());
		Square square1 = new Square(10,10, "Square");
		
		System.out.println(square1.toString());
		Triangle triangle1 = new Triangle(10,10, "Triangle");
		
		System.out.println(triangle1.toString());
	}
}
	
