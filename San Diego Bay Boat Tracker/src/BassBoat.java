
public abstract class BassBoat extends FishingBoat{

	protected double insideDepth;
	
	public abstract void castLine();
	
	public void fishInShallowWaters()
	{
		System.out.println("Bass boats are able to fish in very shallow waters due to their hull design.");
	}
	
}
