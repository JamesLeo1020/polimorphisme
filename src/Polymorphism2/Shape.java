/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism2;

/**
 *
 * @author USER
 */
public class Shape {
    // Private member variable
    private String color;
    // Contructor
    public Shape (String color){
        this.color = color;
    }
    public String toString(){
        return "Shape[color=" + color + "]";
    }
    //All shapes must have a method called gtArea().
    public double getArea() {
        //We need to return some value to compile the progam.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
    
}
