import java.util.ArrayList;
import java.util.Random;

/*
Describes a level
*/
public class Level
{
    private int levelNumber;
    private ArrayList<Problem> problems;
    private int points;

    /**
     * Constructs a level 
     */
    public Level(int levelNumber)
    {
        this.levelNumber = levelNumber;
        this.problems = new ArrayList<Problem>();
        this.points = 0;
    }

    /**
     * Gets the level number
     * @return the level number
     */
    public int getLevelNumber() { return levelNumber; }

    /**
     * Gets the array list containg problems
     * @return an array list containing the problems
     */
    public ArrayList<Problem> getProblems() { return problems; }

    /**
     * Gets the points
     * @return an int representing current points
     */
    public int getPoints() { return points; }

    /**
     * 
     */
    public void generateProblem()
    {
        Random randomGenerator = new Random();
        int[] operands = new int[2];
        int result = 0;
        if (levelNumber == 1)
        {
            while (true)
            {
                operands[0] = randomGenerator.nextInt(10);
                operands[1] = randomGenerator.nextInt(10);
                result = operands[0] + operands[1];
                if (result < 10)
                {
                    Problem problem = new Problem(operands, "+");
                    problems.add(problem);
                    break;
                }
            }
        }
        else if (levelNumber == 2)
        {
            operands[0] = randomGenerator.nextInt(10);
            operands[1] = randomGenerator.nextInt(10);
            Problem problem = new Problem(operands, "+");
            problems.add(problem);
        }
        else if (levelNumber == 3)
        {
            while (true)
            {
                operands[0] = randomGenerator.nextInt(10);
                operands[1] = randomGenerator.nextInt(10);
                result = operands[0] - operands[1];
                if (result >= 0)
                {
                    Problem problem = new Problem(operands, "-");
                    problems.add(problem);
                    break;
                }
            }
        }
    }

    /**
     * Gets the current problem
     * @return the current problem
     */
    public Problem getCurrentProblem()
    {
        return problems.get(problems.size()-1);
    }

    /**
     * Updates points
     */
    public void updatePoints() { points++; }

    /**
     * Formats a problem to display at the view
     */
    public String format() 
    {
        String out = String.format("Level %d:", levelNumber);
        return out;
    }

    /**
     * Gets a string representing the state of a Level
     */
    public String toString()
    {
        String out = String.format("Level %d:\n", levelNumber);
        for (Problem p : problems)
        {
            out += p.toString() + "\n";
        }
        out += "Points: " + points;
        return out;
    }
}