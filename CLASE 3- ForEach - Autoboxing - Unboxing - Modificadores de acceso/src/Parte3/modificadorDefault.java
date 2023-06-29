/*
Programacion 3: Clase 3
Lucas Salinas
ForEach - Autoboxing - Unboxing - Modificadores de acceso
*/
package Parte3;

public class modificadorDefault extends modificadorPublic{
    String atributoDefault = "Valor de Atributo Default";
    
    public modificadorDefault(){
        super("default");
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("atributoDefault = " + this.atributoDefault);
    }
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
}