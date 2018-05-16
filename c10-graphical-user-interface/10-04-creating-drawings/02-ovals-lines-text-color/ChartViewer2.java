import javax.swing.JFrame;
import javax.swing.JComponent;
// Declare class ChartViewer
public class ChartViewer2
{
    // Declare method main
    public static void main(String[] args)
    {
        // Create a JFrame object called frame
        JFrame frame = new JFrame();
        // Use method setSize to set the size of frame to (400, 200)
        frame.setSize(400, 200);
        // Use method setTitle with value "A bar chart"
        frame.setTitle("A bar chart");
        // Use method setDefaultCloseOperation with argument EXIT_ON_CLOSE
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create a JComponent object called component with actual type ChartComponent
        JComponent component = new ChartComponent2();
        // Add component to frame
        frame.add(component);
        // Use setVisible with param true to display frame
        frame.setVisible(true);
    }
}