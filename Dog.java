
public class Dog 
{
	//attributes
	protected int age;
	protected String name;
	protected boolean isAdopted;
	//constructors
	public Dog (int a, String n, boolean ad)
	{
		age = a;
		name = n;
		isAdopted = ad;
	}
	//will check if dog is adopted
	public boolean getAdoptionStatus()
	{
		return isAdopted;
	}
	//will state dog's name
	public void stateAge()
	{
		System.out.println(name + " is " + age + " year(s) old.");
	}
	//adds a year to age
	public void increaseAge()
	{
		age++;
	}
	
	//will state age and say adoption status
	public String toString()
	{
		stateAge();
		if(isAdopted)
		{
			return "I have been chosen!";
		}
		return "I haven't found a home yet... :(";
	}
	//will compare and check if two dogs are the same dog
	public boolean equals(Dog dawg)
	{
		if(this.age == dawg.age && this.name.equals(dawg.name) && this.isAdopted == dawg.isAdopted)
		{
			return true;
		}
		return false;
	}
	
	
	

}
