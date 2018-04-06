import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// define class InvestmentFrame that inherits from class JFrame
public class InvestmentFrame extends JFrame
{
    /* Instance variables */
    // a JButton called "button"
    private JButton button;
    // a JLabel called "resultLabel"
    private JLabel resultLabel;
    // a double called "balance"
    private double balance;

    /* Static constants */
    // a private double called INTEREST_RATE = 5
    private static final double INTEREST_RATE = 5;
    // a private double called INITIAL_BALANCE = 1000
    private static final double INITIAL_BALANCE = 1000;

    /* Size of the frame */
    // width = 300
    private static final int FRAME_WIDTH = 300;
    // height = 100
    private static final int FRAME_HEIGHT = 100;

    // Constructor
    public InvestmentFrame()
    {
        // Initialize the "balance"
        balance = INITIAL_BALANCE;
        // call createComponents()
        createComponents();
        // Set the size for the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // Define class AddInterestListener that implements the interface ActionListern
    // The class's object will listen to the event emitted when the "button" is clicked
    class AddInterestListener implements ActionListener
    {
        // Implement method actionPerformed from the interface
        public void actionPerformed(ActionEvent event)
        {
            // Calculaute the "interest"
            double interest = balance * (INTEREST_RATE / 100);
            // Update the balance
            balance = balance + interest;
            // Display the balance on the resultLabel
            String output = String.format("Balance: %.2f", balance);
            resultLabel.setText(output);
        }
    }

    // Define method createComponents
    private void createComponents()
    {
        // Initialize the "button" with the text "Add Interest"
        button = new JButton("Add Interest");
        // Create an AddInterestListener called "listener"
        ActionListener listener = new AddInterestListener();
        // Add the listener to the button
        button.addActionListener(listener);
        
        // Initialize the "resutlLabel" with the text "Balance: " + balance
        resultLabel = new JLabel("Balance: " + balance);

        // Create a JPanel called "panel"
        JPanel panel = new JPanel();

        // Add the button and the label to the panel
        panel.add(button);
        panel.add(resultLabel);
        // Add the label to the frame
        add(panel);
    }
}