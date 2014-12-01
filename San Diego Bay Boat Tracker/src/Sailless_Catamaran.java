
public abstract class Sailless_Catamaran extends Yacht{

	protected int numberOfHulls;
	protected boolean bathingPlatform;
	
	public void showCatamaranDetails()
	{
		if(bathingPlatform == false)
		{
		System.out.println("This catamaran has " + numberOfHulls + " hulls, and does include an outdoor bathing platform!");
		}
		
		if(bathingPlatform == true)
		{
			System.out.println("This catamaran has " + numberOfHulls + " hulls, but does NOT include an outdoor bathing platform!");
		}
	}
}
