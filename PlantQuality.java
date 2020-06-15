/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   This class displays the effects fracking can have on the plants. After the chemicals from the pipes slowly leach into the water, they are consumed
   by the root of the plants- the once green plants now look dead.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class PlantQuality extends Thread
{
    private Console c;

    public void plantAnim ()
    {
	Color tanGreen = new Color (148, 153, 77);
	Color pukeGreen = new Color (86, 89, 37);
	// Colours are used to make the stem of the plants look dead
	Color deadYellow = new Color (128, 135, 27);
	Color redBean = new Color (122, 96, 69);
	// Colours are used to make the bud/ leaves of the plants look dead

	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColor (pukeGreen);
	    c.drawLine (285 + i, 240, 295 + i, 210);
	    // bottom of third plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColor (pukeGreen);
	    c.drawLine (295, 210, 310, 210 - i);
	    // top of third plant (from the bottom)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (310, 240 - i, 360, 240 - i);
	    // bottom of fourth plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (310, 210 - i, 320, 210);
	    c.setColor (tanGreen);
	    c.drawLine (340 + i, 210 - i, 360 - i, 210 - i);
	    // top of fourth plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (320, 210, 330, 210 - i);
	    c.setColor (tanGreen);
	    c.drawLine (330, 210 - i, 340, 210);
	    // top of the fourth plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (450, 240 - i, 530, 240 - i);
	    // bottom of eighth plant (from the left)
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
	    c.setColor (tanGreen);
	    c.drawLine (530, 240 - i, 540, 240);
	    // right part of eighth plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (450, 210 - i, 460, 210);
	    c.setColor (tanGreen);
	    c.drawLine (460 + i, 210 - i, 480 - i, 210 - i);
	    c.setColor (tanGreen);
	    c.drawLine (520, 210, 530, 210 - i);
	    // left part of top of eighth plant (from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (tanGreen);
	    c.drawLine (480 + i, 210 - i, 520 - i, 210 - i);
	    // middle part of top of eighth plant (from the left)
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
	    c.setColor (pukeGreen);
	    c.drawLine (540, 240 - i, 555, 240 - i);
	    c.setColor (pukeGreen);
	    c.drawLine (555, 240 - i, 570, 240);
	    // bottom of ninth plant(from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.setColor (pukeGreen);
	    c.drawLine (540 + i, 200, 550 + i, 180);
	    // middle of ninth plant(from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (pukeGreen);
	    c.drawLine (550, 180 - i, 560, 180);
	    // top of ninth plant(from the left)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (redBean);
	    c.drawOval (265 + y, 170 + y, 30 - 2 * y, 10 - 2 * y);
	    c.setColor (redBean);
	    c.drawOval (275 + y, 160 + y, 10 - 2 * y, 30 - 2 * y);
	    // leaves of flower on first plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (deadYellow);
	    c.drawOval (275 + y, 170 + y, 10 - 2 * y, 10 - 2 * y);
	    // bud of flower on first plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (redBean);
	    c.drawOval (285 + y, 180 + y, 30 - 2 * y, 10 - 2 * y);
	    c.setColor (redBean);
	    c.drawOval (295 + y, 170 + y, 10 - 2 * y, 30 - 2 * y);
	    // leaves of flower on second plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (deadYellow);
	    c.drawOval (295 + y, 180 + y, 10 - 2 * y, 10 - 2 * y);
	    // bud of flower on second plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (redBean);
	    c.drawOval (430 + y, 180 + y, 30 - 2 * y, 10 - 2 * y);
	    c.setColor (redBean);
	    c.drawOval (440 + y, 170 + y, 10 - 2 * y, 30 - 2 * y);
	    // leaves of flower on fifth plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.setColor (deadYellow);
	    c.drawOval (440 + y, 180 + y, 10 - 2 * y, 10 - 2 * y);
	    // bud of flower on fifth plant
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public PlantQuality (Console con)
    {
	c = con;
    }


    public void run ()
    {
	plantAnim ();
    }
}
