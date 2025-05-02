
public class Puppy_Dog extends Dog
{
	//attribute
	private boolean isFed;
	//constructor
	public Puppy_Dog (int a, String n, boolean ad, boolean f)
	{
		super(a, n, ad);
		isFed = f;
	}
	//age
	public void stateAge()
	{
		System.out.println(name + " is " + age + " month(s) old.");
	}
	//if the puppy is fed
	public void feedPup(boolean f)
	{
		isFed = true;
	}
	//adds a month to age and will reset it's feeding status
	public void increaseAge()
	{
		super.increaseAge();
		isFed = false;
	}
	//checks if they're fed
	public String toString()
	{
		if(isFed)
		{
			return super.toString() + " I'm fed!";
		}
		return super.toString() + " I must be fed!";
	}
	//same as the dog but with the puppy and the extra attribute that only the puppies have
	public boolean equals (Puppy_Dog lilDawg)
	{
		if (super.equals(lilDawg) && this.isFed == lilDawg.isFed)
		{
			return true;
		}
		return false;
	}
	
	
	
}
