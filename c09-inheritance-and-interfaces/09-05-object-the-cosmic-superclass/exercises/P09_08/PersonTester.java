public class PersonTester
{
    public static void main(String[] args)
    {
        Person hoang = new Person("Hoang Pham", 1992);
        System.out.println(hoang.getName());
        System.out.println(hoang.getYearOfBirth());
        System.out.println(hoang.toString());

        Person foo = new Person();
        foo.setName("Foo Bar");
        foo.setYearOfBirth(1997);
        System.out.println(foo.toString());
    }
}