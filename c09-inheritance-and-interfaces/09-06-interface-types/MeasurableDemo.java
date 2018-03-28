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
        Measurable[] accounts = new Measurable[3];
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10000);
        accounts[2] = new BankAccount(2000);
        System.out.println("Average balance: " + average(accounts));

        Measurable[] countries = new Measurable[3];
        countries[0] = new Country("Uruguay", 176220);
        countries[1] = new Country("Thailand", 514000);
        countries[2] = new Country("Belgium", 30510);
        System.out.println("Average area: " + average(countries));
    }
}