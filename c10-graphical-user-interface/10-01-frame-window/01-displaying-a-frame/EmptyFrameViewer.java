// Import JFrame from swing
import javax.swing.JFrame;


public class EmptyFrameViewer
{
    public static void main(String[] args)
    {
        // Construct a JFrame object
        JFrame frame = new JFrame();

        // Constants for the frame sizes
        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 400;

        // Set the frame sizes
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

        // Set the frame title
        frame.setTitle("Mah Frame");

        // Set the frame default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }
}