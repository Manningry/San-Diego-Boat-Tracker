
public abstract class PowerYacht extends Yacht{

	protected int numberOfDecks;
	protected int crewNumber;
	
	public void showPowerYachtDetails()
	{
		System.out.println("This power yacht has " + numberOfDecks + " decks with a crew of " + crewNumber + ".");
	
	}
}
