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
public class DemoSwitch {
    public static void main(String [] args)
    {
    Scanner scanner=new Scanner(System.in);
    System.out.print("Ingrese un dia de la semana(Numero):");
    //Leemos dia
    int Numero=scanner.nextByte();
    //
    String Dia;
    switch(Numero)
    {
        case 1: Dia="Lunes";break;
         case 2: Dia="MArtes";break;
          case 3: Dia="Miercoles";break;
           case 4: Dia="Jueves";break;
            case 5: Dia="Viernes";break;
             case 6: Dia="Sabado";break;
              case 7: Dia="Domingo";break;
        default: Dia="Dia equivocado,debe de ser  de 1 a 7";break;
    }
    //Imprime mensaje
    System.out.print(Dia);
    }
    
}
