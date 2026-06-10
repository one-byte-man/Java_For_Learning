package OOP4;

public class Circle extends Shape2D{
	
	private final double PI = Math.PI;
	private double radius;
	
	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*PI;
	}
	@Override
	public double getPerimeter() {
		return 2*radius*PI;
	}
	
	public double gerRadius() {return radius;}
}
