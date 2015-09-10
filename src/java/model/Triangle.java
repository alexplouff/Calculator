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
    private final static String DIGIT_REG_EX = "\\d+";
    
    public Triangle(){};
    public Triangle(String base, String height){
        setBase(base);
        setHeight(height);
        setArea();
    }

    public double getBase() {
        return base;
    }

    public final void setBase(String base) throws IllegalArgumentException{
        if(base.matches(DIGIT_REG_EX)){
            this.base = Double.valueOf(base);
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
    public void setArea() {
        if(height > 0 && base > 0  ){
            area = (base * height)/2;
        } else {
            area = 000;
        }
    }
    
    @Override
    public double getArea(){
        return area;
    }
    
    @Override
    public String toString(){
        return "The base is " + base + " units." +
                "\nThe height is " + height + " units," + 
                "\nThe area is " + area + " units.";
    }
}
