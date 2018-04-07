import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * define class InvestmentFrame2 that inherits from class JFrame
 */
public class InvestmentFrame2 extends JFrame
{
    /* Static constants */
    /* Size of the frame */
    // FRAME_WIDTH = 450;
    private static final int FRAME_WIDTH = 450;
    // FRAME_HEIGHT = 100;
    private static final int FRAME_HEIGHT = 100;

    // DEFAULT_RATE = 5
    private static final double DEFAULT_RATE = 5;
    // INITIAL_BALANCE = 1000;
    private static final double INITIAL_BALANCE = 1000;


    /* Instance variables */
    // A JLabel called rateLabel
    private JLabel rateLabel;
    // A JTextField called rateField
    private JTextField rateField;
    // A JButton called button
    private JButton button;
    // A JLabel called resultLabel
    private JLabel resultLabel;

    private JPanel panel;
    // A double called balance
    private double balance;

    // Constructor
    public InvestmentFrame2()
    {
        // Initialize balance
        balance = INITIAL_BALANCE;
        // Initialize resultLalbe with the string "Balance: " + balance
        resultLabel = new JLabel("Balance: " + balance);
        // Call createTextField method
        createTextField();
        // Call createButton method
        createButton();
        // Call createPanel method
        createPanel();

        // set the size of the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    // Define createTextField method that initialize the rateLabel and rateField
    private void createTextField()
    {
        // Initialize rateLabel with the string "Interest Rate: "
        rateLabel = new JLabel("Interest Rate: ");
        // Create FIELD_WIDTH = 10 (characters)
        final int FIELD_WIDTH = 10;
        // Initialize rateField with FIELD_WIDTH
        rateField = new JTextField(FIELD_WIDTH);
        // Then set its initial text to be the DEFAULT_RATE
        rateField.setText("" + DEFAULT_RATE);
    }

    /**
     * Define the AddInterestListener class that implements the ActionListener interface
     * When the button is clicked, add interest to the balance and update the display
     */
    class AddInterestListener implements ActionListener
    {
        // Implement the actionPerformed method
        public void actionPerformed(ActionEvent event)
        {
            // Get the rate from rateField and convert it to double
            double rate = Double.parseDouble(rateField.getText());
            // Calculate the interest
            double interest = balance * (rate / 100);
            // Update the balance
            balance = balance + interest;
            // Set the result in resultLabel
            String output = String.format("Balance: %.2f", balance);
            resultLabel.setText(output);
        }
    }

    /**
     * Define createButton method that initializes and adds a listener to the button
     */
    private void createButton()
    {
        // Initialize the button with the string "Add Interest"
        button = new JButton("Add Interest");

        // Create an ActionListener called listener
        ActionListener listener = new AddInterestListener();
        // Add the listener to the button
        button.addActionListener(listener);
    }

    /**
     * Define createPanel method 
     */
    private void createPanel()
    {
        // Initialize panel
        panel = new JPanel();
        // Add the rateLable to it
        panel.add(rateLabel);
        // Add the rateField to it
        panel.add(rateField);
        // Add the button to it
        panel.add(button);
        // Add the resultLabel to it
        panel.add(resultLabel);
        // Add it to the frame
        add(panel);
    }
}