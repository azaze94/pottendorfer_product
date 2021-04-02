package model;
public class Product
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private String name;
	private boolean onStock;
	
	// ----------------------------------Constructor--------------------------------------------------------------------------------
	public Product(String name, boolean onStock)
	{
		setName(name);
		setOnStock(onStock);
	}
	
	public Product()
	{
		this("Coca-Cola", true);
	}
	
	// ----------------------------------Getter-------------------------------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	private boolean isOnStock()
	{
		return onStock;
	}
	
	// ----------------------------------Setter-------------------------------------------------------------------------------------
	public  void setName(String name)
	{
		this.name = name;
	}
	private void setOnStock(boolean onStock)
	{
		if(this.onStock != onStock)
			this.onStock = onStock;
	}
}
