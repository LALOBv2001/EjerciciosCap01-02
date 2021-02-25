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
public class ParOImpar2 {
    public static void main(String [] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese un numero:");
    //Leemos numero
    int Numero=scanner.nextByte();
    //obtenemos resto de Numero entre 2
    int Resto=Numero%2;
    //utilizamos un if in-line
    String msg=(Resto==0)? Numero+" es par":Numero+" es impar";
    //mandamos mensaje
    System.out.print(msg);
    }
    
}
