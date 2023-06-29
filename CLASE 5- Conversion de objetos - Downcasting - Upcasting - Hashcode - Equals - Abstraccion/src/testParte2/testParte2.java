/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package testParte2;

import Parte2.*;

public class testParte2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Abel", 20000);  
        Empleado empleado2 = new Empleado("Abel", 20000);  
        
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }
        else{
            System.out.println("Tienen distintas referencias de memoria");
        }
        if(empleado1.equals(empleado2)){
            System.out.println( "Los objetos son iguales en contenido");
        }
        else{
            System.out.println("Los objetos son distintos en contendio");
        }
    }
}