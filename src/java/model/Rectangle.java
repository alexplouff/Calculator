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
public class Rectangle implements ShapeStrategy{
    
    private double length, height, area;
    
    public Rectangle(){};
    public Rectangle(double length, double height){
        setLength(length);
        setHeight(height);
        area = length * height;
    }

    public double getLength() {
        return length;
    }

    public final void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return area;
    }

    @Override
    public String toString() {
        return "The base is " + length + " units." +
                "\nThe height is " + height + " units," + 
                "\nThe area is " + area + " units.";
    }
 
    
    
    
}
