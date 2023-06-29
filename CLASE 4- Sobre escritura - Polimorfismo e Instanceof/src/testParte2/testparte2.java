/*
Programacion 3: Clase 4
Lucas Salinas
Sobre escritura - Polimorfismo e Instanceof
*/
package testParte2;

import Parte2.*;
public class testparte2 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Abel", 10000);
        determinarTipo(empleado1);
        empleado1 = new Gerente("Lucas", 5000, "Sistemas");
    }
    
    public static void determinarTipo(Empleado empleado){
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        }
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }       
}