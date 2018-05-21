import java.util.Scanner;

public class ProblemTester
{
    public static void main(String[] args)
    {
        Problem p01 = new Problem(new int[]{1, 2}, "+");
        Scanner sc = new Scanner(System.in);
        
        /* Interactive testing */
        while (true)
        {
            System.out.println(p01.format());
            System.out.print("Enter your answer: ");
            p01.checkUserAnswer(sc.nextInt());
            if (p01.isAnswerCorrect())
            {
                System.out.println("Correct!");
                break;
            }
            if (p01.getNumberOfTries() == 2)
            {
                System.out.println("No more tries, move on to next problem.");
                break;
            }
            if (!p01.isAnswerCorrect())
            {
                System.out.println("Incorrect, please try again!");
            }
        }

        sc.close();
        /*DONE: Interactive testing */

        // Test setUserAnswer()
        // p01.checkUserAnswer(4);
        // if (!p01.isAnswerCorrect()) { p01.updateNumberOfTries(); }
        // System.out.println("numberOfTries: " + p01.getNumberOfTries());
        
        // p01.checkUserAnswer(5);
        // if (!p01.isAnswerCorrect()) { p01.updateNumberOfTries(); }
        // System.out.println("numberOfTries: " + p01.getNumberOfTries());

        // p01.checkUserAnswer(3);
        // if (!p01.isAnswerCorrect()) { p01.updateNumberOfTries(); }
        // System.out.println("numberOfTries: " + p01.getNumberOfTries());

        // Test isAnswerCorrect()
        // System.out.println(p01.isAnswerCorrect());

        // Test getOperands()
        // for (int operand : p01.getOperands())
        // {
        //     System.out.println("operand: " + operand);
        // }

        // Test getUserAnswer()
        // System.out.println("userAnswer: " + p01.getUserAnswer());

        // Test getSolution()
        // System.out.println("solution: " + p01.getSolution());

        // Test toString()
        System.out.println(p01.toString());
    }
}