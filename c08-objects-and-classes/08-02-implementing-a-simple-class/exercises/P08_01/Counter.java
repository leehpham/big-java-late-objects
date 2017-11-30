// P8.1

public class Counter
{
	private int value;

	public void count()
	{
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