package shapes;

public abstract class Shape {

	double x;
	double y;
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public void reportPos() {
		System.out.println( "I am at position " + x + ", " + y );
	}
}
