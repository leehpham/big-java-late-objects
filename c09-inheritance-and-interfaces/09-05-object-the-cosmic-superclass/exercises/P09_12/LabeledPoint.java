public class LabeledPoint
{
    private int x;
    private int y;
    private String label;

    public LabeledPoint(int x, int y, String label)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    /**
     * Overrides the toString method from Object class
     * @param
     * @return
     */
    @Override
    public String toString()
    {
        return "(" + x + ", " + y + "), " + label; 
    }
}