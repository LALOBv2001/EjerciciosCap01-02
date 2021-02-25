/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.cap02.TesstFecha1.folder;

/**
 *
 * @author Eduardo
 */import Libro.cap02.TesstFecha1.folder.Fecha;
   import Libro.cap02.TesstFecha1.folder.FechaDetallada;
public class TestMuestraConjunto {
    public static void main(String[] args) 
    { 
        Object[] arr = { new Fecha(2,10,1970).Tostring(), new FechaDetallada("23/12/1948"), new String("Esto es una cadena"), new Integer(34) }; 
        // como el metodo es estatico lo invoco a traves de la clase   
    MuestraConjunto.mostrar(arr); 
    }
    
}
