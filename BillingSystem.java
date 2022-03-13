
public class BillingSystem
{
	private int quantity;
	
	public BillingSystem(int qty)
	{
		quantity = qty;
	}
	
	public double tea()
	{
		double amount = 10 * quantity;
		return amount;
	}
	
	public double greenTea()
	{
		double amount = 15 * quantity;
		return amount;
	}
	
	public double samosa()
	{
		double amount = 20 * quantity;
		return amount;
	}
	
	public double sandwich()
	{
		double amount = 50 * quantity;
		return amount;
	}
}
