
public class Bulb 
{
	
	public boolean lightSwitch;
	
	public Bulb (boolean bulb) 
	{
		lightSwitch = bulb;
		
		if	(lightSwitch == true)	
		{
			System.out.println("The bulb is on");	
		}
			
		else if (lightSwitch == false) 
		{
			System.out.println("The bulb is off");
		}
	}
	
}
