/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface1;

/**
 *
 * @author USER
 */
public class test {
    public static void main(String[] args) {
        line hm = new line(5, 10, 10, 20);
        System.out.println(hm.getLength());
        System.out.println(hm.isGreater(hm, hm));
        System.out.println(hm.isLess(hm, hm));
        System.out.println(hm.isEqual(hm, hm));
    }
}
