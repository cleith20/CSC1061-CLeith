import java.util.ArrayList;
import java.util.List;

public class TestGeometricObject {

	public static void main(String[] args) {
		Circle circle = new Circle("Mint", true, 4.0);
		GeometricObject geo = new GeometricObject();
		Rectangle rectangle = new Rectangle("Yellow", true, 3.3, 4.4);
		
		List<GeometricObject> shapes = new ArrayList<>();
		shapes.add(geo);
		shapes.add(circle);
		shapes.add(rectangle);
		
		for(GeometricObject object : shapes) {
			System.out.println(object);
			System.out.println();
		}
		
		System.out.println("Area of circle = " + circle.getArea());
		System.out.println("Perimeter of rectangle = "+ rectangle.getPerimeter());
		
		int radius = 5;
		System.out.println("A circle with radius " + radius +" will have area " + Circle.getArea(radius));
		System.out.println();
		
		Database db = new Database();
		for(GeometricObject object : shapes) {
			db.write(object);
		}
		GeometricObject ob = db.readObject();
		System.out.println(ob);
	}

}
