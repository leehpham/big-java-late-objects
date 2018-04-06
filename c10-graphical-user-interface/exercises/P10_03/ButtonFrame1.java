import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This frame demonstrates how to install an action listener
 */
public class ButtonFrame1 extends JFrame
{
    private int numberOfClicks;
    // declare and initalize the frame's size
    // width = 100
    private static final int FRAME_WIDTH = 100;
    // height = 60
    private static final int FRAME_HEIGHT = 60;

    // Constructor
    public ButtonFrame1()
    {
        numberOfClicks = 0;
        // Call createComponents();
        createComponents();

        // set the size for the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    class ClickListener implements ActionListener
    {
        /**
         * An action listener that prints a message.
         */
        @Override
        public void actionPerformed(ActionEvent event)
        {
            numberOfClicks++;
            String output = String.format("I was clicked %d times", numberOfClicks);
            System.out.println(output);
        }
    }

    // Define createComponents
    private void createComponents()
    {
        // Create a button with "Click me!" written on it
        JButton button = new JButton("Click Me!");

        // Create another button
        JButton button01 = new JButton("Click Me!");

        // Create a panel
        JPanel panel = new JPanel();

        // Add the buttons to the panel
        panel.add(button);
        panel.add(button01);

        // Add the panel to the frame
        add(panel);

        // Create an ActionListener
        ActionListener listener = new ClickListener();

        // Add the ActionListener to the button
        button.addActionListener(listener);
    }
}