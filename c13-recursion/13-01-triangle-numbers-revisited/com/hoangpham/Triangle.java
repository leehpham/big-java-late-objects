package com.hoangpham;

public class Triangle
{
    // Declare a instance variable called "width"
    private int width;

    /**
     * Constructs a Triangle object
     * @param width the provided width
     */
    public Triangle(int width)
    {
        this.width = width;
    }

    /**
     * Calculates the area
     */
    public int getArea()
    {
        if (width == 1) { return 1; }
        else
        {
            Triangle smallerTriangle = new Triangle(width - 1);
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width;
        }
    }
}