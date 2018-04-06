import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener
{
    /**
     * An action listener that prints a message.
     */
    @Override
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("I was clicked!");
    }
}