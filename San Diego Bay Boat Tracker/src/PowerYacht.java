
public class PowerYacht extends Yacht{

	protected int numberOfDecks;
	protected int crewNumber;
	
	public PowerYacht ()
	{
		numberOfDecks = 3;
		crewNumber = 4;
		accesoryWatercrafts = "one 20 foot tender, a 10 foot life raft, and two jet skis";
		bathrooms = 3.5;
		bedrooms = 5;
		combinedEngineHorsepower = 1200;
		inboardMotor = true;
		numberOfEngines = 4; 
		topSpeed = 31;
	}
	
	public void haveYachtParty()
	{
		System.out.println("The power yacht is able to host a massive party with over 25 guests do to its larger space and floor plan.");
	}
	
	
	public void showYachtDetails()
	{
	System.out.println("This yacht contains " + bedrooms +" bedrooms and " + bathrooms + " bathrooms. It has a standard crew of " + 
	crewNumber + " people, who are present on all " + numberOfDecks + " decks. It also stores accesory watercrafts such as " + accesoryWatercrafts + " .");
	}
	
	public void turnOnEngine()
	{
		System.out.println("The yachtsman turns his key, taps the touchscreen and fires up his quiet, elegant engines.");
	}
	
	public void cruise()
	{
		System.out.println("He can cruise at an average speed of 20 miles per hour, which provides a perfectly gentle ride).");
	}
	
	
	
}
