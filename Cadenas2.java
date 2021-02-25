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
public class Cadenas2 {
    public static void main(String[]args)
    {
    String s = "Esto Es Una Cadena de caracteres";
    int pos1 = s.indexOf('a');//Metodo que retorna la primera posicion del caracter buscado  
    int pos2 = s.lastIndexOf('e');//Metodo que retorna la ultima posicion del caracter buscado  
    int pos3 = s.indexOf('s');   
    System.out.println(pos1);    
    System.out.println(pos2);    
    System.out.println(pos3);
    }
    
}
