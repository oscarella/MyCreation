/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class represents a fly that is sitting on the rock. Once the soils/ groundwater absorb chemicals and decline in quality, the fly flys off.

*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Fly extends Thread
{
    private Console c;

    public void commonFly (int x)
    {
	Color melonGreen = new Color (64, 156, 102);
	Color cherryRed = new Color (184, 0, 0);
	Color silverGrey = new Color (199, 199, 199);
	// colours are used to make the ant

	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColour (melonGreen);
	    c.drawOval (395 + i, 185 + i, 30 - 2 * i, 10 - 2 * i);
	}
	// body of fly
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColour (silverGrey);
	    c.drawRoundRect (389 + i, 183 + i, 10 - 2 * i, 15 - 2 * i, 15, 15);
	    // head of fly
	}
	for (int i = 0 ; i <= 4 ; i++)
	{
	    c.setColour (cherryRed);
	    c.drawOval (391 + i, 185 + i, 4 - 2 * i, 8 - 2 * i);
	    // eye of fly
	}
	for (int i = 3 ; i <= 6 ; i += 3)
	{
	    c.setColour (Color.black);
	    c.drawLine (402 + i, 192, 402 + i, 197);
	    // legs on the left side of the body
	}
	for (int i = 3 ; i <= 6 ; i += 3)
	{
	    c.setColour (Color.black);
	    c.drawLine (413 + i, 192, 413 + i, 197);
	    // legs on the right side of the body
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColour (Color.white);
	    c.drawRect (405 + i, 185 + i, 20 - i, 5 - i);
	    // wings of the fly
	}
    }


    public void commonFly (int x, int w)
    {
	Color melonGreen = new Color (64, 156, 102);
	Color cherryRed = new Color (184, 0, 0);
	Color silverGrey = new Color (199, 199, 199);
	// colours are used to make the ant
	Color skyBlue = new Color (135, 206, 250);
	// colours used for sky

	for (int xPos = 0 ; xPos <= 200 ; xPos += 2)
	{
	    synchronized (c)
	    {
		for (int i = 0 ; i <= 36 ; i++)
		{
		    c.setColour (skyBlue);
		    c.drawRect (390 + i - xPos, 184 + i - xPos, 37 - i, 16 - i);
		    // covers background as the ant flies
		}
		for (int i = 0 ; i <= 15 ; i++)
		{
		    c.setColour (melonGreen);
		    c.drawOval (395 + i - xPos, 185 + i - xPos, 30 - 2 * i, 10 - 2 * i);
		}
		// body of fly
		for (int i = 0 ; i <= 10 ; i++)
		{
		    c.setColour (silverGrey);
		    c.drawRoundRect (389 + i - xPos, 183 + i - xPos, 10 - 2 * i, 15 - 2 * i, 15, 15);
		    // head of fly
		}
		for (int i = 0 ; i <= 4 ; i++)
		{
		    c.setColour (cherryRed);
		    c.drawOval (391 + i - xPos, 185 + i - xPos, 4 - 2 * i, 8 - 2 * i);
		    // eye of fly
		}
		for (int i = 3 ; i <= 6 ; i += 3)
		{
		    c.setColour (Color.black);
		    c.drawLine (402 + i - xPos, 192 - xPos, 402 + i - xPos, 197 - xPos);
		    // legs on the left side of the body
		}
		for (int i = 3 ; i <= 6 ; i += 3)
		{
		    c.setColour (Color.black);
		    c.drawLine (413 + i - xPos, 192 - xPos, 413 + i - xPos, 197 - xPos);
		    // legs on the right side of the body
		}
		for (int i = 0 ; i <= 20 ; i++)
		{
		    c.setColour (Color.white);
		    c.drawRect (405 + i - xPos, 185 + i - xPos, 20 - i, 5 - i);
		    // wings of the fly
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
    }


    public void flyAnim ()
    {
	commonFly (1);
	try
	{
	    Thread.sleep (45000);
	}
	catch (Exception e)
	{
	}
	// Fly is animated after an extended amount of time
	commonFly (1, 1);
    }


    public Fly (Console con)
    {
	c = con;
    }


    public void run ()
    {
	flyAnim ();
    }
}
