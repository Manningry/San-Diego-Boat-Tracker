
public class All_Purpose_Fishing extends FishingBoat {

	protected int numberOfRodHolders;

	
	public All_Purpose_Fishing ()
	{
		fishingNets = true;
		numberOfLiveWells = 4;
		storageCapacity = 22;
		numberOfRodHolders = 10;
		combinedEngineHorsepower = 600;
		inboardMotor = true;
		numberOfEngines = 2; 
		topSpeed = 24;
		myTrailerable = (Trailerable) new IsNotTrailerable();
	}
	
	public void catchFish()
		{
		super.catchFish();
			System.out.println("All purpose fishing boats are used to catch fish in all depths of water, which could include salmon to trout.");
		}
	
	public void turnOnEngine()
	{
		System.out.println("The all-purpose fisherman turns his key and fires up his old, weathered engines.");
	}
	
	public void cruise()
	{
		System.out.println("He can cruise at an average speed of 16 miles per hour (of course not when fishing though).");
	}
	
	public void showFishScanner()
	{
		System.out.println("His fish scanner currently shows a water depth of 87 feet, with an abundant variety of fish.");
	}
	
	public void showFishingDetails()
	{
		if(fishingNets == true)
		{
		System.out.println("This fisherman uses nets along with poles to catch fish. He has " + numberOfRodHolders + " rod holders availible for his use, "
				+ "along with " + storageCapacity + " storage compartments to keep his equipment organized. When he catches a fish, he has "+ 
				numberOfLiveWells + " live wells availible to store the fish.");
		}
		else
		{
			System.out.println("This fisherman only uses poles to catch fish. He has " + numberOfRodHolders + "availible for his use, "
					+ "along with " + storageCapacity + "storage compartments to keep his equipment organized. When he catches a fish, he has "+ 
					numberOfLiveWells + " availible to store the fish.");
			}
	}
}