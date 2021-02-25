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
public class Cadenas3 {
    public static void main(String[]args)
    {
    String s = "Esto Es Una Cadena de caracteres,bby, te quiero wowow";
    //toma desde el caracter 0 hasta el 7 de la cadena
    String s1 = s.substring(1,16);  
    //toma desde el caracter 8 hasta el 11 de la cadena
    String s2 = s.substring(8,11);   
    // toma desde el caracter 8 hasta el fi nal
    String s3 = s.substring(8);   
    //imprimimos cadenas
    System.out.println(s1);
    System.out.println(s2);   
    System.out.println(s3);
    }
    
}
