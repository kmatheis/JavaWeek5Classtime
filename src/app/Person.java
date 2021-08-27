package app;

public class Person implements Comparable<Person> {

	public String name;
	public int age;
	private int ssn = 0; 
	
	public Person() {
		name = "";
		age = 0;
	}
	
	public Person( String n, int a ) {
		name = n;
		age = a;
	}
	
	public void print() {
		System.out.println( "Person " + name + " is " + age + " years old." );
	}

	@Override
	public int compareTo( Person p ) {
//		if ( p instanceof Person ) {
//			return 0;
//		}
		return name.toLowerCase().compareTo( p.name.toLowerCase() );
	}
}

