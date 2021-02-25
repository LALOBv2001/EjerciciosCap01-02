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
public class TestFechaDetallada {
    public static void main(String[]args)
    {
        //instancia de objeto f de la clase FechaDetallada
    FechaDetallada f=new FechaDetallada();  
    f.setDia(25);     
    f.setMes(10);   
    f.setAnio(2009);  
    System.out.println(f.Tostring());//Tostring() de la clase base 
    }
    
}
