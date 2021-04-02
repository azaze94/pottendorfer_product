package model;

import java.util.ArrayList;

public class Company
{

	private ArrayList<Product> products;
	
	public Company()
	{
		init();
	}
	private void init()
	{
		new ArrayList<>(50);
	}
}