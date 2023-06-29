/*
Programacion 3: Clase 2
Lucas Salinas
Bloques y mucho mas
*/
package Enumeraciones;

public class testEnumeracionesDias {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Enumeraciones.LUNES);
        DiaSemanal(Enumeraciones.MIERCOLES);
    }
    public static void DiaSemanal(Enumeraciones dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día");
                break;
            case MARTES:
                System.out.println("Segundo día");
                break;
            case MIERCOLES:
                System.out.println("Tercer día");
                break;
            case JUEVES:
                System.out.println("Cuarto día");
                break;
            case VIERNES:
                System.out.println("Quinto día");
                break;
            case SABADO:
                System.out.println("Secto día");
                break;
            case DOMINGO:
                System.out.println("Septimo día");
                break;
            default:
                System.out.println("El día ingresado no existe");
                break;
        }
    }
}