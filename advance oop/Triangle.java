package UseGeometric;

public class Triangle extends GeometricFigure{
	Triangle(int height, int width, String type){
		super(height, width, type);
	}
	
	@Override
	public double getArea() {
		return (super.getHeight() * super.getWidth())/2;
	}
}
