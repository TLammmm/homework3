package oop6_1;

public class Circle extends Shape{

	private double radius;
	
	
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public Circle(String color, Boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	@Override
	public double getArea() {	
		return getRadius()*getRadius()*3.14;
	}
	@Override
	public double getPerimeter() {
		return 2*getRadius()*3.14;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
    public String toString(){
        return "Circle[" + super.toString() + "radius=" + radius + "]";
    }

	

}
