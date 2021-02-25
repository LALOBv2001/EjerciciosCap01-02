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
public class DemoArray2 {
    public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
 String[] dias={"Lunes","Martes","Miercoles","Jueves","viernes","Sabado","Domingo"};
System.out.println("Ingrese un dia de la semana:");
int v=scanner.nextInt();
if(v<=dias.length&&v>0)
{
   
    System.out.println(dias[v-1]);
}
else
{
    System.out.println("Numero equivocado.");
}


}
    
}
