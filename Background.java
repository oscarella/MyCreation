/*
   Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28, 2019
   This class contains objects that are part of the background. These objects either add detail or are used to highlight the effects of fracking
   on the environment. The background includes the soil profile (including groundwater, oil, and rocks), forestry, drilling rig, and the habitats
   of certain animals. My name is also included in the background.
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Background
{
    //global variable used
    private Console c;

    //class to make background
    public void draw ()
    {
	// Creates own colours for use
	Color white = new Color (255, 255, 255);
	Color grey = new Color (160, 160, 160);
	Color brown = new Color (105, 59, 14);
	Color blue = new Color (0, 102, 204);
	Color darkBrown = new Color (69, 37, 6);
	Color darkestBrown = new Color (33, 17, 1);
	Color skyBlue = new Color (135, 206, 250);
	// colours used for soil profie and sky
	Color darkGrey = new Color (61, 59, 59);
	Color elephantGrey = new Color (89, 88, 88);
	Color beige = new Color (247, 220, 193);
	Color orange = new Color (235, 102, 40);
	Color red = new Color (204, 0, 0);
	Color carminePink = new Color (235, 76, 66);
	// colours used for drilling rigs
	Color salleGreen = new Color (10, 107, 29);
	Color pastelGreen = new Color (19, 201, 55);
	// colours used for plants on the surface
	Color barkBrown = new Color (139, 69, 19);
	Color forestGreen = new Color (34, 139, 34);
	// colours used for the tree on the surface
	Color burrowBrown = new Color (163, 113, 75);
	// colours used for the underground burrow
	Color sandYellow = new Color (232, 196, 95);
	Color darkYellow = new Color (115, 95, 38);
	// colours used for ant burrow
	Color orangeBrown = new Color (230, 111, 64);
	Color darkOrange = new Color (171, 77, 39);
	Color roseBrown = new Color (120, 47, 18);
	// colours used for treehouse on the tree

	c.setColor (grey);
	for (int i = 0 ; i < 61 ; i++)
	{
	    c.drawLine (0, 500 - i, 640, 500 - i);
	}
	// shale rock layer (bottom layer of soil profile)
	c.setColor (brown);
	for (int i = 0 ; i < 121 ; i++)
	{
	    c.drawLine (0, 440 - i, 640, 440 - i);
	}
	// third layer of soil from the top
	c.setColor (blue);
	for (int i = 0 ; i < 51 ; i++)
	{
	    c.drawLine (0, 330 - i, 640, 330 - i);
	}
	// groundwater level
	c.setColor (darkBrown);
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.drawLine (0, 280 - i, 640, 280 - i);
	}
	// second layer of soil from the top
	c.setColor (darkestBrown);
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.drawLine (0, 260 - i, 640, 260 - i);
	}
	// first layer of soil from the top
	c.setColor (skyBlue);
	for (int i = 0 ; i < 241 ; i++)
	{
	    c.drawLine (0, 240 - i, 640, 240 - i);
	}
	// sky
	c.setColor (orange);
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.drawLine (60, 240 - i, 140, 240 - i);
	    c.drawLine (30, 240, 60, 240 - i);
	    c.drawLine (140, 240 - i, 170, 240);
	}
	// base of drilling rig
	c.setColor (beige);
	for (int i = 0 ; i < 41 ; i++)
	{
	    c.drawLine (60, 220 - i, 70, 220 - i);
	    c.drawLine (130, 220 - i, 140, 220 - i);
	}
	// supports of first compartment of drilling rig
	c.setColor (carminePink);
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.drawLine (60 + i, 170, 70 + i, 120);
	    c.drawLine (120 + i, 120, 130 + i, 170);
	}
	// supports of second compartment of drilling rig
	c.setColor (red);
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.drawLine (50, 180 - i, 150, 180 - i);
	    c.drawLine (65, 120 - i, 135, 120 - i);
	}
	// base and ceiling of second compartment
	c.setColor (beige);
	for (int i = 0 ; i < 6 ; i++)
	{
	    c.drawLine (70 + i, 110, 80 + i, 60);
	    c.drawLine (115 + i, 60, 125 + i, 110);
	}
	// supports of third compartment of drilling rig
	c.setColor (red);
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.drawLine (80, 60 - i, 120, 60 - i);
	}
	//top of third compartment
	c.setColor (white);
	for (int i = 0 ; i < 31 ; i++)
	{
	    c.drawLine (115, 50 - i, 120, 50 - i);
	}
	// pole of Canadian flag
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.setColor (white);
	    c.drawLine (120, 40 - i, 160, 40 - i);
	    c.setColor (Color.red);
	    c.drawLine (120, 40 - i, 130, 40 - i);
	    c.drawLine (150, 40 - i, 160, 40 - i);
	}
	// Canadian flag
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawMapleLeaf (133 + i, 23 + i, 14 - 2 * i, 14 - 2 * i);
	}
	// maple leaf inside Canadian flag
	c.setColor (darkGrey);
	for (int i = 0 ; i < 71 ; i++)
	{
	    c.drawLine (90, 240 - i, 110, 240 - i);
	}
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.drawLine (95, 170 - i, 105, 170 - i);
	}
	for (int i = 0 ; i < 31 ; i++)
	{
	    c.drawLine (90, 150 - i, 110, 150 - i);
	}
	for (int i = 0 ; i < 51 ; i++)
	{
	    c.drawLine (97, 110 - i, 103, 110 - i);
	}
	for (int i = 0 ; i < 11 ; i++)
	{
	    c.drawLine (97, 50 - i, 103, 50 - i);
	    c.drawLine (95, 40 - i, 105, 40 - i);
	}
	// pipes connected to the drilling rig on the surface
	c.setColor (Color.yellow);
	for (int i = 0 ; i < 6 ; i++)
	{
	    c.drawLine (95, 30 - i, 105, 30 - i);
	}
	// light on top of the drilling rig
	c.setColor (white);
	c.drawLine (70, 180, 130, 220);
	c.drawLine (70, 220, 130, 180);
	// string connecting supports of first compartment
	c.setColor (red);
	c.drawLine (70, 170, 120, 120);
	c.drawLine (80, 120, 130, 170);
	// string connecting supports of second compartment
	c.setColor (white);
	c.drawLine (75, 110, 115, 60);
	c.drawLine (85, 60, 125, 110);
	// strings connecting third compartment
	c.setColor (elephantGrey);
	c.drawLine (70, 185, 125, 220);
	c.drawLine (75, 220, 130, 185);
	for (int i = 0 ; i <= 2 ; i++)
	{
	    c.drawLine (70 + i, 220, 70 + i, 180);
	    c.drawLine (130 - i, 220, 130 - i, 180);
	    c.drawLine (70 + i, 170, 80 + i, 120);
	    c.drawLine (120 - i, 120, 130 - i, 170);
	    c.drawLine (75 + i, 110, 85 + i, 60);
	    c.drawLine (115 - i, 60, 125 - i, 110);
	}
	// shadows of strings and supports on drilling rigs
	c.setColor (carminePink);
	for (int i = 0 ; i <= 70 ; i += 5)
	{
	    c.drawLine (65 + i, 110, 65 + i, 100);
	}
	c.drawLine (65, 100, 135, 100);
	// protective fences above second compartment
	c.setColor (carminePink);
	c.drawLine (80, 40, 120, 40);
	for (int i = 0 ; i <= 40 ; i += 5)
	{
	    c.drawLine (80 + i, 50, 80 + i, 40);
	}
	// protective fences above third compartment
	c.setColor (white);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawOval (150 + i, 50 + i, 50 - 2 * i, 30 - 2 * i);
	    c.drawOval (180 + i, 45 + i, 60 - 2 * i, 40 - 2 * i);
	    // left cloud
	    c.drawOval (420 + i, 100 + i, 65 - 2 * i, 35 - 2 * i);
	    c.drawOval (395 + i, 100 + i, 45 - 2 * i, 25 - 2 * i);
	    c.drawOval (460 + i, 100 + i, 45 - 2 * i, 25 - 2 * i);
	    //right cloud
	}
	// clouds in the sky
	for (int x = 350 ; x <= 600 ; x += 50)
	{
	    for (int y = 0 ; y <= 10 ; y++)
	    {
		c.drawOval (x + y, 450 + y, 10 - 2 * y, 10 - 2 * y);
	    }
	}
	// first layer of gas and oil in the shale (represented by white ovals)
	for (int x = 380 ; x <= 630 ; x += 50)
	{
	    for (int y = 0 ; y <= 10 ; y++)
	    {
		c.drawOval (x + y, 465 + y, 10 - 2 * y, 10 - 2 * y);
	    }
	}
	// second layer of gas and oil in the shale (represented by white ovals)
	for (int x = 350 ; x <= 630 ; x += 50)
	{
	    for (int y = 0 ; y <= 10 ; y++)
	    {
		c.drawOval (x + y, 480 + y, 10 - 2 * y, 10 - 2 * y);
	    }
	}
	// third layer of gas and oil in the shale (represented by white ovals)
	c.setColor (barkBrown);
	for (int i = 0 ; i <= 140 ; i++)
	{
	    c.drawLine (600, 240 - i, 640, 240 - i);
	}
	// tree stem
	for (int i = 0 ; i <= 140 ; i++)
	{
	    c.drawLine (590, 240, 600, 240 - i);
	}
	// tree stem
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (530, 110 + i, 600, 120 + i);
	}
	// tree branch
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawLine (515 + i, 110, 515 + i, 118);
	}
	// upper twig on tree branch
	for (int i = 0 ; i <= 25 ; i++)
	{
	    c.drawLine (525, 118 + i, 530, 118 + i);
	}
	// lower twig on tree branch
	c.setColor (forestGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawOval (540 + i, 75 + i, 100 - 2 * i, 45 - 2 * i);
	    c.drawOval (580 + i, 85 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (620 + i, 85 + i, 80 - 2 * i, 35 - 2 * i);
	    c.drawOval (530 + i, 60 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (510 + i, 50 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (505 + i, 35 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (515 + i, 20 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (525 + i, 5 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (530 + i, -5 + i, 60 - 2 * i, 35 - 2 * i);
	    c.drawOval (550 + i, 40 + i, 120 - 2 * i, 60 - 2 * i);
	    c.drawOval (560 + i, 15 + i, 120 - 2 * i, 40 - 2 * i);
	    c.drawOval (590 + i, -5 + i, 70 - 2 * i, 30 - 2 * i);
	    // green leaves on the tree
	}
	c.setColor (burrowBrown);
	for (int i = 0 ; i <= 50 ; i++)
	{
	    c.drawOval (320 + i, 350 + i, 90 - 2 * i, 70 - 2 * i);
	    c.drawOval (380 + i, 350 + i, 95 - 2 * i, 65 - 2 * i);
	    // underground burrow of the larvae
	}
	c.setColor (Color.gray);
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawRoundRect (15 + i, 360, 30 - 2 * i, 25, 20, 20);
	    c.drawRoundRect (30 + i, 365, 35 - 2 * i, 25, 20, 20);
	    // first underground rock (from the left)
	}
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawRoundRect (130, 370 + i, 22, 55 - 2 * i, 15, 15);
	    // second underground rock (from the left)
	}

	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawRoundRect (220 + i, 350, 40 - 2 * i, 15, 20, 20);
	    c.drawRoundRect (235 + i, 355, 30 - 2 * i, 15, 20, 20);
	    // third underground rock (from the left)
	}
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawRoundRect (240 + i, 420, 22 - 2 * i, 13, 10, 10);
	    c.drawRoundRect (247 + i, 415, 22 - 2 * i, 13, 10, 10);
	    c.drawRoundRect (254 + i, 410, 22 - 2 * i, 13, 10, 10);
	    // fourth underground rock (from the left)
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawRoundRect (500 + i, 340, 35 - 2 * i, 25, 15, 15);
	    c.drawRoundRect (520 + i, 350, 30 - 2 * i, 20, 15, 15);
	    // third underground rock (from the right)
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawRoundRect (530 + i, 415, 40 - 2 * i, 10, 10, 10);
	    // second underground rock (from the right)
	}
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawRoundRect (610, 355 + i, 20, 35 - 2 * i, 25, 25);
	    c.drawRoundRect (610, 365 + i, 15, 40 - 2 * i, 25, 25);
	    // first underground rock (from the right)
	}
	c.setColor (salleGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (280, 240 - i, 290, 240 - i);
	    c.drawLine (270, 240, 280, 240 - i);
	}
	// bottom of first plant (from the left)
	for (int i = 0 ; i <= 35 ; i++)
	{
	    c.drawLine (280, 210 - i, 290, 210);
	}
	// top of first plant (from the left)

	c.setColor (Color.pink);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (265 + y, 170 + y, 30 - 2 * y, 10 - 2 * y);
	    c.drawOval (275 + y, 160 + y, 10 - 2 * y, 30 - 2 * y);
	}
	// leaves of flower on first plant
	c.setColor (Color.yellow);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (275 + y, 170 + y, 10 - 2 * y, 10 - 2 * y);
	}
	// bud of flower on first plant
	c.setColor (salleGreen);
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawLine (285 + i, 240, 295 + i, 210);
	}
	// bottom of third plant (from the left)
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawLine (295, 210, 310, 210 - i);
	}
	// top of third plant (from the left)
	c.setColor (pastelGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (290, 240 - i, 295, 240 - i);
	}
	// bottom of second plant (from the left)
	for (int i = 0 ; i <= 5 ; i++)
	{
	    c.drawLine (290 + i, 210, 295 + i, 185);
	}
	// top of second plant (from the left)
	c.setColor (Color.magenta);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (285 + y, 180 + y, 30 - 2 * y, 10 - 2 * y);
	    c.drawOval (295 + y, 170 + y, 10 - 2 * y, 30 - 2 * y);
	}
	// leaves of flower on second plant
	c.setColor (Color.yellow);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (295 + y, 180 + y, 10 - 2 * y, 10 - 2 * y);
	}
	// bud of flower on second plant
	c.setColor (pastelGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (310, 240 - i, 360, 240 - i);
	}
	// bottom of fourth plant (from the left)
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (310, 210 - i, 320, 210);
	    c.drawLine (340 + i, 210 - i, 360 - i, 210 - i);
	}
	// part of top of fourth plant (from the left)
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawLine (320, 210, 330, 210 - i);
	    c.drawLine (330, 210 - i, 340, 210);
	}
	// part of top of fourth plant (from the left)
	c.setColor (Color.gray);
	for (int i = 0 ; i <= 25 ; i++)
	{
	    c.drawRoundRect (360 + i, 210, 30 - 2 * i, 30, 20, 20);
	    c.drawRoundRect (380 + i, 200, 50 - 2 * i, 40, 20, 20);
	}
	// rocks on the surface
	c.setColor (salleGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (430, 240 - i, 440, 240 - i);
	}
	// bottom of fifth plant (from the left)
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (430 + i, 210, 440 + i, 190);
	}
	// top of fifth plant (from the left)
	c.setColor (Color.pink);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (430 + y, 180 + y, 30 - 2 * y, 10 - 2 * y);
	    c.drawOval (440 + y, 170 + y, 10 - 2 * y, 30 - 2 * y);
	}
	// leaves of flower on fifth plant
	c.setColor (Color.yellow);
	for (int y = 0 ; y <= 10 ; y++)
	{
	    c.drawOval (440 + y, 180 + y, 10 - 2 * y, 10 - 2 * y);
	}
	// bud of flower on fifth plant
	c.setColor (pastelGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (450, 240 - i, 530, 240 - i);
	}
	// bottom of eighth plant (from the left)
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (450, 210 - i, 460, 210);
	    c.drawLine (460 + i, 210 - i, 480 - i, 210 - i);
	    c.drawLine (520, 210, 530, 210 - i);
	}
	// left part of top of eighth plant (from the left)
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawLine (480 + i, 210 - i, 520 - i, 210 - i);
	}
	// middle part of top of eighth plant (from the left)
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.drawLine (530, 240 - i, 540, 240);
	}
	// right part of eighth plant (from the left)
	c.setColor (salleGreen);
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (440, 240 - i, 450, 240 - i);
	    c.drawLine (460, 240 - i, 470, 240 - i);
	}
	// bottom of sixth and seventh plant (from the left)
	for (int i = 0 ; i <= 10 ; i++)
	{
	    c.drawLine (440 + i, 210, 450 + i, 200);
	    c.drawLine (460 + i, 210, 450 + i, 200);
	}
	// middle of sixth and seventh plant(from the left)
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawLine (450, 200 - i, 460, 200);
	}
	// top of sixth plant(from the left)
	for (int i = 0 ; i <= 30 ; i++)
	{
	    c.drawLine (450, 200 - i, 460, 200);
	}
	// top of seventh plant(from the left)
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.drawLine (540, 240 - i, 555, 240 - i);
	    c.drawLine (555, 240 - i, 570, 240);
	}
	// bottom of ninth plant(from the left)
	for (int i = 0 ; i <= 15 ; i++)
	{
	    c.drawLine (540 + i, 200, 550 + i, 180);
	}
	// middle of ninth plant(from the left)
	for (int i = 0 ; i <= 20 ; i++)
	{
	    c.drawLine (550, 180 - i, 560, 180);
	}
	// top of ninth plant(from the left)
	for (int i = 0 ; i <= 42 ; i++)
	{
	    c.setColor (darkYellow);
	    c.drawArc (175 + i, 210 + i, 90 - 2 * i, 65 - 2 * i, 0, 180);
	}
	// ant burrow shadow
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (sandYellow);
	    c.drawArc (180 + i, 211 + i, 80 - 2 * i, 60 - 2 * i, 0, 180);
	}
	// ant burrow
	for (int i = 0 ; i <= 40 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (210 + i, 215 + i, 35 - 2 * i, 20 - 2 * i);
	}
	// ant burrow cover
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

	c.setFont (new Font ("Sans Serif", Font.BOLD, 20));
	c.setColour (Color.white);
	c.drawString ("by", 5, 20);
	c.drawString ("Oscar", 5, 40);
	c.drawString ("Han", 5, 60);
	// name is displayed in the background
    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
}
