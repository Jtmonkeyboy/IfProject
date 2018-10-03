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
		loopy();
	}
	private void questions()
	{
		String name = JOptionPane.showInputDialog(null,"What is the name of your piano?");
		userPiano.setName(name);
		
		String color = JOptionPane.showInputDialog(null, String.format("What is the color of %s?", name));
		userPiano.setColor(color);
		
		String hasWheels = JOptionPane.showInputDialog(null, String.format("Does %s have wheels?", name));
		boolean correct = false;
		while(!correct)
		{
			if(hasWheels.toLowerCase().equals("true") || hasWheels.toLowerCase().equals("yes"))
			{
				correct = true;
			}
			else if(hasWheels.toLowerCase().equals("false") || hasWheels.toLowerCase().equals("no"))
			{
				correct = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your answer can only be yes/no or true/false.");
				hasWheels = JOptionPane.showInputDialog(null, String.format("Does %s have wheels?", name));
			}
		}
		userPiano.setHasWheels(Boolean.parseBoolean(hasWheels.toLowerCase()));
		
		String hasStrings = JOptionPane.showInputDialog(null, String.format("Is %s an electic piano?", name));
		while(!correct)
		{
			if(hasStrings.toLowerCase().equals("true") || hasStrings.toLowerCase().equals("yes"))
			{
				correct = true;
			}
			else if(hasStrings.toLowerCase().equals("false") || hasStrings.toLowerCase().equals("no"))
			{
				correct = true;
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Your answer can only be yes/no or true/false.");
				hasStrings = JOptionPane.showInputDialog(null, String.format("Is %s an electric piano?", name));
			}
		}
		userPiano.setHasStrings(Boolean.parseBoolean(hasStrings.toLowerCase()));
		
		String keys = JOptionPane.showInputDialog(null, String.format("How many keys does %s have?", name));
		while(!validInt(keys))
		{
			keys = JOptionPane.showInputDialog(null, String.format("Try again!\nHow many keys does %s have?", name));
		}
		userPiano.setKeys(Integer.parseInt(keys));
	}
	private void loopy()
	{
		//have to define a variable before the loop.
		boolean isFinished = false;
		int someCount = 0;
		Piano yourThing = new Piano();
		
		for(int loop = 0; loop <= 3; loop += 1)
		{
			questions();
		}
		
		while (!isFinished)
		{
			JOptionPane.showMessageDialog(null, "Annoy everyone!!!!\n" + someCount);
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
			else if(fruitLoop.toLowerCase().equals("kill me"))
			{
				JOptionPane.showMessageDialog(null, "It will happen some day so why not now...");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "WRONG!");
			}
		}
		isFinished = false;
		while(isFinished)
		{
			String egg = JOptionPane.showInputDialog(null, "Can you complete the easter egg?");
			if(egg.toLowerCase().equals("zombies"))
			{
				String round = JOptionPane.showInputDialog(null, "What is your highest round in zombies?");
				while(!validInt(round))
				{
					round = JOptionPane.showInputDialog(null, "Your answer has to be an integer.");
				}
				if(Integer.parseInt(round) >= 30)
				{
					JOptionPane.showMessageDialog(null, "");
				}
				if(Integer.parseInt(round) < 30)
				{
					
				}
			}
			else if(egg.toLowerCase().equals("i can feel it"))
			{
				JOptionPane.showMessageDialog(null, "CAN YOU FEEL IT MR. KRABS?");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "NOPE!!");
				isFinished = true;
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
