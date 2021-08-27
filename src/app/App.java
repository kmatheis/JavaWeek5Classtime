package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import mammals.Cat;
import marsupials.SugarGlider;
import shapes.Shape;
import shapes.Square;

public class App {

	public static void draw( List<Invader> invaders ) {
		String h = "-".repeat( 42 );
		System.out.println( h );
		for ( int y = 9; y >= 0; y-- ) {
			String row = "|";
			for ( int x = 0; x <= 39; x++ ) {
				boolean found = false;
				for ( Invader inv : invaders ) {
					if ( inv.getX() == x && inv.getY() == y ) {
						row += inv.symbol;
						found = true;
					}
				}
				if ( !found ) {
					row += " ";
				}
			}
			row += "|";
			System.out.println( row );
		}
		System.out.println( h );
	}
	
	public static void invaderFlight() {
		// First, make some invaders
		List<Invader> invaders = new ArrayList<Invader>();
		// Game board is 40 wide x 10 high
		invaders.add( new Invader( 20, 9, 200, '*' ) );
		invaders.add( new Invader( 27, 9, 250, 'o' ) );
		
		for ( Invader inv : invaders ) {
			inv.setInitialDirection();
		}
		
		boolean shouldDescend = false;
		for ( int i = 0; i < 30; i++ ) {
			
			draw( invaders );
			try {
				Thread.sleep( 200 );
			} catch ( InterruptedException e ) {
				e.printStackTrace();
			}
			if ( shouldDescend ) {
				for ( Invader inv : invaders ) {
					inv.descend();
				}
				shouldDescend = false;
			} else {
				for ( Invader inv : invaders ) {
					shouldDescend = shouldDescend || inv.tick();
				}
			}
		}

		Invader.reportInvaders();
	}
	
	public static void main( String[] args ) {
		//// "Why bother with OOP in the first place?" discussion.
		
		// invaderFlight();
		
		//// class vs. object		

		//// instance var naming vs. constructor parameter naming, instance methods vs. class methods (static etc)
		
		//// public vs. private vs. protected vs. no specifie
		
//		Cat sunshine = new Cat( "Sunshine", 10, "Ken", "shorthair" );
//		sunshine.info();
//		sunshine.speak();
		
		// private: can refer to it only inside the class
		
		// demo: change Pet.owner to private: we have a problem in Cat
		
		// protected: subclasses (no matter where they are) can access the field/method
		//            also, anyone in your package can access the field/method
		
		// demo: change Pet.owner to protected: all will still work, but can't refer to sunshine.owner here in App.java
		
		// no-access specifier: "package-private", so only things in the package can refer to it; outside subclasses can't.
		
		// demo: remove Pet.owner's access specifier: Cat can refer to owner, but SugarGlider can't refer to owner.
		
//		SugarGlider iana = new SugarGlider( "Iana", 5, "Ken", "traditional" );
//		iana.info();
//		iana.speak();
		
		//// AEIP
		// A
		// E: (getters and setters on Invaders)
		// P: one kind: Cat and SugarGlider overriding speak()
		//    another form: overload SugarGlider.speak() to take an input
//		iana.speak( true );
		// I: ...
		
		
		//// Interfaces implemented by multiple objects (if just one, just make the methods part of the inheritance chain)
		// general idea first, then introduce abstract class
		
		// Shape a = new Shape( 12, 6 ); // Cannot do!
//		Square s = new Square( 5 );
//		System.out.println( s.area() );
//		System.out.println( s.perimeter() );

		// Now finally bring in Introducer and implement for Pet and Square
//		iana.introduce();
//		s.introduce();
		
		// Bonus fun: You can create collections based on interface implementers instead of classes:
//		List<Introducer> introducers = new ArrayList<Introducer>();
//		introducers.add( iana );
//		introducers.add( s );
//		for ( Introducer i : introducers ) {
//			i.introduce();
//		}
	}
}
