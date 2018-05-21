import java.util.Scanner;

public class LevelTester
{
    public static void main(String[] args)
    {
        Level level = new Level(2);
        Scanner sc = new Scanner(System.in);

        System.out.println(level.format());        
        while (true)
        {
            level.generateProblem();
            // level.getCurrentProblem().checkUserAnswer(7);
            while (true)
            {
                System.out.print(level.getCurrentProblem().format());
                level.getCurrentProblem().checkUserAnswer(sc.nextInt());
                if (level.getCurrentProblem().isAnswerCorrect())
                {
                    System.out.println("Correct!");
                    level.updatePoints();
                    System.out.printf("POINTS: %d\n", level.getPoints());
                    break;
                }
                if (level.getCurrentProblem().getNumberOfTries() == 2)
                {
                    System.out.println("No more tries, move on to next problem.");
                    break;
                }
                if (!level.getCurrentProblem().isAnswerCorrect())
                {
                    System.out.println("Incorrect, please try again!");
                }
            }

            if (level.getPoints() == 5)
            {
                System.out.println("You've got 5 points. Advancing to next level ...");
                break;
            }
        }
        
        sc.close();
        // System.out.println(level.toString()); 
    }
}