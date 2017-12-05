// P8.10: Implement a VotingMachine class that can be used for a simple election. Have methods
// to clear the machine state, to vote for a Democrat, to vote for a Republican, and to
// get the tallies for both parties.

public class VotingMachine
{
	private int democratVotes;
	private int republicanVotes;

	public VotingMachine()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}

	public void voteDemocrat()
	{
		democratVotes++;
	}

	public void voteRepublican()
	{
		republicanVotes++;
	}

	public int getDemocratVotes()
	{
		return democratVotes;
	}

	public int getRepublicanVotes()
	{
		return republicanVotes;
	}

	public void clear()
	{
		democratVotes = 0;
		republicanVotes = 0;
	}
}