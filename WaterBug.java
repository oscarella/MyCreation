/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class displays a stonefly at the beginning of the animation. However, once the chemicals begin to leach into the soil and containate the water,
   the stonefly moves right and leaves its groundwater to find a new habitat.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class WaterBug extends Thread
{
    private Console c;

    public void bug (int x)
	// if bug () only has one argument
    {
	Color lightBrown = new Color (143, 95, 7);
	Color chocoBrown = new Color (105, 68, 2);
	Color rust = new Color (186, 121, 22);
	// Colors are used to make the stonefly

	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (rust);
	    c.drawLine (413 + i, 298, 413 + i, 313);
	    // neck of the stonefly
	}
	c.setColor (rust);
	c.drawLine (360, 300, 340, 295);
	c.setColor (rust);
	c.drawLine (360, 310, 340, 315);
	// legs on the back of the stone fly
	c.setColor (rust);
	c.drawLine (370, 285, 390, 283);
	c.setColor (rust);
	c.drawLine (400, 285, 420, 283);
	c.setColor (rust);
	c.drawLine (378, 325, 393, 327);
	c.setColor (rust);
	c.drawLine (408, 325, 423, 327);
	//legs on the side of the stone fly
	c.setColor (rust);
	c.drawLine (440, 298, 470, 296);
	c.setColor (rust);
	c.drawLine (440, 313, 470, 316);
	c.setColor (rust);
	c.drawLine (440, 304, 455, 304);
	c.setColor (rust);
	c.drawLine (440, 307, 455, 307);
	// antenna of the stonefly
	for (int i = 0 ; i <= 13 ; i++)
	{
	    c.setColor (chocoBrown);
	    c.drawRect (370, 285 + i, 8, 13 - i);
	    c.setColor (chocoBrown);
	    c.drawRect (400, 285 + i, 8, 13 - i);
	    c.setColor (chocoBrown);
	    c.drawRect (370, 313 + i, 8, 13 - i);
	    c.setColor (chocoBrown);
	    c.drawRect (400, 313 + i, 8, 13 - i);
	    // knees of the stonefly
	}
	for (int i = 0 ; i <= 25 ; i++)
	{
	    c.setColor (lightBrown);
	    c.drawRoundRect (360 + i, 293 + i, 60 - 2 * i, 25 - 2 * i, 20, 20);
	    // body of the stonefly
	    c.setColor (lightBrown);
	    c.drawArc (403 + i, 290 + i, 40 - 2 * i, 30 - 2 * i, 270, 180);
	    // head of the stonefly
	}
	for (int i = 0 ; i <= 5 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (430 + i, 295 + i, 10 - 2 * i, 5 - 2 * i);
	    c.setColor (Color.black);
	    c.drawOval (430 + i, 310 + i, 10 - 2 * i, 5 - 2 * i);
	}
	//eyes of the stonefly
    }


    public void bug (int x, int y)
	// if bug () has two arguments
    {
	Color lightBrown = new Color (143, 95, 7);
	Color chocoBrown = new Color (105, 68, 2);
	Color rust = new Color (186, 121, 22);
	// Colors are used to make the stonefly
	Color blue = new Color (0, 102, 204);

	for (int i = 0 ; i <= 100 ; i++)
	{
	    c.setColor (blue);
	    c.drawLine (340 + i, 280, 340 + i, 330);
	}

	for (int z = 0 ; z <= 300 ; z++)
	{
	    synchronized (c)
	    {
		for (int i = 0 ; i <= 10 ; i++)
		{
		    c.setColor (rust);
		    c.drawLine (413 + i + z, 298, 413 + i + z, 313);
		    // neck of the stonefly
		}
		c.setColor (rust);
		c.drawLine (360 + z, 300, 340 + z, 295);
		c.setColor (rust);
		c.drawLine (360 + z, 310, 340 + z, 315);
		// legs on the back of the stone fly
		c.setColor (rust);
		c.drawLine (370 + z, 285, 390 + z, 283);
		c.setColor (rust);
		c.drawLine (400 + z, 285, 420 + z, 283);
		c.setColor (rust);
		c.drawLine (378 + z, 325, 393 + z, 327);
		c.setColor (rust);
		c.drawLine (408 + z, 325, 423 + z, 327);
		//legs on the side of the stone fly
		c.setColor (rust);
		c.drawLine (440 + z, 298, 470 + z, 296);
		c.setColor (rust);
		c.drawLine (440 + z, 313, 470 + z, 316);
		c.setColor (rust);
		c.drawLine (440 + z, 304, 455 + z, 304);
		c.setColor (rust);
		c.drawLine (440 + z, 307, 455 + z, 307);
		// antenna of the stonefly
		for (int i = 0 ; i <= 13 ; i++)
		{
		    c.setColor (chocoBrown);
		    c.drawRect (370 + z, 285 + i, 8, 13 - i);
		    c.setColor (chocoBrown);
		    c.drawRect (400 + z, 285 + i, 8, 13 - i);
		    c.setColor (chocoBrown);
		    c.drawRect (370 + z, 313 + i, 8, 13 - i);
		    c.setColor (chocoBrown);
		    c.drawRect (400 + z, 313 + i, 8, 13 - i);
		    // knees of the stonefly
		}
		for (int i = 0 ; i <= 25 ; i++)
		{
		    c.setColor (lightBrown);
		    c.drawRoundRect (360 + i + z, 293 + i, 60 - 2 * i, 25 - 2 * i, 20, 20);
		    // body of the stonefly
		    c.setColor (lightBrown);
		    c.drawArc (403 + i + z, 290 + i, 40 - 2 * i, 30 - 2 * i, 270, 180);
		    // head of the stonefly
		}
		for (int i = 0 ; i <= 5 ; i++)
		{
		    c.setColor (Color.black);
		    c.drawOval (430 + i + z, 295 + i, 10 - 2 * i, 5 - 2 * i);
		    c.setColor (Color.black);
		    c.drawOval (430 + i + z, 310 + i, 10 - 2 * i, 5 - 2 * i);
		}
		//eyes of the stonefly
		try
		{
		    Thread.sleep (1);
		}
		catch (Exception e)
		{
		}
		for (int i = 0 ; i <= 140 ; i++)
		{
		    c.setColor (blue);
		    c.drawLine (340 + i + z, 280, 340 + i + z, 330);
		    // redraws the groundwater behind the stonefly to give the impression that the stonefly is being animated and moving
		}
	    }
	}
    }

    public void bugAnim ()
    {
	bug (1);
	try
	{
	    Thread.sleep (17500);
	}
	catch (Exception e)
	{
	}
	// Stonefly is animated after an extended amount of time
	bug (1, 1);
    }

    public WaterBug (Console con)
    {
	c = con;
    }

    public void run ()
    {
	bugAnim ();
    }
}
