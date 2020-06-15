/*
   Name: Oscar Jaewon Han
   Teacher: Ms. Krasteva
   Date: Oct. 28th, 2019
   MyCreation.java runs the other classes.
   
	This program demonstrates the issue of fracking using birds and insects. The animation starts with pipes being layered from the drilling rig 
   into the shale rock layer. Once the pipe reaches the shale rock, the chemicals allow trapped gas and oil in the shale rock layer to flow into the pipes.
   Fractures are formed on the sides of the pipes, and the chemicals from the pipes start to leach into the soil shown by liquid flow. Next, the chemicals
   start to travel up into the groundwater, so the stonefly leaves before the chemicals mix with the groundwater and turn it orange. At the same time, the
   once trapped gases are accidentally released in the underground burrow of the larvae located on top of the shale layer. While the larvae tries to escape,
   the gases eventually suffocate the larvae. Eventually, the chemicals reach the plants and kills them, evidenced by a color change. As the plants die,
   you see a multitude of animals escape to find a new habitat as their old habitat can no longer support them. First, ants (which are now contaminated with
   chemicals), leave their ant burrow underground. Second, the butterfly flies upwards. Next, a fly resting on the rock follows the butterfly and flies up. 
   Lastly, a blue jay, which was resting in its treehouse on the tree, travels left and leaves its home. Although the habitat is now destroyed and there are
   no more animals left, the gases continue to be imported into the pipe, which is representative of the long-term effects of fracking.
   
   Citation (synchronized ()): https://www.geeksforgeeks.org/synchronized-in-java/
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    //adds the Background thread to MyCreation
    public void background ()
    {
	//not a thread because it's not animated!!!
	Background b = new Background (c);
    }


    // adds the BeetleLarvae thread to MyCreation
    public void beetleNest ()
    {
	BeetleLarvae bl = new BeetleLarvae (c);
	bl.start ();
	// starts the thread
    }


    // adds the Fly thread to MyCreation
    public void regularFly ()
    {
	// creates the thread
	Fly fl = new Fly (c);
	fl.start ();
	// starts the thread
    }


    // adds the ButterFly thread to MyCreation
    public void butterfly ()
    {
	// creates the thread
	ButterFly b = new ButterFly (c);
	b.start ();
	// starts the thread
    }


    // adds the WaterBug thread to MyCreation
    public void stonefly ()
    {
	// creates the thread
	WaterBug sf = new WaterBug (c);
	sf.start ();
	// starts the thread
    }


    //adds the ChemPipes thread to MyCreation
    public void installPipes ()
    {
	// creates the thread
	ChemPipes cp = new ChemPipes (c);
	//starts the thread
	cp.start ();
	// joins with ShaleRock thread so that it only executes when ChemPipes thread is done
	try
	{
	    cp.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the ShaleRock thread to MyCreation
    public void gasExtract ()
    {
	// creates the thread
	ShaleRock s = new ShaleRock (c);
	//starts the thread
	s.start ();
    }


    //adds the Fracture thread to MyCreation
    public void leak ()
    {
	Fracture f = new Fracture (c);
	//starts the thread
	f.start ();
	// joins with WaterQuality thread so that it only executes when Fracture thread is done
	try
	{
	    f.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the WaterQuality thread to MyCreation
    public void waterDegrade ()
    {
	// creates the thread
	WaterQuality w = new WaterQuality (c);
	//starts the thread
	w.start ();
	// joins with PlantQuality thread so that it only executes when WaterQuality thread is done
	try
	{
	    w.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the PlantQuality thread to MyCreation
    public void plantDegrade ()
    {
	// creates the thread
	PlantQuality p = new PlantQuality (c);
	//starts the thread
	p.start ();
	// joins with Ant thread so that it only executes when PlantQuality thread is done
	try
	{
	    p.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the overloaded Ant threads to MyCreation
    public void antEscape ()
    {
	// creates the thread
	Ant a = new Ant (c);
	//starts the thread
	a.start ();
	Ant b = new Ant (c, 360);
	//starts the thread
	b.start ();
	Ant d = new Ant (c, Color.red, 520);
	//starts the thread
	d.start ();
	// Overloaded- second argument modifies colour and third argument modifies the starting x coordinate of the ant
	try
	{
	    d.join ();
	}
	catch (InterruptedException e)
	{
	}
	// joins with BlueJay thread so that it only executes when Ant thread is done
    }


    // adds the BlueJay thread to MyCreation
    public void flyingBird ()
    {
	// creates the thread
	BlueJay bj = new BlueJay (c);
	// starts the thread
	bj.run();
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Dangers of fracking in Canada");
    }


    public static void main (String[] args)
    {
	MyCreation mc = new MyCreation ();
	mc.background ();
	mc.beetleNest ();
	mc.regularFly ();
	mc.butterfly ();
	mc.stonefly ();
	mc.installPipes ();
	mc.gasExtract ();
	mc.leak ();
	mc.waterDegrade ();
	mc.plantDegrade ();
	mc.antEscape ();
	mc.flyingBird ();
    } // MyCreation class
}
