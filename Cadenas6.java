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
public class Cadenas6 {
    public static void main(String[]args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese un valor entero: ");
    //leemos valor
    int v = scanner.nextInt();  
    System.out.println("Valor Ingresado: "+v); 
    //Conversion a binario
    System.out.println("binario = "+Integer.toBinaryString(v));
    //Conversion a octadecimal
    System.out.println("octal = "+Integer.toOctalString(v)); 
    //Conversion a hexadecimal con la clase interger
    System.out.println("hexadecimal = "+Integer.toHexString(v));    
    System.out.print("Ingrese una base numerica: ");
    int b = scanner.nextInt();
//Convertimos el numero dado a la base dada    
    String sBaseN=Integer.toString(v,b);   
    //Imprimimos mensaje
    System.out.println(v + " en base("+b+") = " + sBaseN);
    }
    
    
}
