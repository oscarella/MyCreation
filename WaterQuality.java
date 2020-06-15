/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class displays a grounderwater animation as the water changes in quality. As chemicals leak into the water, the blue water turns into orange.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class WaterQuality extends Thread
{
    private Console c;

    public void waterAnim ()
    {
	Color chemOrange = new Color (255, 153, 51);
	for (int i = 0 ; i <= 50 ; i++)
	{
	    synchronized (c)
	    {
		c.setColor (chemOrange);
		c.drawLine (0, 330 - i, 85, 330 - i);
		// rising chemical water mix on the left of the pipes
		c.setColor (chemOrange);
		c.drawLine (115, 330 - i, 640, 330 - i);
		// rising chemical water mix on the right of the pipes
	    }
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (Exception e)
	    {
	    }
	}
	// delays animation
    }


    public WaterQuality (Console con)
    {
	c = con;
    }


    public void run ()
    {
	waterAnim ();
    }
}
