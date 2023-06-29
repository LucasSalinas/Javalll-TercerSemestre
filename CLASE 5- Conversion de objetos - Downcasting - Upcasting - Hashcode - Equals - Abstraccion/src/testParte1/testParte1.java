/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package testParte1;

import Parte1.*;

public class testParte1 {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);  

        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());   
    }
}