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
		this.isMovable = false;
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
	
	public String getName()
	{
		return name;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public boolean getIsMovable()
	{
		return isMovable;
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
	
	public void setIsMovable(boolean isMovable)
	{
		this.isMovable = isMovable;
	}
	
	public void setHasStrings(boolean hasStrings)
	{
		this.hasStrings = hasStrings;
	}
	public void setKeys(int keys)
	{
		this.keys = keys;
	}
}
