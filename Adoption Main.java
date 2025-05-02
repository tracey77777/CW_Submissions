/**
 * made by Tracey Ly on April 29th for inheritance 
 */
public class Adoption_Main 
{

	public static void main(String[] args) 
	{
		//making a dog
		Dog bigbertha = new Dog (24, "Big Bertha", true);
		//checking the adoption attribute
		System.out.println(bigbertha.getAdoptionStatus());
		//making a puppy
		Puppy_Dog bertha = new Puppy_Dog (1, "Bertha", true, true);
		//checking the adoption attribute
		System.out.println(bertha.getAdoptionStatus());
		//checking age
		bigbertha.stateAge();
		bertha.stateAge();
		//checking if the age gets a year or month added
		bigbertha.increaseAge();
		bertha.increaseAge();
		//checking age again
		bigbertha.stateAge();
		bertha.stateAge();
		//checking everything about the animals
		System.out.println(bigbertha);
		System.out.println(bertha);
		//spacing
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		
		//new puppy
		Puppy_Dog pup = new Puppy_Dog (1, "Bertha", true, true);
		System.out.println(pup.getAdoptionStatus());
		pup.stateAge();
		pup.increaseAge();
		pup.stateAge();
		System.out.println(pup);
		//testing if the computer can tell the difference between the old and new puppy even with the same everything
		System.out.println(bertha.equals(pup));
		
		
		
	}

}
