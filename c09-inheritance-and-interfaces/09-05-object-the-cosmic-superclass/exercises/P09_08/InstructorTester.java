public class InstructorTester
{
    public static void main(String[] args)
    {
        Instructor hoang = new Instructor("Hoang Pham", 1992, 70000);
        System.out.println(hoang.getName());
        System.out.println(hoang.getYearOfBirth());
        System.out.println(hoang.getSalary());
        System.out.println(hoang.toString());
        
        Instructor foo = new Instructor();
        foo.setName("Foo Bar");
        foo.setYearOfBirth(1997);
        foo.setSalary(50000);
        System.out.println(foo.toString());
    }
}