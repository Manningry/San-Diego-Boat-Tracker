
public abstract class FishingBoat extends Motorboat
{
protected boolean fishingNets;
protected int numberOfLiveWells;
protected double storageCapacity;

public abstract void showFishScanner();
public abstract void catchFish();

public void showFishingDetails()
{
	if(fishingNets == true)
	{
		System.out.println("This fishing boat uses nets to catch fish, and contains " + numberOfLiveWells + " livewells along with " + storageCapacity + " storage compartments.");
	}
	
	if(fishingNets == false)
	{
		System.out.println("This fishing boat does not use nets to catch fish, and contains " + numberOfLiveWells + " livewells along with " + storageCapacity + " storage compartments.");
	}
}
	
	
}
