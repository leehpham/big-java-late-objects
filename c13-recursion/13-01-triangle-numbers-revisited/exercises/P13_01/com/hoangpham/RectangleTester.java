package com.hoangpham;

public class RectangleTester
{
    public static void main(String[] args)
    {
        boolean result = false;
        Rectangle myRectangle = new Rectangle(4, 3);
        if (myRectangle.getArea() == 12) { result = true; }
        System.out.println(result);
    }
}