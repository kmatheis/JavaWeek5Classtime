package shapes;

import app.Introducer;

public class Square extends Shape {

	public double sideLength;
	
	public Square( double sideLength ) {
		this.sideLength = sideLength;
	}

	@Override
	public double area() {
		return sideLength * sideLength;
	}

	@Override
	public double perimeter() {
		return sideLength * 4;
	}

//	@Override
//	public void introduce() {
//		System.out.println( "Hi, I am a square with side length " + sideLength );
//	}

}
