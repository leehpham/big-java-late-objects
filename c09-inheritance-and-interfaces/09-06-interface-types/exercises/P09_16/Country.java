public class Country implements Measurable
{
    private String name;
    private double area;

    public Country(String name, double area)
    {
        this.name = name;
        this.area = area;
    }

    public double getMeasure()
    {
        return area;
    }

    /**
     * Overrides the toString method from Object class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return "area: " + area;
    }
}