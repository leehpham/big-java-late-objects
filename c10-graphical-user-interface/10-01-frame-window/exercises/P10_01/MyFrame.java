import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame
{
    private JButton[] buttons;

    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;

    public MyFrame()
    {
        createComponents();

        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createComponents()
    {
        JPanel panel = new JPanel();

        buttons = new JButton[100];
        for(int i = 0; i < buttons.length; i++)
        {
            buttons[i] = new JButton("" + (i + 1));
            panel.add(buttons[i]);
        }

        add(panel);
    }
}