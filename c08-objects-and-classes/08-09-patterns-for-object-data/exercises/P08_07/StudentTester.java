public class StudentTester
{
	public static void main(String[] args)
	{
		Student student01 = new Student("Hoang Pham");

		System.out.println("Expected: Hoang Pham");
		System.out.println(student01.getName());

		student01.addQuiz(10);
		student01.addQuiz(15);

		System.out.println("Expected: 25");
		System.out.println(student01.getTotalScore());

		System.out.println("Expected: 12.5");
		System.out.println(student01.getAverageScore());
	}
}