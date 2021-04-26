package UseGeometric; public abstract class GeometricFigure{
	private int height;
	private int width;
	private String type;
	
	GeometricFigure(){		
	}
	
	GeometricFigure(int height, int width, String type){
	this.height = height;
	this.width = width;
	this.type = type;
	}

	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public abstract double getArea();
}



