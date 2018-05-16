import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

/*
A component that draws a demo chart.
*/
// Declare class ChartComponent2 that inherits from class JComponent
public class ChartComponent2 extends JComponent
{
    // Override method paintComponent
    public void paintComponent(Graphics g)
    {
        // Draw the bars
        // Use method fillRect with params (0, 10, 200, 10)
        g.fillRect(0, 10, 200, 10);
        // Use method fillRect with params (0, 30, 300, 10)
        g.fillRect(0, 30, 300, 10);
        // Use method fillRect with params (0, 50, 100, 10)
        g.fillRect(0, 50, 100, 10);

        // Draw the arrow
        // Use method drawLine with params (350, 35, 305, 35)
        g.drawLine(350, 35, 305, 35);
        // Use method drawLine with params (305, 35, 310, 30)
        g.drawLine(305, 35, 310, 30);
        // Use method drawLine with params (305, 35, 310, 40)
        g.drawLine(305, 35, 310, 40);


        // Draw the highlight and the text
        // Use method setColor with param Color.YELLOW
        g.setColor(Color.YELLOW);
        // Use method fillOval with args (350, 25, 35, 20)
        g.fillOval(350, 25, 35, 20);
        // Set color to BLACK
        g.setColor(Color.BLACK);
        // Use method drawString with args ("Best", 355, 40)
        g.drawString("Best", 355, 40);
    }
}