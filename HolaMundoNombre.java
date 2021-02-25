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
 import java.util.Scanner;
public class HolaMundoNombre {
    
    public static void main(String [] args)
{
    
Scanner scanner =new Scanner(System.in);
//Mensaje para el usuario
System.out.println("Hola ingrese nombre,edad y altura:");
//leemos el nombre
String nom=scanner.next();
//leemos la edad
int edad=scanner.nextInt();
//leemos la altura
double altura=scanner.nextDouble();
//Mostramos los datos por consola
System.out.print("Nombre:"+nom+" Edad:"+edad+" Altura:"+altura);
}
}
