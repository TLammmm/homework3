package oop6_1;

public class Rectangle extends Shape {

	private double width=1;
	private double length=1;
	public Rectangle() {
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, Boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	

	public Rectangle(String color, Boolean filled) {
		super(color, filled);
	}

	@Override
	public double getArea() {
		return getLength()*getWidth();
	}
	@Override
	public double getPerimeter() {
		return 2*(getLength()+getWidth());
	}

	@Override
    public String toString() {
        return "Rectangle[" + super.toString() + "width=" + width + ", length=" + length + "]";
    }

	
}
