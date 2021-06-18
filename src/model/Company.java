package model;

import java.util.*;

public class Company
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private TreeSet<Product> products;
	private String name;

	// ----------------------------------Constructor--------------------------------------------------------------------------------
	
	public Company(String name)
	{
		init();
		setName(name);
	}
	public Company()
	{
		this("IBM");
	}
	private void init()
	{
		products = new TreeSet<>();
	}
	// ----------------------------------Getter-------------------------------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	// ----------------------------------Setter-------------------------------------------------------------------------------------
	public void setName(String name)
	{
		this.name = name;
	}	
}