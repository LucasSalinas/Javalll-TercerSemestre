/*
Programacion 3: Clase 4
Lucas Salinas
Sobre escritura - Polimorfismo e Instanceof
*/
package Parte1;

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