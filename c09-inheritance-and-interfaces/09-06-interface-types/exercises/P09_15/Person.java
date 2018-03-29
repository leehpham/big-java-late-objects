public class Person implements Measurable
{
    private String name;
    private double height; // in cm

    public Person(String name, double height)
    {
        this.name = name;
        this.height = height;
    }

    public String getName()
    {
        return name;
    }

    /**
     * Implements the getMeasure method from the Measurable interface
     * @param
     * @return
     */
    public double getMeasure()
    {
        return height;
    }

    /**
     * Overrides the toString method from the Object class
     * @param 
     * @return 
     */
    @Override
    public String toString()
    {
        return name + ", " + height + " cm";
    }
}