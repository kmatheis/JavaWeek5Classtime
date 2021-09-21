package mammals;

import app.Introducer;

public class Pet {

	public String name;
	public int age;
	protected String owner;
	
	public Pet() {
	}
	
	public Pet( String name, int age, String owner ) {
		this.name = name;
		this.age = age;
		this.owner = owner;
	}
	
	public void speak() {
		System.out.println( "Yawp!" );
	}
	
	public void info() {
		System.out.println( name + " - " + age + " - " + owner );
	}

//	@Override
//	public void introduce() {
//		System.out.println( "Hello, my name is " + name );
//	}
	
}
