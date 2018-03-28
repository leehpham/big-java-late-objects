public class Instructor extends Person
{
    private int salary;

    public Instructor()
    {
        super();
        this.salary = 0;
    }

    public Instructor(String name, int yearOfBirth, int salary)
    {
        super(name, yearOfBirth);
        this.salary = salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
        return salary;
    }

    /**
     * Overrides the toString method from Person class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return super.toString() + ", " + this.salary;
    }
}