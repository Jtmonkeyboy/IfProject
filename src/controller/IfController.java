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
		
		String color = JOptionPane.showInputDialog(null, String.format("What is the color of %s?", name));
		userPiano.setColor(color);
		
		String hasWheels = JOptionPane.showInputDialog(null, String.format("True or false?\nDoes %s have wheels?", name));
		userPiano.setHasWheels(Boolean.parseBoolean(hasWheels.toLowerCase()));
		
		String hasStrings = JOptionPane.showInputDialog(null, String.format("True or false?\nIs %s an electic piano?", name));
		userPiano.setHasStrings(Boolean.parseBoolean(hasStrings.toLowerCase()));
		
		String keys = JOptionPane.showInputDialog(null, String.format("How many keys does %s have?", name));
		while(!validInt(keys))
		{
			keys = JOptionPane.showInputDialog(null, String.format("Try again!\nHow many keys does %s have?", name));
		}
		userPiano.setKeys(Integer.parseInt(keys));
		
		loopy();
	}
	private void loopy()
	{
		//have to define a variable before the loop.
		boolean isFinished = false;
		int someCount = 0;
		Piano yourThing = new Piano();
		
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "annoy everyone!!!!\n" + someCount);
			someCount += 1;
			if(someCount > 10)
			{
				isFinished = true;
			}
		}
		
		for (int index = 0; index < 10; index++)
		{
			JOptionPane.showMessageDialog(null, "This is execution number\n" + index);
		}
		
		isFinished = false;
		while (!isFinished)
		{
			String fruitLoop = JOptionPane.showInputDialog(null, "Do you want a fruit loop?");
			if(fruitLoop.toLowerCase().equals("yes"))
			{
				JOptionPane.showMessageDialog(null, "Correct!!");
				isFinished = true;
			}
			else if (fruitLoop.toLowerCase().equals("kill me"))
			{
				JOptionPane.showMessageDialog(null, "It will happen some day so why not now...");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "WRONG!");
			}
		}
	}
	
	public boolean validInt(String sample)
	{
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(sample);
			isValid = true;
		}
		
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This variable has to be an integer.");
		}
		return isValid;
	}
}
