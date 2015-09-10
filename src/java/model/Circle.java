/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alex
 */
public class Circle implements ShapeStrategy{
    
    private double radius, area;
    private final static String DIGIT_REG_EX = "\\d+";

    public Circle(){};
    public Circle(String radius) {
        setRadius(radius);
        setArea();
    }

    public double getRadius() {
        return radius;
    }
    
    public final void setArea(){
        area = radius * Math.PI * Math.pow(area, 2);
    }

    public final void setRadius(String radius) throws IllegalArgumentException{
        if(radius.matches(DIGIT_REG_EX)){
            this.radius = Double.valueOf(radius);
            setArea();
        } else {
            throw new IllegalArgumentException("Enter a Number");
        }
    }
    

    @Override
    public double getArea() {
        return area;
    }
    
    @Override
    public String toString(){
        return "The radius is: " + radius + " units.\n"+
                "The area of the circle is " + getArea() + " units";
    }
    
    
}
