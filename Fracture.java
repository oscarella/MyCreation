/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28, 2019
   This class displays fractures, which are basically holes in the rock area so that oils and gases can travel into the pipes. Unfortunately, chemicals
   start to leak into the soil and groundwater.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Fracture extends Thread
{
    private Console c;

    public void pipeEffect ()
    {
	Color moistGreen = new Color (174, 191, 179);
	// colours are used to draw the fractures
	Color chemGreen = new Color (180, 235, 136);
	// Colours are used to draw the leaks
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.setColor (moistGreen);
	    c.drawLine (140, 455 - i, 150, 455 - i);
	    c.setColor (moistGreen);
	    c.drawLine (270, 455 - i, 277, 455 - i);
	    // first and last fractures on the top part of the pipes
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (Exception e)
	    {
	    }
	}
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.setColor (moistGreen);
	    c.drawLine (180, 455 - i, 187, 455 - i);
	    c.setColor (moistGreen);
	    c.drawLine (220, 455 - i, 227, 455 - i);
	    // second and third fractures on the top part of the pipes
	    c.setColor (moistGreen);
	    c.drawLine (140, 485 + i, 148, 485 + i);
	    c.setColor (moistGreen);
	    c.drawLine (180, 485 + i, 189, 485 + i);
	    c.setColor (moistGreen);
	    c.drawLine (220, 485 + i, 230, 485 + i);
	    c.setColor (moistGreen);
	    c.drawLine (285, 485 + i, 295, 485 + i);
	    // fractures on the bottom part of the pipes
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (Exception e)
	    {
	    }
	}

	for (int i = 0 ; i <= 7 ; i++)
	{
	    c.setColor (moistGreen);
	    c.drawLine (180 + i, 425, 170 + i, 410);
	    c.setColor (moistGreen);
	    c.drawLine (180, 425 - i, 187, 425 - i);
	    // branches of the second fracture on top of the pipes
	    c.setColor (moistGreen);
	    c.drawLine (220 + i, 425, 195 + i, 400);
	    c.setColor (moistGreen);
	    c.drawLine (227 - i, 425, 240 - i, 405);
	    // branches of the third fracture on top of the pipes
	    c.setColor (moistGreen);
	    c.drawLine (270 + i, 435, 300 + i, 410);
	    // branches of the fourth fracture on top of the pipes
	    try
	    {
		Thread.sleep (200);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColor (chemGreen);
	c.drawLine (180, 370, 198, 400);
	c.setColor (chemGreen);
	c.drawLine (237, 405, 280, 370);
	// bottoms of first and second chemical leak (from the left)
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (moistGreen);
	    c.drawLine (180, 370, 180, 370 - i);
	    c.setColor (moistGreen);
	    c.drawLine (280, 370, 280, 370 - i);
	    // top part of first and second chemical leak (from the left)
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
	    c.setColor (moistGreen);
	    c.drawLine (300 + i, 410, 303 + i, 405);
	    // third chemical leak (from the left)
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
	    c.setColor (moistGreen);
	    c.drawLine (505, 375, 505 + i, 375 + i);
	    c.setColor (moistGreen);
	    c.drawLine (505, 405, 505 + i, 405 - i);
	    // branches of second chemical leak (from the right)
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
	    c.setColor (moistGreen);
	    c.drawLine (520, 390, 520 + i, 390);
	    // second chemical leak (from the right)
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
	c.setColor (moistGreen);
	c.drawLine (590, 365, 580, 380);
	for (int i = 0 ; i <= 35 ; i++)
	{
	    c.setColor (moistGreen);
	    c.drawLine (590, 365, 590, 365 - i);
	    // chemical leak on the far right
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    public Fracture (Console con)
    {
	c = con;
    }


    public void run ()
    {
	pipeEffect ();
    }
}
