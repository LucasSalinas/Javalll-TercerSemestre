/*
Programacion 3: Clase 3
Lucas Salinas
ForEach - Autoboxing - Unboxing - Modificadores de acceso
*/
package Parte3;

public class modificadorPublic {
    public String atributoPublic = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";
    
    public modificadorPublic(String atributoPublic){
        System.out.println("Constructor publico");
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
    
    public void metodoPublico(){
        System.out.println("Metodo publico");
    }
}