/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class displays a butterfly resting on top of the plants at the beginning of the animation. Once the plants are dead and no longer act as a
   habitat, the butterfly flys upwards to look for a new home.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class ButterFly extends Thread
{
    private Console c;

    public void buddleia (int x)
	// if buddleia () only has one argument
    {
	Color brightOrange = new Color (232, 122, 63);
	// colour is used for the wings of the butterfly
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (350 + i, 157 + i, 15 - 2 * i, 15 - 2 * i);
	    // head of butterfly
	    c.setColor (Color.black);
	    c.drawRoundRect (353 + i, 170 + i, 10 - 2 * i, 30 - 2 * i, 20, 20);
	    // body of butterfly
	}
	c.setColor (Color.black);
	c.drawLine (351, 157, 346, 150);
	// left antenna of butterfly
	c.setColor (Color.black);
	c.drawLine (361, 157, 366, 150);
	// right antenna of butterfly
	for (int i = 0 ; i <= 4 ; i++)
	{
	    c.setColor (Color.white);
	    c.drawOval (351 + i, 157 + i, 4 - 2 * i, 8 - 2 * i);
	    // left eye of butterfly
	    c.setColor (Color.white);
	    c.drawOval (361 + i, 157 + i, 4 - 2 * i, 8 - 2 * i);
	    // right eye of butterfly
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (brightOrange);
	    c.drawArc (320 + i, 160 + i, 35 - 2 * i, 35 - 2 * i, 0, 90);
	    c.setColor (brightOrange);
	    c.drawArc (320 + i, 161 + i, 35 - 2 * i, 35 - 2 * i, 270, 90);
	    c.setColor (brightOrange);
	    c.drawArc (362 + i, 160 + i, 35 - 2 * i, 35 - 2 * i, 90, 90);
	    c.setColor (brightOrange);
	    c.drawArc (362 + i, 161 + i, 35 - 2 * i, 35 - 2 * i, 180, 90);
	    // wings of butterfly
	}
    }


    public void buddleia (int x, int y)
    {
	// if buddleia () has two arguments
	Color skyBlue = new Color (135, 206, 250);
	Color brightOrange = new Color (232, 122, 63);
	// colour is used for the wings of the butterfly
	for (int i = 0 ; i <= 60 ; i++)
	{
	    c.setColor (skyBlue);
	    c.drawLine (337, 200 - i, 380, 200 - i);
	    // rectangle made out of lines covers the original butterfly and replaces it with the animated one
	}
	for (int h = 0 ; h <= 200 ; h++)
	{
	    for (int i = 0 ; i <= 15 ; i++)
	    {
		c.setColor (Color.black);
		c.drawOval (350 + i, 157 + i - h, 15 - 2 * i, 15 - 2 * i);
		// head of butterfly
		c.setColor (Color.black);
		c.drawRoundRect (353 + i, 170 + i - h, 10 - 2 * i, 30 - 2 * i, 20, 20);
		// body of butterfly
	    }
	    c.setColor (Color.black);
	    c.drawLine (351, 157 - h, 346, 150 - h);
	    // left antenna of butterfly
	    c.setColor (Color.black);
	    c.drawLine (361, 157 - h, 366, 150 - h);
	    // right antenna of butterfly
	    for (int i = 0 ; i <= 4 ; i++)
	    {
		c.setColor (Color.white);
		c.drawOval (351 + i, 157 + i - h, 4 - 2 * i, 8 - 2 * i);
		// left eye of butterfly
		c.setColor (Color.white);
		c.drawOval (361 + i, 157 + i - h, 4 - 2 * i, 8 - 2 * i);
		// right eye of butterfly
	    }
	    for (int i = 0 ; i <= 20 ; i++)
	    {
		c.setColor (brightOrange);
		c.drawArc (320 + i, 160 + i - h, 35 - 2 * i, 35 - 2 * i, 0, 90);
		c.setColor (brightOrange);
		c.drawArc (320 + i, 161 + i - h, 35 - 2 * i, 35 - 2 * i, 270, 90);
		c.setColor (brightOrange);
		c.drawArc (362 + i, 160 + i - h, 35 - 2 * i, 35 - 2 * i, 90, 90);
		c.setColor (brightOrange);
		c.drawArc (362 + i, 161 + i - h, 35 - 2 * i, 35 - 2 * i, 180, 90);
		// wings of butterfly
	    }
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    for (int i = 0 ; i <= 60 ; i++)
	    {
		c.setColor (skyBlue);
		c.drawLine (337, 202 - i - h, 380, 202 - i - h);
		// background behind the butterfly so that a illusion of the butterfly flying away is created
	    }
	}
    }


    public void butterflyAnim ()
    {
	buddleia (1);
	try
	{
	    Thread.sleep (41000);
	}
	catch (Exception e)
	{
	}
	// animation is delayed for an extended amount of time
	buddleia (1, 1);
    }


    public ButterFly (Console con)
    {
	c = con;
    }


    public void run ()
    {
	butterflyAnim ();
    }
}
