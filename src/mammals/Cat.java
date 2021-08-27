package mammals;

public class Cat extends Pet {

	public String breed;
	
	public Cat( String name, int age, String owner, String breed ) {
		this.name = name;
		this.age = age;
		this.owner = owner;
		this.breed = breed;
	}
	
//	@Override
//	public void speak() {
//		System.out.println( "meow" );
//	}
	
}
