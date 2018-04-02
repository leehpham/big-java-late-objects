import javax.swing.JFrame;

public class MyFrameViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new MyFrame();

        frame.setTitle("Mah Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}