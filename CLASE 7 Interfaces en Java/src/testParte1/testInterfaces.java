/*
Programacion 3: Clase 7
Lucas Salinas
Interfaces en Java
*/
package testParte1;

import parte1.*;

public class testInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMySql(); 
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}