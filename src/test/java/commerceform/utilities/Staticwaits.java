package commerceform.utilities;

import pom.Constants;

public class Staticwaits {
	public static void staticShortWait()
	{
		try 
		{
			Thread.sleep(Constants.SHORT_WAIT);
		} 
		catch(InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
	
