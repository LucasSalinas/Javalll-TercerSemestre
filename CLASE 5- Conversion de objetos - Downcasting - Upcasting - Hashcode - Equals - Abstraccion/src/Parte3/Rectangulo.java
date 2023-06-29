/*
Programacion 3: Clase 5
Lucas Salinas
Conversion de objetos - Downcasting - Upcasting - Hashcode - Equals - Abstraccion
*/
package Parte3;

public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " +  this.getClass().getSimpleName());
    }
}