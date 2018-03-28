public class Student extends Person
{
    private String major;

    public Student()
    {
        super();
        this.major = "";
    }

    public Student(String name, int yearOfBirth, String major)
    {
        super(name, yearOfBirth);
        this.major = major;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public String getMajor()
    {
        return major;
    }

    /**
     * Overrides the toString method from Person class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return super.toString() + ", " + major;
    }
}