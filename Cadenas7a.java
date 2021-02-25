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
public class Cadenas7a {
    public static void main(String[]args)
    {
    String s = "Juan|Marcos|Carlos|Matias";  
    String[] tokens = s.split("[|]");//metodo split que agarra los tokens entre cada separador del string
    for(int i=0; i<tokens.length; i++) 
    { 
        System.out.println(tokens[i]);  
    }
    }
    
}
