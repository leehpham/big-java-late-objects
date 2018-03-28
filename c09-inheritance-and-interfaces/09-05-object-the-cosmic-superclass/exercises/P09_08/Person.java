public class Person
{
    private String name;
    private int yearOfBirth;

    public Person()
    {
        this.name = "";
        this.yearOfBirth = 0;
    }

    public Person(String name, int yearOfBirth)
    {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setYearOfBirth(int yearOfBirth)
    {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth()
    {
        return yearOfBirth;
    }

    /**
     * Overrides the toString method from Object class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return name + ", " + yearOfBirth;
    }
}