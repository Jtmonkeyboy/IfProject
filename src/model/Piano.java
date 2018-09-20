package model;

public class Piano
{
	private String name;
	private String color;
	private boolean isMovable;
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
		this.color = "Black";
		this.hasStrings = true;
		this.keys = 88;
	}
	
	public Piano(String name, String color, boolean isMovable, boolean hasStrings, int keys)
	{
		
		this.name = name;
		this.color = color;
		this.isMovable = isMovable;
		this.hasStrings = hasStrings;
		this.keys = keys;
	}
}
