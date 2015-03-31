public class Inventory
{
	private String name;	//the name of the product
	private double price;	//the price you are charging for one unit of merchandise
	private int quantity;	//a single serving or one unit of your merchandise, i.e. one hot dog or one can of soda
	private double cost;	//the price you paid for one unit of merchandise
	private final int initialQuantity;	//the quantity of merchandise that you had when you started the sale

	public Inventory()
	{
		this("None",-1,-1);
	}

	public Inventory(String name, double price, int quantity)
	{
		setName(name);
		setPrice(price);
		setQuantity(quantity);
		initialQuantity=quantity;
	}

	public void setName(String name)
	{
		this.name=name;
	}

	public void setPrice(double price)
	{
		this.price=price;
	}

	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}

	public void setCost(double cost)
	{
		this.cost=cost;
	}

	public String getName()
	{
		return name;
	}

	public double getPrice()
	{
		return price;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getCost()
	{
		return cost;
	}

	public double calculateValue()
	{
		return price*quantity;
	}

	public double calculateRevenue()
	{
		return price*(initialQuantity-quantity);
	}

	public double calculateCost()
	{
		return cost*quantity;
	}

	public double calculateIncome()
	{
		return calculateRevenue()-calculateCost();
	}

	public int calculateUnitsSold()
	{
		return initialQuantity-quantity;
	}

	public String toString()
	{
		return String.format("%s Inventory\nPrice: $%.2f\nQuantity: %d units\nUnits sold: %d",getName(),getPrice(),getQuantity(),calculateUnitsSold());
	}
}