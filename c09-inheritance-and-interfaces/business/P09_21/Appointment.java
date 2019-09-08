import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Appointment
{
    private String description;
    private Date date;

    public Appointment(String description, int month, int day, int year) throws ParseException
    {
        this.setDescription(description);
        this.setDate(month, day, year);
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDate(int month, int day, int year) throws ParseException
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        this.date = simpleDateFormat.parse(String.format("%d/%d/%d", month, day, year));
    }

    public Date getDate()
    {
        return this.date;
    }
}