/*
Programacion 3: Clase 7
Lucas Salinas
Interfaces en Java
*/
package parte1;

public class ImplementacionMySql implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MySql");
        
    }

    @Override
    public void listar() {
        System.out.println("listar desde MySql");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde MySql");
    }

    @Override
    public void eliminar() {
        System.out.println("eliminar desde MySql");
    }
}