/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

/**
 *
 * @author Eduardo
 */import java.util.StringTokenizer;
public class Cadenas7 {
    public static void main(String[]args)
    {
    String s = "Juan#Marcos#Carlos#Matias"; 
    //A coninuacion sobrecargamos el constructor con la palabra y con lo que sera su separador
    StringTokenizer st = new StringTokenizer(s,"#");
    String tok;//variable declarada vacia
    while( st.hasMoreTokens())//Mientras la variable st tenga mas tokens
    {    
        tok = st.nextToken();//tok obtiene el siguiente token de la palabra      
    System.out.println(tok);//mensaje del token
    }
    
    }
    
}

