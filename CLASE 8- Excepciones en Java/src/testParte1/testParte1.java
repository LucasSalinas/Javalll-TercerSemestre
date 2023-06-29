/*
Programacion 3: Clase 8
Lucas Salinas
Excepciones en Java
*/
package testParte1;

import Parte1.*;

public class testParte1 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Lucas");
        persona1.setApellido("Salinas");
        System.out.println("persona1 = " + persona1);
        
        System.out.println("Persona nombre: " + persona1.getNombre());
        System.out.println("Persona apellido: " + persona1.getApellido());
    }
}