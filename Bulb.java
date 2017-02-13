
public class Bulb 
{
	private boolean lightOn;
	
	public Bulb (boolean lightOn = false) 
	{
		this.lightOn = lightOn;
		printStatus();
	}

	public void switchOn()
	{
		lightOn = true;
	}

	public void switchOff()
	{
		lightOff = false;
	}

	public void printStatus()
	{
		if	(lightSwitch)	
		{
			System.out.println("The bulb is on");	
		}
		else
		{
			System.out.println("The bulb is off");
		}
	}
	
}
