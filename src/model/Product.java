package model;
public class Product
{
	//----------------------------------Attribute----------------------------------------------------------------------------------
	private String name;

	private float price;

	private boolean onStock;
	
	// ----------------------------------Constructor--------------------------------------------------------------------------------
	public Product(String name,float price, boolean onStock)
	{
		setName(name);
		setOnStock(onStock);
		setPrice(price);
	}
	
	public Product()
	{
		this("Coca-Cola",10.0f, true);
	}
	
	// ----------------------------------Getter-------------------------------------------------------------------------------------

	public String getName()
	{
		return name;
		}
	public float getPrice()
		{
		return price;
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
	public  void setPrice(float price)
	{
		{
		this.price = price;
		}
	}
	private void setOnStock(boolean onStock)
	{
		if(this.onStock != onStock)
			this.onStock = onStock;
	}
}
