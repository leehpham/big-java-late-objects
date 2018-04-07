import javax.swing.JFrame;

// declare class ButtonViewer1
public class ButtonViewer1
{
    // main
    public static void main(String[] args)
    {
        // Create a ButtonFrame1
        JFrame frame = new ButtonFrame1();

        // set the default close operation for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the frame to be visible
        frame.setVisible(true);
    }
}