import java.util.Date;

public class Demo
{
    public static void main(String[] args)
    {
        try
        {
            Appointment appt = new Appointment("Hello World", 9, 7, 2019);
            System.out.println(appt.getDescription());
            System.out.println(appt.getDate());
        }
        catch(Exception e)
        {
            System.out.println("Houston we have a problem");
        }
    }
}