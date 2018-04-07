/**
 * This works for P10.3 but I need to refactor the code (P10.5)
 */

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
    // Number of clicks for button 
    private int buttonClicks;
    // Number of clicks for button01
    private int button01Clicks;

    // declare and initalize the frame's size
    // width = 100
    private static final int FRAME_WIDTH = 100;
    // height = 60
    private static final int FRAME_HEIGHT = 60;

    // Constructor
    public ButtonFrame1()
    {
        buttonClicks = 0;
        button01Clicks = 0;

        // Call createComponents();
        createComponents();

        // set the size for the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // listener class for button
    class ClickListener implements ActionListener
    {
        /**
         * An action listener that prints a message.
         */
        @Override
        public void actionPerformed(ActionEvent event)
        {
            buttonClicks++;
            String output = String.format("Button was clicked %d times", buttonClicks);
            System.out.println(output);
        }
    }

    // listener class for button01
    class ClickListener01 implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            button01Clicks++;
            String output = String.format("Button01 was clicked %d times", button01Clicks);
            System.out.println(output);
        }
    }

    // Define createComponents
    private void createComponents()
    {
        // Create a button with "Click me!" written on it
        JButton button = new JButton("Button!");

        // Create another button
        JButton button01 = new JButton("Button01!");

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

        // Create an ActionListener for button01
        ActionListener listener01 = new ClickListener01();
        button01.addActionListener(listener01);
    }
}