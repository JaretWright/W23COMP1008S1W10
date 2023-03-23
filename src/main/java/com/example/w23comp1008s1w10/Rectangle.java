package com.example.w23comp1008s1w10;

public class Rectangle {
    private double height, width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0 && height <100)
            this.height = height;
        else if (height <= 0)
            throw new IllegalArgumentException("Height must be greater than 0");
        else
            throw new IllegalArgumentException("Height can not be 100 or greater");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isSquare()
    {
        return true;
    }

    public double getArea()
    {
        return width * height;
    }
}
