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
public class Circle {
    
    private double radius, area;

    public Circle(double radius, double area) {
        setRadius(radius);
        area = Math.PI * Math.pow(area, 2);
    }

    public double getRadius() {
        return radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }

    public double getAreaOfCircle() {
        return area;
    }
    
    @Override
    public String toString(){
        return "The area of the circle is " + area + " units";
    }
    
    
}
