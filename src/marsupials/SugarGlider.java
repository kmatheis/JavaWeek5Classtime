package marsupials;

import mammals.Pet;

public class SugarGlider extends Pet {
	
	public String coloring;
	
	public SugarGlider( String name, int age, String owner, String coloring ) {
		this.name = name;
		this.age = age;
		this.owner = owner; // problem when owner in Pet has no qualification
		this.coloring = coloring;
	}
	
//	@Override
//	public void speak() {
//		System.out.println( "bark!" );   // c/c bark
//	}
//	
//	public void speak( boolean isHappy ) {
//		if ( isHappy ) {
//			System.out.println( "chirpnibblechirp" );
//		} else {
//			System.out.println( "CrabCrabCrab!" );
//		}
//	}
}
