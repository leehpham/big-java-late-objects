import java.awt.Graphics;
import javax.swing.JComponent;

/*
    A component that draws a bar chart
*/
// Declare class ChartComponent that inherits from class JComponent
public class ChartComponent extends JComponent
{
    // Override method paintComponent
    public void paintComponent(Graphics g)
    {
        // Use method fillRect from class Graphics to create a rectangle (0, 10, 200, 10)
        g.fillRect(0, 10, 200, 10);
        // Use method fillRect from class Graphics to create a rectangle (0, 30, 300, 10)
        g.fillRect(0, 30, 300, 10);        
        // Use method fillRect from class Graphics to create a rectangle (0, 50, 100, 10)
        g.fillRect(0, 50, 100, 10);        
    }
}