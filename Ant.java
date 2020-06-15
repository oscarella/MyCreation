/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28,2019
   This class displays three ants escaping their burrow after being affected by chemicals.
	This class has 3 overloaded constructors.
	The basic constructor creates an ant in a specific predetermined location and color.
	The 2nd constructor allows a parameter pass to change the starting x-position of the ant.
	The 3rd constructur allows the user to change the starting x-position of the ant and change its colour.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Ant extends Thread
{
    private Console c;
    // global variable used
    private Color antType;
    // variable determines the color of the ant
    private int x;
    // variable determines the starting x-position of the ant

    public void antAnim ()
    {
	Color burrowBrown = new Color (163, 113, 75);
	// color is used to create the hole that the ant digs underground
	for (int m = 0 ; m <= 670 - x ; m++)
	    // ants animation- moves right until it is offscreen
	    {
		synchronized (c)
		{
		    c.setColor (burrowBrown);
		    c.fillRoundRect (x - 31 + m, 250, 60, 20, 20, 20);

		    // creates the illusion of the ant diggin a hole
		    for (int i = 0 ; i <= 20 ; i += 5)
		    {
			c.setColor (antType);
			c.drawLine (x - 18 + i + m, 257, x - 18 + i + m, 267);
			// legs of ant
		    }
		    c.setColor (antType);
		    c.fillOval (x + m, 255, 15, 10);
		    // head of ant
		    //c.setColor (antType);
		    c.fillRect (x + 10 + m, 257, 7, 5);
		    // nose of ant
		    // c.setColor (antType);
		    c.fillRoundRect (x - 18 + m, 257, 20, 8, 10, 10);
		    // body of ant
		    // c.setColor (antType);
		    c.fillOval (x - 30 + m, 255, 15, 10);
		    // back of ant
		    // c.setColor (antType);
		    c.drawLine (x + 2 + m, 255, x + m, 250);
		    // c.setColor (antType);
		    c.drawLine (x + 7 + m, 255, x + 10 + m, 250);
		    // antennas of ant
		    c.setColor (Color.black);
		    c.fillOval (x + 8 + m, 258, 2, 2);
		    // eye of ant
		    try
		    {
			Thread.sleep (30);
		    }
		    catch (Exception e)
		    {
		    }
		    //used to delay the animation
		}
	    }
    }



    //basic ant
    public Ant (Console con)
    {
	c = con;
	antType = new Color (128, 0, 0);
	// colour of ant is predetermined as maroon
	x = 240;
	// x-coordinate of ant is predetermined: 240

    }


    // ant with a location parameter
    public Ant (Console con, int xCoord)
    {
	c = con;
	antType = new Color (128, 0, 0);
	// colour of ant is predetermined as maroon
	x = xCoord;


    }


    // ant with a location and colour parameter
    public Ant (Console con, Color n, int xCoord)
    {
	c = con;
	antType = n;
	x = xCoord;

    }


    public void run ()
    {
	antAnim ();
    }
}
