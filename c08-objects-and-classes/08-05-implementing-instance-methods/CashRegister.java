public class CashRegister
{
	private int itemCount;
	private double totalPrice;

	public void addItem(double price)
	{
		itemCount++;
		totalPrice += price;
	}
}