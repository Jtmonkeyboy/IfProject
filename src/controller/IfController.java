package controller;

import model.Piano;
import javax.swing.JOptionPane;

public class IfController
{
	private Piano myPiano;
	private Piano userPiano;
	/**
	 * Builds the instance of the Controller.
	 */
	public IfController()
	{
		myPiano = new Piano();
		userPiano = new Piano();
	}
	
	/**
	 * This is where the program starts calling methods to run the program.
	 */
	public void start()
	{
		
		JOptionPane.showMessageDialog(null, myPiano);
		String name = JOptionPane.showInputDialog(null,"What is the name of your piano?");
		userPiano.setName(name);
		
		loopy();
	}
	private void loopy()
	{
		//have to define a variable before the loop.
		boolean isFinished = false;
		int someCount = 1;
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "annoy everyone!!!!\n" + someCount);
			someCount += 1;
			if(someCount > 10)
			{
				isFinished = true;
			}
		}
	}
}
