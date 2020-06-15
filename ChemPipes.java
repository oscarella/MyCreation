/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28, 2019
   This class shows blocks of pipes slowly being animated from the drilling rig in the beginning of the animation. Then, these pipes extract gases and oils
   from the layer of shale rock.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class ChemPipes extends Thread
{
    private Console c;

    public void pipesAnim ()
    {
	Color darkGrey = new Color (61, 59, 59);
	// colour is used to display the outside of the pipes
	Color chemGreen = new Color (180, 235, 136);
	// colour is used to display the inside of the pipes

	for (int i = 0 ; i <= 220 ; i++)
	{
	    c.setColor (darkGrey);
	    c.drawLine (85, 240 + i, 115, 240 + i);
	    c.setColor (chemGreen);
	    c.drawLine (90, 240 + i, 110, 240 + i);
	    // pipes are being animated down from the drilling rig until it reaches the layer of shale rock
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (darkGrey);
	    c.drawArc (85 + i, 440 + i, 45 - 2 * i, 45 - 2 * i, 180, 90);
	    // outward intercept between the pipes that are placed upwards and the pipes that are placed sideways
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (chemGreen);
	    c.drawArc (90 + i, 440 + i, 40 - 2 * i, 40 - 2 * i, 180, 90);
	    // inward intercept between the pipes that are placed upwards and the pipes that are placed sideways
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 200 ; i++)
	{
	    c.setColor (darkGrey);
	    c.drawLine (110 + i, 455, 110 + i, 485);
	    c.setColor (chemGreen);
	    c.drawLine (110 + i, 460, 110 + i, 480);
	    // pipes are extended from the shale rock area until it reaches the area with rich oils and gases
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public ChemPipes (Console con)
    {
	c = con;
    }


    public void run ()
    {
	pipesAnim ();
    }
}
