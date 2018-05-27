package com.hoangpham;

public class Rectangle
{
    private int width;
    private int height;

    /**
     * Constructs a Rectangle object
     * @param width the provided width
     * @param width the provided height 
     */
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area
     */
    public int getArea()
    {
        if (width == 1) { return height; }
        else
        {
            Rectangle smallerRectangle = new Rectangle(width - 1, height);
            int smallerArea = smallerRectangle.getArea();
            return smallerArea + height;
        }
    }
}