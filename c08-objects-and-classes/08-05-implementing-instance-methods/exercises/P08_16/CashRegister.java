import java.util.*;

public class CashRegister 
{
	private ArrayList<Double> prices;

	// constructor
	public CashRegister()
	{
		this.prices = new ArrayList<Double>();
	}

	public void clear()
	{
		this.prices.clear();
	}

	public void addItem(double price)
	{
		this.prices.add(price);
	}

	public double getTotal()
	{
		double total = 0.0;
		for(int i = 0; i < this.prices.size(); i++)
		{
			total += this.prices.get(i);
		}
		return total;
	}

	public int getCount()
	{
		return this.prices.size();
	}
}