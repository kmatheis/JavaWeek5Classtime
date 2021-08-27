package app;

public class Invader {

//	public boolean[][] bitmap1;
//	public boolean[][] bitmap2;
//	public boolean[][] bitmap3;
//	public boolean[][] bitmap4;
	
	public char symbol;
	
	public int worth;
	
	private int x;
	private int y;  // Cartesian coordinates
	
	public boolean movingLeft; 
	public boolean movingRight;  // both cannot be true at same time, but both can be false
	
	public static int numInvaders = 0;
	
	public Invader( int posX, int posY, int points, char symbol ) {
		this.x = posX;
		this.y = posY;
		this.worth = points;
		this.symbol = symbol;
		
		this.movingLeft = false;
		this.movingRight = false;  // start by standing still
		numInvaders++;
	}
	
	public void setInitialDirection() {
		this.movingLeft = false;
		this.movingRight = true;
	}
	
	public void descend() {
		if ( y > 0 ) {
			y = y - 1; 
		}
		if ( movingLeft || movingRight ) {
			movingLeft = !movingLeft;
			movingRight = !movingRight;
		}
	}
	
	// Moves invaders either left or right, and returns true when hits edge of screen
	//   so that the primary loop can capture this and call descend() on all the invaders.
	public boolean tick() {
		if ( movingLeft && x > 0 ) {
			x = x - 1;
		} else if ( movingRight && x < 39 ) {
			x = x + 1;
		}
		if ( x == 0 || x == 39 ) {
			return true;
		}
		return false;
	}
	
	public static void reportInvaders() {
		System.out.println( numInvaders );
	}
	
	
	
	
	
	
	// Example getters and setters:
	
	public int getX() {
		return x;
	}
	
	public void setX( int newX ) {
		x = newX;
	}
	
//	public void slideLeft() {
//		x = x - 5;
//	}
	
	public int getY() {
		return y;
	}
	
	public void setY( int newY ) {
		y = newY;
	}
}
