
public abstract class Yacht extends Motorboat 
{
protected int bedrooms;
protected double bathrooms;
protected String accesoryWatercrafts;

public abstract void haveYachtParty();
public abstract void showYachtDetails();

public void dockYacht()
{
	System.out.println("Yahcts are only able to be docked in harbors long enough and wide enough to accomodate such large vessels.");
}


}
