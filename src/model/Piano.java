package model;

public class Piano
{
	private String name;
	private String color;
	private boolean hasWheels;
	private boolean hasStrings;
	private int keys;
	
	/**
	 * Default constructor for a piano.
	 * Initializes all variables to valid but "bad" values.
	 * Used for later customization.
	 */
	public Piano()
	{
		this.name = "El Piano";
		this.color = "black";
		this.hasWheels = false;
		this.hasStrings = true;
		this.keys = 88;
	}
	
	public Piano(String name, String color, boolean hasWheels, boolean hasStrings, int keys)
	{
		
		this.name = name;
		this.color = color;
		this.hasWheels = hasWheels;
		this.hasStrings = hasStrings;
		this.keys = keys;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean getHasWheels()
	{
		return hasWheels;
	}
	
	public boolean getHasStrings()
	{
		return hasStrings;
	}
	
	public int getkeys()
	{
		return keys;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public void setHasWheels(boolean hasWheels)
	{
		this.hasWheels = hasWheels;
	}
	
	public void setHasStrings(boolean hasStrings)
	{
		this.hasStrings = hasStrings;
	}
	public void setKeys(int keys)
	{
		this.keys = keys;
	}
	
	public String toString()
	{
		String description = "The piano's name is " + name + ".\n"
				+ "The color is " + color + " and it has strings.\n"
				+ "The piano does not have wheels.\n"
				+ "it is not electic\n"
				+ "My piano has about " + keys + " keys.";
		return description;
	}
}
