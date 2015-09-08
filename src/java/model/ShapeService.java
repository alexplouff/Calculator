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
    
    public ShapeService(ShapeStrategy shape){
        setShape(shape);
    }

    public ShapeStrategy getShape() {
        return shape;
    }

    public final void setShape(ShapeStrategy shape) {
        this.shape = shape;
    }
    
    public double getAreaOfShape(ShapeStrategy shape){
        return shape.getArea();
    }
    
}
