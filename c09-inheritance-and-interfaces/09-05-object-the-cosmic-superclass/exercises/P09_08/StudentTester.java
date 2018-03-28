public class StudentTester
{
    public static void main(String[] args)
    {
        Student hoang = new Student("Hoang Pham", 1992, "Computer Science");
        System.out.println(hoang.getName());
        System.out.println(hoang.getYearOfBirth());
        System.out.println(hoang.getMajor());
        System.out.println(hoang.toString());

        Student foo = new Student();
        foo.setName("Foo Bar");
        foo.setYearOfBirth(1997);
        foo.setMajor("IT");
        System.out.println(foo.toString());
    }
}