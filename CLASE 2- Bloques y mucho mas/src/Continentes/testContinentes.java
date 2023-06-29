/*
Programacion 3: Clase 2
Lucas Salinas
Bloques y mucho mas
*/
package Continentes;

public class testContinentes {
    public static void main(String[] args) {
        infoContinentes(Continentes.AFRICA);
        infoContinentes(Continentes.AMERICA);
        infoContinentes(Continentes.ASIA);
        infoContinentes(Continentes.EUROPA);
        infoContinentes(Continentes.OCEANIA);
    }
    public static void infoContinentes(Continentes continente){
        switch(continente){
            case AFRICA:
                System.out.println("--Africa--\nPaises: "+Continentes.AFRICA.getPaises()+"\nHabitantes: "+Continentes.AFRICA.getHabitantes());
                break;
            case AMERICA:
                System.out.println("--America--\nPaises: "+Continentes.AMERICA.getPaises()+"\nHabitantes: "+Continentes.AMERICA.getHabitantes());
                break;
            case ASIA:
                System.out.println("--Asia--\nPaises: "+Continentes.ASIA.getPaises()+"\nHabitantes: "+Continentes.ASIA.getHabitantes());
                break;
            case EUROPA:
                System.out.println("--Europa--\nPaises: "+Continentes.EUROPA.getPaises()+"\nHabitantes: "+Continentes.EUROPA.getHabitantes());
                break;
            case OCEANIA:
                System.out.println("--Oceania--\nPaises: "+Continentes.OCEANIA.getPaises()+"\nHabitantes: "+Continentes.OCEANIA.getHabitantes());
                break;
            default:
                System.out.println("El continente ingresado no existe.");
                break;
        }
    }
}
