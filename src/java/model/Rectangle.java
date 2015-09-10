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
    private final static String DIGIT_REG_EX = "\\d+";
    
    public Rectangle(){};
    public Rectangle(String length, String height){
        setLength(length);
        setHeight(height);
        setArea();
    }

    public double getLength() {
        return length;
    }

    public final void setLength(String length) throws IllegalArgumentException{
        if(length.matches(DIGIT_REG_EX)){
            this.length = Double.valueOf(length);
        } else {
            throw new IllegalArgumentException("Enter a Number");
        }
    }

    public double getHeight() {
        return height;
    }

    public final void setHeight(String height) throws IllegalArgumentException{
        if(height.matches(DIGIT_REG_EX)){
            this.height = Double.valueOf(height);
        } else {
            throw new IllegalArgumentException("Enter a Number");
        }
    }
    
    @Override
    public void setArea(){
        if(height > 0 && length > 0){
            area = length * height;
        }
        else {
            area = 000;
        }
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
