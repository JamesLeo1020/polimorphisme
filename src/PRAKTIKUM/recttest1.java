/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRAKTIKUM;

/**
 *
 * @author USER
 */
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class recttest1 {
    public static void main(String[] args) {
        Rect a = new Rect(1, 1, 4, 4);
        Rect b = new Rect(2, 3, 5, 6);
        Rect x = a.union(b);
        Rect y = a.intersection(b);
        
        if (x.isInside(b.x1, b.y1))
            System.out.println("(" + b.x1 + "," + b.y1 +") is Inside the union");
        
        System.out.println(a +" union " + b + " = " + x);
        System.out.println(a +" intersect " + b + " = " + y);
    }
    
}


