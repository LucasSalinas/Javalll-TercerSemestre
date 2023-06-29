/*
Programacion 3: Clase 3
Lucas Salinas
ForEach - Autoboxing - Unboxing - Modificadores de acceso
*/
package Parte3;

import Parte4.modificadorPrivate;
import Parte4.modificadorProtected;

public class testModAcc {
    public static void main(String[] args) {
        modificadorPublic publico = new modificadorPublic("Valor");    
        System.out.println("publico " + publico.atributoPublic);
        publico.metodoPublico();
        
        modificadorProtected claseHija = new modificadorProtected();
        System.out.println("claseHija = " + claseHija);
        
        modificadorDefault claseDef = new modificadorDefault();
        System.out.println("claseDef = " + claseDef);
        
        modificadorDeaultHija claseDefHija = new modificadorDeaultHija();
        claseDefHija.atributoDefault = "Cambio desde la prueba";
        System.out.println("claseDefHija atributo default= " + claseDefHija.atributoDefault);
        
        modificadorPrivate clasePrivate = new modificadorPrivate("Publico");
        // clasePrivate.setAtributoPrivate("ClasePrivate = " + clasePrivate.getAtributoPrivate());
        System.out.println(clasePrivate.getAtributoPrivate());
        clasePrivate.setAtributoPrivate("Cambio");
        System.out.println("clasePrivate = " + clasePrivate.getAtributoPrivate());
    }
}