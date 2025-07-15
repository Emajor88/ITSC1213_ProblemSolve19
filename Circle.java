import java.awt.Color;

/**
 * This class describes a circle with a given radius and color.
 * This is my private solution to problem solve 19
 * @author Eric Major
 * @version 20250715
 */

public class Circle {  
    // private instance variable, not accessible from outside this class
    private double radius;
    private Color color;
    private double area;

    /**
     * summary: defualt constructor
     * @param null
     * @return void
     */ 
    // It sets the radius and color to their default value.
    public Circle() {
        radius = 1.0;
        this.color = new Color(255,119,65);
    }

    /**
     * summary: 2nd constructor with given radius and color
     * @param null
     * @return void
     */ 
    public Circle(double r, Color clr) {
        radius = r;
        color = clr;
    }

    // A public method for retrieving the radius
    public double getRadius() {
        return radius;
    }

    // A public method for retrieving the color of circle
    public Color getColor() {
        return color;
    }

    // A public method for retrieving the area of circle
    public double getArea() {
        calculateArea();
        return area;
    }
    // A private method for computing the area of circle
    private void calculateArea() {
        area = radius * radius * Math.PI;
    }
}