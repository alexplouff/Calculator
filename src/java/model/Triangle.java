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
public class Triangle implements ShapeStrategy{
    
    private double base, height, area;
    
    public Triangle(){};
    public Triangle(double base, double height){
        setBase(base);
        setHeight(height);
        area = (base*height)/2;
    }

    public double getBase() {
        return base;
    }

    public final void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public final void setHeight(double height) {
        this.height = height;
    }
    
    public double getArea(){
        return area;
    }
    
    public String toString(){
        return "The base is " + base + " units." +
                "\nThe height is " + height + " units," + 
                "\nThe area is " + area + " units.";
    }
}
