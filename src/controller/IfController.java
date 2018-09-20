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
	}
}
