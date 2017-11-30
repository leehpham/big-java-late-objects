/*
Reimplement the CashRegister class so that it keeps track of the total price as an
integer: the total cents of the price. For example, instead of storing 17.29, store the
integer 1729. Such an implementation is commonly used because it avoids the accumulation of roundoff errors. 
Do not change the public interface of the class.
*/

import java.util.*;

public class CashRegister 
{
	private ArrayList<Double> prices;
	private int totalCents;

	// constructor
	public CashRegister()
	{
		this.prices = new ArrayList<Double>();
		this.totalCents = 0;
	}

	public void clear()
	{
		this.prices.clear();
		this.totalCents = 0;
	}

	public void addItem(double price)
	{
		this.prices.add(price);
	}

	public double getTotal()
	{
		for(int i = 0; i < this.prices.size(); i++)
		{
			this.totalCents += (int) (this.prices.get(i) * 100);
		}
		double total = (double) totalCents / 100;
		return total;
	}

	public int getCount()
	{
		return this.prices.size();
	}
}