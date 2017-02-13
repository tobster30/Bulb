
public class Bulb 
{
	private boolean lightOn;
	private static final String LIGHT_ON_MSG = "The bulb is on";
	private static final String LIGHT_OFF_MSG = "The bulb is off";
	
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
		lightSwitch ? System.out.println(LIGHT_ON_MSG) : System.out.println(LIGHT_OFF_MSG);
	}
	
}
