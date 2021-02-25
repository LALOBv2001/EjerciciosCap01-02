/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.TesstFecha1.folder;

/**
 *
 * @author Eduardo
 */
public class TestFiguras {
    public static void main(String[] args)
    { //Asigancion de valores por medio de constructores a los objetos
        Circulo c = new Circulo(4);
        Rectangulo r = new Rectangulo(10,5);
        Triangulo t = new Triangulo(3,6); 
        //Imprimir valores de cada objeto
        System.out.println(c);   
        System.out.println(r); 
        System.out.println(t);   
    }
    
}
