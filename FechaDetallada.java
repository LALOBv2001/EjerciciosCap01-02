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
public class FechaDetallada extends Fecha {
    public FechaDetallada(String s)
    {
    super(s);
    }
    public FechaDetallada()//COnstructor default
    {
        this(0,0,0);//Invocamos al constructor de 3 int padanso ceros
    }
    public FechaDetallada(int dia, int mes, int anio)  
    { 
        // invocamos al constructor del padre
        super(dia,mes,anio);
    }
   //arreglo de cadenas de meses 
    private static String meses[]={"Enero","Febrero" ,"Marzo" ,"Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
    public String toString()
    {
        return getDia()+" de "+meses[getMes()-1]+" de "+getAnio();//getDia,Mes y Anio,metodos de la clase padre
    }
    
}
