
public class Lights {
	
	public static void main (String[] args)
	{
		Bulb bulb1 = new Bulb ();
		Bulb bulb2 = new Bulb (true);
		
		bulb1.switchOn();
		bulb1.printStatus();
	}
}
