/**
 * This program demonstrates the measurable BankAccount and Country classes
 */
public class MeasurableDemo
{
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
        Measurable[] folks = new Measurable[3];
        folks[0] = new Person("Hoang Pham", 170);
        folks[1] = new Person("Ha Nguyen", 150);
        folks[2] = new Person("Foo Bar", 100);

        System.out.println("The average height: " + average(folks));
    }
}