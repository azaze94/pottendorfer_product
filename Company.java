package model;

import java.util.*;

public class Company
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private TreeSet<Product> products;
	
	// ----------------------------------Constructor--------------------------------------------------------------------------------
	public Company()
	{
		init();
	}
	private void init()
	{
		new TreeSet<>();
	}
}