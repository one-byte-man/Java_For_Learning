package OOP4;

public class ShapeTest {

	public static void main(String[] args) {
		
		Circle c = new Circle(2.5);
		Sphere s = new Sphere(3.5);
		
		System.out.println(c.getShapeName());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(s.getShapeName());
		System.out.println(s.getSurfaceArea());
		System.out.println(s.getVolume());

	}

}
