/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package Parte2;

public class Gerente extends Empleado{
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nDepartamento: " + this.departamento;
    }
}