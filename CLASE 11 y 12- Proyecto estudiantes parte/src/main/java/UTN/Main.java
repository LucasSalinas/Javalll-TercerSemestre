/*
Programacion 3: Clase 11 y 12
Lucas Salinas
Proyecto estudiantes
*/
package UTN;

import UTN.Conexion.Conexion;

public class Main {
    public static void main(String[] args) {
        var conexion = Conexion.getConnection();
        if (conexion != null)
            System.out.println("Conexion Exitosa: " + conexion);
        else
            System.out.println("Error al conectarse");
    }
}