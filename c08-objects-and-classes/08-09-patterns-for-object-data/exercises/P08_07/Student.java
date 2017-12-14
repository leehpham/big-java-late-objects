// Implement a class Student. For the purpose of this exercise, a student has a name
// and a total quiz score. Supply an appropriate constructor and methods getName(),
// addQuiz(int score), getTotalScore(), and getAverageScore(). To compute the latter, you
// also need to store the number of quizzes that the student took.

public class Student
{
	private String name;
	private int totalQuizScore;
	private int numberOfQuizzes;

	// constructor
	public Student(String name)
	{
		this.name = name;
		this.totalQuizScore = 0;
		this.numberOfQuizzes = 0;
	}

	public String getName()
	{
		return name;
	}

	public void addQuiz(int score)
	{
		totalQuizScore += score;
		numberOfQuizzes++;
	}

	public int getTotalScore()
	{
		return totalQuizScore;
	}

	public double getAverageScore()
	{
		double avg = (double) totalQuizScore / numberOfQuizzes;
		return avg;
	}
}