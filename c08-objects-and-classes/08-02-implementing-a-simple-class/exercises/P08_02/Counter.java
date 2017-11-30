// P8.2

public class Counter
{
	private int value;
	private int limit;

	public void setLimit(int maximum)
	{
		limit = maximum;
	}

	public void count()
	{
		if(value >= limit)
			System.out.println("Limit exceeded")
		else
			value = value + 1;
	}

	public int getValue()
	{
		return value;
	}

	public void undo()
	{
		if(value > 0)
			value = value - 1;
		else 
			value = 0;
	}

}