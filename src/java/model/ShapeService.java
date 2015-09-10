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
public class ShapeService {
    
    private ShapeStrategy shape;
    
    public ShapeService(){};
    

    public ShapeStrategy getShape() {
        return shape;
    }

    public double getTriangleArea(String height, String base) throws IllegalArgumentException{
        Triangle t = new Triangle(height, base);
        return t.getArea();
    }
    
    public double getRectangleArea(String height, String base) throws IllegalArgumentException{
        Rectangle r = new Rectangle(height, base);
        return r.getArea();
    }
    
    public double getCircleArea(String radius) throws IllegalArgumentException{
        Circle c = new Circle(radius);
        return c.getArea();
    
    }
}
