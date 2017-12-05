// P8:10

public class VotingMachineTester
{
	public static void main(String[] args)
	{
		VotingMachine machine01 = new VotingMachine();

		machine01.voteDemocrat();
		machine01.voteDemocrat();
		System.out.println(machine01.getDemocratVotes());
		System.out.println("Expected: 2");

		machine01.voteRepublican();
		machine01.voteRepublican();
		machine01.voteRepublican();
		System.out.println(machine01.getRepublicanVotes());
		System.out.println("Expected: 3");

		machine01.clear();
		System.out.println(machine01.getDemocratVotes());
		System.out.println("Expected: 0");
		System.out.println(machine01.getRepublicanVotes());
		System.out.println("Expected: 0");
	}
}