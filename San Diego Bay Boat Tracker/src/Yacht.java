
public abstract class Yacht extends Motorboat 
{
protected int bedrooms;
protected double bathrooms;
protected String accesoryWatercrafts;

public abstract void launchWatercraft();

public void showYachtDetails()
	{
	System.out.println("This yacht contains " + bedrooms +" bedrooms and " + bathrooms + " bathrooms.");
	}

}
