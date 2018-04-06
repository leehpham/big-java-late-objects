import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// define class ButtonFrame2 that inherits from JFrame
public class ButtonFrame2 extends JFrame
{
    /* Instance variables */
    // The button
    JButton button;
    // The label
    JLabel label;

    /* the frame's sizes */
    // width = 300
    private static final int FRAME_WIDTH = 300;
    // height = 100
    private static final int FRAME_HEIGHT = 100;

    // Constructor
    public ButtonFrame2()
    {
        // Call createComponents method
        createComponents();

        // Set the size of the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // Define the class ClickListener that implements the ActionListener interface
    class ClickListener implements ActionListener
    {
        // Define method actionPerformed
        public void actionPerformed(ActionEvent event)
        {
            // Everytime the button is clicked, set the text on the label to be "I was clicked."
            label.setText("I was clicked");
        }
    }

    // Define the method createComponents
    private void createComponents()
    {
        // Initialize the button with the text "Click me!"
        button = new JButton("Click me!");
        
        // Create an ActionListener object called listener
        ActionListener listener = new ClickListener();

        // Add the ActionListener to the button
        button.addActionListener(listener);

        // Initialize the label with the text "Hello, Wordl!"
        label = new JLabel("Hello, World!");

        // Create a panel
        JPanel panel = new JPanel();

        // Add the button to the panel
        panel.add(button);

        // Add the label to the panel
        panel.add(label);

        // Add the panel to the frame
        add(panel);
    }
}