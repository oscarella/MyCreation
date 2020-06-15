/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28, 2019
   This class displays oil and gas enter into and up the pipes set up by the drilling rig. As chemicals are injected into the shale layer, the chemicals
   break down the rocks to release oil and gas.
*/

// Citations (If statements)- https://docs.oracle.com/javase/tutorial/java/nutsandbolts/if.html

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class ShaleRock extends Thread
{
    private Console c;

    public void rockAnim ()
    {
	Color grey = new Color (160, 160, 160);
	// color used for shale rock layer
	Color chemGreen = new Color (180, 235, 136);
	// colour used for the pipes that connect to the drilling rig

	for (int x = 0 ; x <= 500 ; x++)
	{
	    for (int i = 0 ; i <= 280 ; i++)
	    {
		for (int y = 0 ; y <= 10 ; y++)
		{
		    for (int z = 0 ; z <= 30 ; z++)
		    {
			c.setColor (chemGreen);
			c.drawLine (90, 240 + z, 110, 240 + z);
			// rectangle is drawn on the top part of the pipe to convey the illusion that the gas is getting sucked into the rig
		    }
		    c.setColor (Color.white);
		    c.drawOval (380 + y - i, 465 + y, 15 - 2 * y, 15 - 2 * y);
		    // gas is animated
		    if (i <= 80)
		    {
			c.setColor (grey);
		    }
		    else
		    {
			c.setColor (chemGreen);
			// colour is set to chemGreen once the oval (gas) reaches the inside of the pipe
		    }
		    c.drawOval (385 + y - i, 465 + y, 15 - 2 * y, 15 - 2 * y);
		    // created oval trails the oval that represents the gas to give the illusion that the oil is moving

		}
	    }
	    c.setColor (chemGreen);
	    for (int a = 0 ; a <= 40 ; a++)
	    {
		c.drawArc (90 + a, 440 + a, 40 - 2 * a, 40 - 2 * a, 180, 90);
		// an arc is drawn and covers the animated oval to give the illusion that it is moving up
	    }

	    for (int b = 0 ; b <= 210 ; b++)
	    {
		for (int d = 0 ; d <= 10 ; d++)
		{
		    c.setColor (Color.white);
		    c.drawOval (95 + d, 460 - b + d, 15 - 2 * d, 15 - 2 * d);
		    // a separate oval (gas) starts from the bend of the pipe and moves up into the rig
		    c.setColor (chemGreen);
		    c.drawOval (95 + d, 465 - b + d, 15 - 2 * d, 15 - 2 * d);
		    // trails the oval (gas) to give the illusion that it is being animated
		}
		try
		{
		    Thread.sleep (5);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public ShaleRock (Console con)
    {
	c = con;
    }


    public void run ()
    {
	rockAnim ();
    }
}
