
public abstract class FishingBoat extends Motorboat
{
protected boolean fishingNets;
protected int numberOfLiveWells;
protected double storageCapacity;

public abstract void showFishScanner();
public abstract void showFishingDetails();

public void catchFish()
{
	System.out.println("Fishing boats are specifically built and outfitted to catch and store fish.");
}
	
}
