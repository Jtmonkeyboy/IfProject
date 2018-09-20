package model;

public class Piano
{
	private String name;
	private String color;
	private boolean isMovable;
	private boolean hasStrings;
	private int keys;
	
	public Piano()
	{
		
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
