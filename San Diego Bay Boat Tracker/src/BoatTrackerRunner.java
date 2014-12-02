
public class BoatTrackerRunner {

	public static void main(String[] args) {
		
	//polymorphesim with the Fishing Boats
		
		
	FishingBoat [] boat = new FishingBoat [2];
	
	boat [0] = new BassBoat();
	boat [1] = new All_Purpose_Fishing();
	
	for(int i = 0; i < boat.length; i++)
	{
		boat [i].catchFish();
		boat [i].turnOnEngine();
		boat [i].showEngineDetails();
		boat [i].cruise();
		boat [i].showFishingDetails();
		boat [i].showFishScanner();
		boat [i].myTrailerable.trailerBoat();
		System.out.println("");
		
	}
	
	//polymorphesim with the Yachts
	
	Yacht [] yacht = new Yacht [2];
	
	yacht[0] = new PowerYacht();
	yacht [1] = new Sailless_Catamaran();
	
	for(int i = 0; i < yacht.length; i++)
	{
		yacht[i].turnOnEngine();
		yacht[i].showEngineDetails();	
		yacht[i].cruise();
		yacht[i].showYachtDetails();
		yacht[i].haveYachtParty();
		yacht[i].dockYacht();
		yacht[i].myTrailerable.trailerBoat();
		System.out.println("");
	}


}
}
