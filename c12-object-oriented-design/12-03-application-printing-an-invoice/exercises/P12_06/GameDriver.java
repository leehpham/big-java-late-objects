import java.util.Scanner;

/*
Executes the program
*/
public class GameDriver
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Level[] levels = new Level[3];

        for (int i = 0; i < levels.length; i++)
        {
            Level level = new Level(i+1);

            System.out.println(level.format());        
            while (true)
            {
                level.generateProblem();
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

                if (level.getPoints() == 5 && level.getLevelNumber() == 3)
                {
                    System.out.println("You've got 5 points");
                    System.out.println("Congrats, you've finished the game!");
                    break;
                }

                if (level.getPoints() == 5)
                {
                    System.out.println("You've got 5 points. Advancing to next level ...");
                    break;
                }
            }
        }
        sc.close();
    }
}