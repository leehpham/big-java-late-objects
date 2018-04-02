// import JFrame
import javax.swing.JFrame;
// import JButton
import javax.swing.JButton;
// import JLabel
import javax.swing.JLabel;
// import JPanel
import javax.swing.JPanel;


public class FilledFrameViewer
{
    public static void main(String[] args)
    {
        // Construct a JFrame
        JFrame frame = new JFrame();

        // Construct a JButton with a text on it
        JButton button = new JButton("Mah Button");

        // Construct a JLabel with a text on it
        JLabel label = new JLabel("Mah Label");

        // Construc a JPanel
        JPanel panel = new JPanel();

        // Add the button to the panel
        panel.add(button);

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Set the title of the frame
        frame.setTitle("Mah Frame");

        // Set the frame default closing operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Make the frame visible
        frame.setVisible(true);
    }
}