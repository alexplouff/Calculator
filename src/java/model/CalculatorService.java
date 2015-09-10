/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class CalculatorService {
    
    private List<String> digitsList;
    
    public CalculatorService(){};
    
    public CalculatorService(List digits){
       digitsList  = new ArrayList<>(digits);
    }
   
    public double getShapeArea(int flag){
        ShapeStrategy shape;
        switch(flag){
            case 1:
                shape = new Rectangle(digitsList.get(0), digitsList.get(1));
                return shape.getArea();
            case 2:
                shape = new Triangle(digitsList.get(0), digitsList.get(1));
                return shape.getArea();
            
            case 3:
                shape = new Circle(digitsList.get(0));
                return shape.getArea();
                
            default:
                return 0;
        }
       
    }
    
  
}
