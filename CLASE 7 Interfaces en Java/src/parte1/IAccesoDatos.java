/*
Programacion 3: Clase 7
Lucas Salinas
Interfaces en Java
*/
package parte1;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}