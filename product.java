public class Product
{
	private String name;

	public Product(String name)
		{
		setName(name);
		}
	public Product()
		{
		this("Coca-Cola")
		}
	public String getName()
		{
		return name;
		}
	public  void setName(String name)
		{
		this.name = name;
		}
}
