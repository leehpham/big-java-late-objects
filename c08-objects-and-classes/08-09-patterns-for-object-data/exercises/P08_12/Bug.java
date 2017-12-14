// Write a class Bug that models a bug moving along a horizontal line. The bug moves
// either to the right or left. Initially, the bug moves to the right, but it can turn to 
// change its direction. In each move, its position changes by one unit in the current 
// direction. Provide a constructor
// public Bug(int initialPosition)
// and methods
// public void turn()
// public void move()
// public int getPosition()
// Sample usage:
// Bug bugsy = new Bug(10);
// bugsy.move(); // Now the position is 11
// bugsy.turn();
// bugsy.move(); // Now the position is 10
// Your main method should construct a bug, make it move and turn a few times, and
// print the actual and expected positions.

public class Bug
{
	private int position;
	private int direction;

	public static final int LEFT = 0;
	public static final int RIGHT = 1;

	// constructor
	public Bug(int initialPosition)
	{
		position = initialPosition;
		direction = RIGHT;
	}

	public void turn()
	{
		if(direction == RIGHT)
			direction = LEFT;
		else
			direction = RIGHT;
	}

	public void move()
	{
		if(direction == RIGHT)
			position += 1;
		else if(direction == LEFT)
			position -= 1;
	}

	public int getPosition()
	{
		return position;
	}
}