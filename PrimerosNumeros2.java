/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap01;

/**
 *
 * @author Eduardo
 */ import java.util.Scanner;

public class PrimerosNumeros2 {
    public static void main(String []args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese numero:");
    //Leemos numero
    int n=scanner.nextInt();
    int i=1;
    do
    {
        //Imprimimos e incrementamos la i
    System.out.print(" "+i);
    i++;
    }
    while(i<=n);
    }
}
