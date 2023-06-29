/*
Programacion 3: Clase 3
Lucas Salinas
ForEach - Autoboxing - Unboxing - Modificadores de acceso
*/
package Parte4;

public class modificadorPrivate {
    private String atributoPrivate = "Atributo privado";
    
    private modificadorPrivate(){
        System.out.println("constructor privado");
    }
    
    public modificadorPrivate(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
}