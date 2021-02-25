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
public class Cadenas1 {
    public static void main(String[]args)
    {
    String s = "Esto Es Una Cadena de caracteres";      
    String sMayus = s.toUpperCase();//metodo para hacer la cadena en letras MAYUSCULAS
    String sMinus = s.toLowerCase();//metodo para hacer la cadena en letras misuculas    
    System.out.println("Original: "+s);    
    System.out.println("Mayusculas: "+sMayus);   
    System.out.println("Minusculas: "+sMinus);
    }
    
}
