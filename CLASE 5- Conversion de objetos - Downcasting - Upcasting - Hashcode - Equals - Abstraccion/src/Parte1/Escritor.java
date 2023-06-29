/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package Parte1;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
            
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + "\nTipo Escritura: " + tipoEscritura.getDescripcion();   
    }
    
    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura: " + tipoEscritura + '}'+ "\n"+ super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
}