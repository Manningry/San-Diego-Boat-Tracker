
public class Sailless_Catamaran extends Yacht{

	protected int numberOfHulls;
	protected int bathingPlatform;
	
	public Sailless_Catamaran ()
	{
		numberOfHulls = 2;
		bathingPlatform = 1;
		accesoryWatercrafts = "a 16 foot sailboat";
		bathrooms = 1.5;
		bedrooms = 3;
		combinedEngineHorsepower = 750;
		inboardMotor = true;
		numberOfEngines = 2; 
		topSpeed = 22;
		myTrailerable = (Trailerable) new IsTrailerable();
	}
	
	public void dockYacht()
		{
			super.dockYacht();
			System.out.println("The Catamaran requires an exceptionally wide dock space, accounting for its two hulls and wider body frame.");
		}
	
	public void haveYachtParty()
	{
		System.out.println("The sailless catamaran is able to host a small party with only 5-10 guests do to its smaller space and seperated floor plan.");
	}
	
	
	public void showYachtDetails()
	{
	System.out.println("This catamaran contains " + bedrooms +" bedrooms and " + bathrooms + " bathrooms. It has " + 
	numberOfHulls + " hulls, and " + bathingPlatform + " bathing platform(s). It also stores accesory watercrafts such as " + accesoryWatercrafts + " .");
	}
	
	public void turnOnEngine()
	{
		System.out.println("The catamaran owner turns his key, presses a button and fires up his small, hidden engines.");
	}
	
	public void cruise()
	{
		System.out.println("He can cruise at an average speed of 13 miles per hour, which provides a good time and saves gas!).");
	}
}
