/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorphisme.abstrak;

/**
 *
 * @author USER
 */
public class aeroplane extends vihicle {
    public void walk(){
        System.out.println("Aeroplane is flying");
    }
    public static void main(String[] args) {
        aeroplane garuda = new aeroplane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}
