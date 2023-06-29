/*
Programacion 3: Clase 4
Lucas Salinas
Sobre escritura - Polimorfismo e Instanceof
*/
package testParte1;

import Parte1.*;

public class testparte1 {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Abel", 10000);
        imprimir(empleado1);
        Gerente gerente1 = new Gerente("Lucas", 5000, "Sistemas");
        imprimir(gerente1);
    }
    
    public static void imprimir(Empleado empleado){
        System.out.println("Empleado: " + empleado.obtenerDetalles());
    }    
}