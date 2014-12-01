
public class Lund extends All_Purpose_Fishing
{
public Lund()
{
	engineSize = 225;
	inboardMotor = false;
	numberOfEngines = 1;
	topSpeed = 56;
	fishingNets = false;
	numberOfLiveWells = 2;
	storageCapacity = 8;
	numberOfRodHolders = 6;
	
	myTrailerable = (Trailerable) new IsTrailerable();
	
}
	
	
@Override
public void putPoleInHolder() {
	System.out.println("The Fisherman put his pole in one of his 6 holders.");
	
}

@Override
public void showFishScanner() {
	System.out.println("The Lund fish finder shows 10 fish between 10 and 50 feet deep.");
	
}

@Override
public void catchFish() {
	System.out.println("The Lund Fisherman reels in a 24 inch trout!");
	
}

@Override
public void turnOnEngine() {
	System.out.println("The Lund Fisherman turns his key and fires up his 225 horsepower engine.");
	
}

@Override
public void cruise() {
	System.out.println("The Lund Fisherman cruises at a top speed of 56 miles per hour.");	
}
}

