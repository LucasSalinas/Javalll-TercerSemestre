/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package Parte1;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;            
    }
    
    public String obtenerDetalles(){
        return "\nNombre: "+ this.nombre + "\nSueldo: " + this.sueldo; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}