package OOP4;

public class Sphere extends Shape3D{

	private final double PI = Math.PI;
	private double radius;
	
	public Sphere(double radius) {
		super("Sphere");
		this.radius = radius;
	}
	
	@Override
	public double getSurfaceArea() {
		return radius*radius*PI*4;
	}
	@Override
	public double getVolume() {
		return (4.0f/3.0f)*PI*radius*radius*radius;
	}
	
	public double gerRadius() {return radius;}
}
