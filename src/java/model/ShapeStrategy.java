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
public interface ShapeStrategy {
    
    public abstract double getArea();
    
    public abstract void setArea();
    
    public abstract String toString();
}
