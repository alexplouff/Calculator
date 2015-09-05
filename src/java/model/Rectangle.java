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
public class Rectangle {
    
    private double length, width, area;
    
    public Rectangle(){};
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
        area = length * width;
    }

    public double getLength() {
        return length;
    }

    public final void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public final void setWidth(double width) {
        this.width = width;
    }
    
    public double getAreaOfRectangle(){
        return area;
    }

    @Override
    public String toString() {
        return "The area of the Rectangle is " + area + " units";
    }
 
    
    
    
}
