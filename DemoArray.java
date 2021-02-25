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

public class DemoArray {
    public static void  main(String [] args)
    {
    Scanner scanner=new Scanner(System.in);
    //Arreglo de 10
    int arreglo[]= new int[10];
    System.out.print("Ingrese el primer valor(0=>fin):");
    //Leo el primer valor
    int v=scanner.nextInt();
    int i=0;
    //Mientras que v sea diferente de 0 e i se menor que 10
    while(v!=0 && i<10)
    {
        // asigna v en arr[i] y luego incrementa el valor de i   
        arreglo[i++] = v;
        // leo el siguiente valor      
        System.out.print("Ingrese el siguiente valor (0=>fi n): ");       
        v = scanner.nextInt();
    }
    //Recorro array mostrando su contenido 
    for(int j=0; j<i; j++ )    
    {        
      System.out.println(arreglo[j]);
    
    }
    }
    
}
