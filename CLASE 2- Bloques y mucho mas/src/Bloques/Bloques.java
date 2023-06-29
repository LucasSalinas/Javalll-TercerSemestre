/*
Programacion 3: Clase 2
Lucas Salinas
Bloques y mucho mas
*/
package Bloques;

public class Bloques {
    private final int idPersona;
    private static int contadorPersona;
    
    // Bloque estatico
    static{
        System.out.println("Se ejecuta el bloque estatico");
        ++Bloques.contadorPersona;
    }
         
    {
        System.out.println("Se ejecuta el bloque No estatico");
        this.idPersona = Bloques.contadorPersona++;
    }
    
    public Bloques(){
        System.out.println("Se ejecuta el constructor");
        
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
}