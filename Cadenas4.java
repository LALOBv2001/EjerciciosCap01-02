/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

/**
 *
 * @author Eduardo
 */
public class Cadenas4 {
    public static void main(String[]args)
    {
    String s = "4 Un buen libro de Java";
    //Los metodos startSwitch y endswitch regresan un valor booleano si la
    //cadena empieza o termina con el parametro 
    boolean b1 = s.startsWith("4 Un buen libro"); // true
    boolean b2 = s.startsWith("Un"); // false
    boolean b3 = s.endsWith("de Java");  // true
    boolean b4 = s.endsWith("Chau"); // false 
    System.out.println(b1);       
    System.out.println(b2);
    System.out.println(b3);     
    System.out.println(b4);
    }
    
}
