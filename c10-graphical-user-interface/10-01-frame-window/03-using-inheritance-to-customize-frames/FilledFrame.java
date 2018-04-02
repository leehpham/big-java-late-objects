import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FilledFrame extends JFrame
{
    // Use instance variables for components
    JButton button;
    JLabel label;

    // Static constants for frame sizes
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 400;

    public FilledFrame()
    {
        // Call helper method createComponents
        createComponents();

        // It is a good idea to set the size in the frame constructor
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents()
    {
        // Init the button and label
        button = new JButton("Mah Button");
        label = new JLabel("Mah Label");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Add stuff to the panel
        panel.add(button);
        panel.add(label);
        // Add the panel to the frame
        add(panel);
    }
}