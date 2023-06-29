/*
Programacion 3: Clase 3
Lucas Salinas
ForEach - Autoboxing - Unboxing - Modificadores de acceso
*/
package Parte1;

public class CicloForEach {
    
    private String nombre;

    public CicloForEach(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "CicloForEach{" + "nombre=" + nombre + '}';
    }
}