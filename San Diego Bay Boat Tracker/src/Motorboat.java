
public abstract class Motorboat {

	protected double engineSize;
	protected boolean inboardMotor;
	protected int numberOfEngines;
	protected double topSpeed;
	
	protected Trailerable myTrailerable;
	
	public abstract void turnOnEngine();
	public abstract void cruise();
	
	public void showEngineDetails()
	{
		if(inboardMotor == true)
		{
			System.out.println("This Motorboat has " + numberOfEngines + " inboard engine(s), possessing " + engineSize + " total horsepower.");
		}
		
		if(inboardMotor == false)
		{
			System.out.println("This Motorboat has " + numberOfEngines + " outboard engine(s), possessing " + engineSize + " total horsepower.");
		}
	
}
}
