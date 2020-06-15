/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class represents the beetle larvae and how it is affected by a chemical leak in our scenario. Gases that had been extracted by the drilling rig
   are accidentally released into the burrow, leading to the beetle larvae's fateful end.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class BeetleLarvae extends Thread
{
    private Console c;

    public void larvae (int x)
    {
	Color bloodRed = new Color (97, 12, 12);
	// colour used for the larvae's head
	Color orangeRed = new Color (158, 71, 9);
	// colour used for the larvae's legs and the pattern on its back

	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (bloodRed);
	    c.drawOval (425 + i, 370 + i, 20 - 2 * i, 20 - 2 * i);
	    // head of the beetle larvae
	}
	for (int y = 365 ; y <= 426 ; y += 10)
	{
	    for (int i = 0 ; i <= 10 ; i++)
	    {
		c.setColor (Color.white);
		c.drawRoundRect (y + i, 370 + i, 10 - 2 * i, 20 - 2 * i, 10, 10);
		// body of beetle larvae
	    }
	}
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (360 + i, 370 + i, 20 - 2 * i, 20 - 2 * i);
	    // back of beetle larvae
	}
	for (int i = 0 ; i <= 50 ; i += 5)
	{
	    c.setColor (orangeRed);
	    c.drawLine (380 + i, 375, 380 + i, 385);
	    // designs on the body of larvae
	}
	for (int i = 0 ; i <= 50 ; i += 5)
	{
	    c.setColor (orangeRed);
	    c.drawLine (380 + i, 390, 380 + i, 395);
	    // legs of the larvae
	}
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawArc (430 + i, 373 + i, 15 - 2 * i, 15 - 2 * i, 20, 270);
	    // face of the beatle larvae
	}
    }


    public void larvae (int x, int w)
    {
	Color bloodRed = new Color (97, 12, 12);
	// colour used for the larvae's head
	Color orangeRed = new Color (158, 71, 9);
	// colour used for the larvae's legs and the pattern on its back
	Color burrowBrown = new Color (163, 113, 75);
	// colours used for the underground burrow

	for (int xPos = 0 ; xPos <= 50 ; xPos++)
	{
	    synchronized (c)
	    {
		for (int i = 0 ; i <= 20 ; i++)
		{
		    c.setColor (burrowBrown);
		    c.drawOval (355 + i + xPos, 360 + i, 95 - 2 * i, 40 - 2 * i);
		    // Oval is used to cover the un-animated larvae
		}
		for (int i = 0 ; i <= 10 ; i++)
		{
		    c.setColor (bloodRed);
		    c.drawOval (425 + i + xPos, 370 + i, 20 - 2 * i, 20 - 2 * i);
		    // head of the beetle larvae
		}
		for (int y = 365 ; y <= 426 ; y += 10)
		{
		    for (int i = 0 ; i <= 10 ; i++)
		    {
			c.setColor (Color.white);
			c.drawRoundRect (y + i + xPos, 370 + i, 10 - 2 * i, 20 - 2 * i, 10, 10);
			// body of beetle larvae
		    }
		}
		for (int i = 0 ; i <= 10 ; i++)
		{
		    c.setColor (Color.black);
		    c.drawOval (360 + i + xPos, 370 + i, 20 - 2 * i, 20 - 2 * i);
		    // back of beetle larvae
		}
		for (int i = 0 ; i <= 50 ; i += 5)
		{
		    c.setColor (orangeRed);
		    c.drawLine (380 + i + xPos, 375, 380 + i + xPos, 385);
		    // designs on the body of larvae
		}
		for (int i = 0 ; i <= 50 ; i += 5)
		{
		    c.setColor (orangeRed);
		    c.drawLine (380 + i + xPos, 390, 380 + i + xPos, 395);
		    // legs of the larvae
		}
		for (int i = 0 ; i <= 10 ; i++)
		{
		    c.setColor (Color.black);
		    c.drawArc (430 + i + xPos, 373 + i, 15 - 2 * i, 15 - 2 * i, 20, 270);
		    // face of the beatle larvae
		}
		try
		{
		    Thread.sleep (20);
		}
		catch (Exception e)
		{
		}
	    }
	}
	for (int yPos = 0 ; yPos <= 40 ; yPos += 10)
	{
	    for (int i = 0 ; i <= 50 ; i++)
	    {
		c.setColor (Color.white);
		c.drawOval (320 + i, 390 + i - yPos, 90 - 2 * i, 30 - 2 * i);
		c.setColor (Color.white);
		c.drawOval (400 + i, 390 + i - yPos, 95 - 2 * i, 30 - 2 * i);
		// gases are released in the larvae burrow; moves upwards
		try
		{
		    Thread.sleep (30);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public void larvaeAnim ()
    {
	larvae (1);
	try
	{
	    Thread.sleep (20000);
	}
	catch (Exception e)
	{
	}
	// Larvae is animated after an extended amount of time
	larvae (1, 1);
    }


    public BeetleLarvae (Console con)
    {
	c = con;
    }


    public void run ()
    {
	larvaeAnim ();
    }
}
