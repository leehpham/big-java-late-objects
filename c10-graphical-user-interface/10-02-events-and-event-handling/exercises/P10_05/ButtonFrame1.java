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
        private String buttonLabel;

        // Constructor
        public ClickListener(String buttonLabel)
        {
            this.buttonLabel = buttonLabel;
        }

        /**
         * An action listener that prints a message.
         */
        @Override
        public void actionPerformed(ActionEvent event)
        {
            if(buttonLabel.equals("Button!"))
            {
                buttonClicks++;
                displayClickResult("Button!", buttonClicks);
            }
            else if(buttonLabel.equals("Button01!"))
            {
                button01Clicks++;
                displayClickResult("Button01!", button01Clicks);
            }
        }

        /**
         * A helper method to reduce code repetition when printing out the result
         */
        private void displayClickResult(String buttonLabel, int numberOfClicks)
        {
            String outputButtonName = "";
            
            if (buttonLabel.equals("Button!"))
            {
                outputButtonName = "Button";
            }
            else if (buttonLabel.equals("Button01!"))
            {
                outputButtonName = "Button01";
            }

            String result = String.format("%s was clicked %d", outputButtonName, numberOfClicks);
            System.out.println(result);
        }
    }

    // Define createComponents
    private void createComponents()
    {
        String buttonLabel = "Button!";
        // Create a button with "Click me!" written on it
        JButton button = new JButton(buttonLabel);
        
        String button01Label = "Button01!";
        // Create another button
        JButton button01 = new JButton(button01Label);

        // Create a panel
        JPanel panel = new JPanel();

        // Add the buttons to the panel
        panel.add(button);
        panel.add(button01);

        // Add the panel to the frame
        add(panel);

        // Create an ActionListener
        ActionListener listener = new ClickListener(buttonLabel);
        // Add the ActionListener to the button
        button.addActionListener(listener);

        // Create an ActionListener for button01
        ActionListener listener01 = new ClickListener(button01Label);
        button01.addActionListener(listener01);
    }
}