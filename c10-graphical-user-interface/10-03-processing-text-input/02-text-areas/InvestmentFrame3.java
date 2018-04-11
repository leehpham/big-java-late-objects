import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * A frame that shows the growth of an investment with varialbe 
 * interest, using a text area.
 */
// Define class InvestmentFrame3 that extends class JFrame
public class InvestmentFrame3 extends JFrame
{
    /* Static constants */
    // Frame size
    // FRAME_WIDTH = 400
    private static final int FRAME_WIDTH = 400;
    // FRAME_HEIGHT = 250
    private static final int FRAME_HEIGHT = 250;

    // The text area
    // Number of rows, AREA_ROWS = 10
    private static final int AREA_ROWS = 10;
    // Number of columns, AREA_COLUMNS = 30
    private static final int AREA_COLUMNS = 30;

    // App default data
    // The default rate, DEFAULT_RATE = 5
    private static final double DEFAULT_RATE = 5;
    // INITIAL_BALANCE = 1000
    private static final double INITIAL_BALANCE = 1000;

    /* Instance variables */
    // a JLabel called "rateLabel"
    private JLabel rateLabel;
    // a JTextField called "rateField";
    private JTextField rateField;
    // a JButton call "button"
    private JButton button;
    // a JTextArea called "resultArea"
    private JTextArea resultArea;
    // balance
    private double balance;

    // Constructor
    public InvestmentFrame3()
    {
        // Init the "balance"
        balance = INITIAL_BALANCE;
        // Init the "resultArea" with its rows and columns
        resultArea = new JTextArea(AREA_ROWS, AREA_COLUMNS);
        // Set the first text in "resultArea" to be the "balance"
        resultArea.setText("" + balance + "\n");
        // Do not allow editing on "resultArea"
        resultArea.setEditable(false);

        // call helper method createTextField
        createTextField();
        // call helper method createButton
        createButton();
        // call helper method createPanel
        createPanel();

        // Set the size of the frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    /**
     * createTextField inits "rateLabel" and "rateField"
     */
    private void createTextField()
    {
        // Init "rateLabel" with the text "Interest Rate: "
        rateLabel = new JLabel("Interest Rate: ");
        // Declare constant FIELD_WIDTH = 10
        final int FIELD_WIDTH = 10;
        // Init "rateField" with its field width
        rateField = new JTextField(FIELD_WIDTH);
        // Set the text in "rateField" to be DEFAULT_RATE
        rateField.setText("" + DEFAULT_RATE);
    }

    /**
     * createButton inits "button"
     */
    private void createButton()
    {
        // Init "button" and give it the text "Add Interest"
        button = new JButton("Add Interest");
        // Create an ActionListener called "listener"
        ActionListener listener = new AddInterestListener();
        // Add the ActionListener to the button
        button.addActionListener(listener);
    }

    /**
     * Define class AddInterestListener that implements the ActionListener interface
     */
    class AddInterestListener implements ActionListener
    {
        // Implement the method actionPerformed
        public void actionPerformed(ActionEvent event)
        {
            // Get the rate
            double rate = Double.parseDouble(rateField.getText());
            // Calculate the interest
            double interest = balance * (rate / 100);
            // Update the balance
            balance += interest;
            // Append the new balance in "resultArea"
            resultArea.append("" + balance + "\n");
        }
    }

    /**
     * createPanel inits a panel
     */
    private void createPanel()
    {
        // Create a JPanel called "panel"
        JPanel panel = new JPanel();
        // Add "rateLabel" to it
        panel.add(rateLabel);
        // Add "rateField" to it
        panel.add(rateField);
        // Add "button" to it
        panel.add(button);
        // Create a JScrollPane called "scrollPane" and place it in "resultArea"
        JScrollPane scrollPane = new JScrollPane(resultArea);
        // Add "scrollPane" to the panel
        panel.add(scrollPane);
        // Add the panel to the frame
        add(panel);
    }
}