/**
 * This program demonstrates the measurable BankAccount and Country classes
 */
public class MeasurableDemo
{
    /**
     * Gets the object with the largest measure
     * @param objects   an array of Measurable objects
     * @return the object with the largest measure
     */
    public static Measurable maximum(Measurable[] objects)
    {
        Measurable max = objects[0];

        for (Measurable obj : objects)
        {
            if (obj.getMeasure() > max.getMeasure())
            {
                max = obj;
            }
        }
        return max;
    }

    /**
     * Computes the average of the measures of the given objects
     */
    public static double average(Measurable[] objects)
    {
        // If there is no element in the array, just return 0
        if (objects.length == 0) { return 0; }

        // Go through the array, calculate the sum
        double sum = 0;
        for (Measurable obj : objects)
        {
            sum += obj.getMeasure();
        }

        // Calculate the average and return
        return sum / objects.length;
    }

    public static void main(String[] args)
    {
        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 514000);
        countries[2] = new Country("Belgium", 30510);
        System.out.println("Average area: " + average(countries));
        System.out.println(maximum(countries).toString());
    }
}