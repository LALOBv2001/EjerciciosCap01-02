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

public class PrimerosNumeros3 {
    public static void main(String []args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese numero:");
    //Leemos numero
    int v=scanner.nextInt();
    for(int i=1;i<=v;i++)
    {
    //Mostramos la i
        System.out.print(" "+i);
    }
    }
    
}
