/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

/**
 *
 * @author Eduardo
 */import java.util.Scanner;

public class Cadenas {
   public static void main(String[]args)
   {
   String s = "Esta es mi cadena";     
   System.out.println( s.charAt(0) );   //Letra inicial 
   System.out.println( s.charAt(5) );   //Caracter en el espacio 5 de la cadena
   System.out.println( s.charAt(s.length()-1) );//Ultimo caracter de la cadena
   char c;
   for(int i=0; i<s.length(); i++) 
   {      
       c = s.charAt(i);         
   System.out.println(i+" -> "+c);//Imprimimos mensaje de lo que hay en lo que hay en cada posicion de la cadena
   } 
   }
}
