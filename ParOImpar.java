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
public class ParOImpar {
    
    public static void main(String[] args)   {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        //Leemos el numero del ususario
        int Numero=scanner.nextInt();
        //sacamos el resto del numero sobre 2
        int Resto=Numero%2;
        if(Resto==0)
        {
        System.out.print(Numero+" es Numero par");
        }
        else
        {
        System.out.print(Numero+" es Numero impar");
        }
    }
}
