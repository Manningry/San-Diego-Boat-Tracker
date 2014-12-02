
public class BassBoat extends FishingBoat{

	protected double insideDepth;
	protected String decalDescription;
	
protected int numberOfRodHolders;
	
	
	public BassBoat ()
	{
		fishingNets = false;
		numberOfLiveWells = 2;
		storageCapacity = 9;
		insideDepth = 24;
		decalDescription = "Sleek, shiny, and full of flames";
		combinedEngineHorsepower = 250;
		inboardMotor = false;
		numberOfEngines = 1; 
		topSpeed = 56;
	}
	
	public void turnOnEngine()
	{
		System.out.println("The bass fisherman turns his key and fires up his pristine, powerful engine.");
	}
	
	public void cruise()
	{
		System.out.println("He can cruise at an average speed of 45 miles per hour (of course not when fishing though).");
	}
	
	public void showFishScanner()
	{
		System.out.println("His fish scanner currently shows a water depth of 9 feet, with only a small variety of two types of fish.");
	}
	
	public void showFishingDetails()
	{
		if(fishingNets == true)
		{
		System.out.println("This fisherman uses a boat that can be described as being " + decalDescription + " . He uses nets along with poles to catch fish. "
				+ "He has only has an internal boat depth of " + insideDepth + " incehs, but surprisingly has " + storageCapacity + "storage compartments to keep his equipment organized. When he catches a fish, he has "+ 
				numberOfLiveWells + " availible to store the fish.");
		}
		else
		{
			System.out.println("This fisherman uses a boat that can be described as being " + decalDescription + " . He only uses poles to catch fish. "
					+ "He has only has an internal boat depth of " + insideDepth + " incehs, but surprisingly has " + storageCapacity + "storage compartments to keep his equipment organized. When he catches a fish, he has "+ 
					numberOfLiveWells + " availible to store the fish.");
		}
	}
}
	

