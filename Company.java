
package model;

import java.util.ArrayList;

public class Company
{

	private LinkedList<Product> products;
	private String name;
	
	public Company(String name)
	{
		init();
		setName(name);
	}
	public Company()
	{
	this(IBM);
	}
	private void init()
	{
		new LinkedList<>(50);
	}
	public void setName(String name)
	{
	this.name = name;
	}
	public String getName()
	{
	return name;
	}

}
