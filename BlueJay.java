/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th , 2019
   This class displays the blue jay flying out of its birdhouse once its habitat become inhabitable. As the plants and soil are being contaminated
   by the chemicals from the pipes, the blue jay flies away to find a new home.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class BlueJay implements Runnable
{
    private Console c;

    public void birdAnim ()
    {
	Color skyBlue = new Color (135, 206, 250);
	Color dodgerBlue = new Color (30, 144, 255);
	Color lightYellow = new Color (255, 255, 51);
	Color deepBlue = new Color (7, 90, 171);
	// colours used to create the blue jay
	Color orangeBrown = new Color (230, 111, 64);
	Color darkOrange = new Color (171, 77, 39);
	Color roseBrown = new Color (120, 47, 18);

	for (int f = 0 ; f <= 95 ; f++)
	{
	    synchronized (c)
	    {
		c.setColor (skyBlue);
		c.fillRect (470 - 2 * f, 60 - f, 80, 35);
		// part of the sky background that gives the illusion that the blue jay is flying
		c.setColor (lightYellow);
		c.fillRoundRect (475 - 2 * f, 68 - f, 15, 8, 15, 15);
		// beak of blue jay
		c.setColor (dodgerBlue);
		c.fillOval (500 - 2 * f, 70 - f, 40, 20);
		// body of blue jay
		c.setColor (dodgerBlue);
		c.fillOval (485 - 2 * f, 60 - f, 30, 20);
		// head of blue jay
		c.setColor (Color.black);
		c.fillArc (490 - 2 * f, 66 - f, 7, 7, 180, 270);
		// eye of blue jay
		for (int i = 0 ; i <= 15 ; i++)
		{
		    c.setColor (deepBlue);
		    c.drawLine (514 + i - 2 * f, 70 - f, 521 + i - 2 * f, 60 - f);
		    // upper wing of blue jay
		    c.setColor (deepBlue);
		    c.drawLine (515 + i - 2 * f, 80 - f, 527 + i - 2 * f, 90 - f);
		    // lower wing of blue jay
		}
		for (int i = 0 ; i <= 35 ; i++)
		{
		    c.setColor (orangeBrown);
		    c.drawLine (480, 60 + i, 540, 60 + i);
		    c.setColor (roseBrown);
		    c.drawLine (470, 60 + i, 480, 60 + i);
		    c.drawLine (540, 60 + i, 550, 60 + i);
		}
		// centre of tree house
		for (int i = 0 ; i <= 40 ; i++)
		{
		    c.setColor (Color.black);
		    c.drawArc (495 + i, 70 + i, 30 - 2 * i, 50 - 2 * i, 0, 180);
		}
		// opening of tree house
		for (int i = 0 ; i <= 15 ; i++)
		{
		    c.setColor (darkOrange);
		    c.drawLine (470, 95 + i, 550, 95 + i);
		}
		// bottom of tree house

		for (int i = 0 ; i <= 35 ; i++)
		{
		    c.drawLine (465 + i, 60 - i, 555 - i, 60 - i);
		}
		// top of tree house
		for (int i = 0 ; i <= 10 ; i += 2)
		{
		    c.setColor (roseBrown);
		    c.drawLine (472, 97 + i, 548, 97 + i);
		}
		// marks in bottom of tree house
		for (int i = 0 ; i <= 26 ; i += 2)
		{
		    c.setColor (roseBrown);
		    c.drawLine (472 + i, 58 - i, 548 - i, 58 - i);
		}
		// marks in top of tree house
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


    public BlueJay (Console con)
    {
	c = con;
    }


    public void run ()
    {
	birdAnim ();
    }
}
