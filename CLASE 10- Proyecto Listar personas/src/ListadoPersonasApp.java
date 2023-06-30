/*
Programacion 3: Clase 10
Lucas Salinas
Proyecto Listar personas
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        var salir = false;

        while (!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            }catch (Exception e){
                System.out.println("Ocurrio un error de tipo: " + e.getMessage());
            }
            System.out.println();

        }//fin while
    }// Fin main

    private static void mostrarMenu(){
        System.out.print("""
                *****Listado de Personas *****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    }//fin metodo mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        switch (opcion){
            case 1 ->{
                System.out.print("Digite el nombre: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo: ");
                var email = entrada.nextLine();

                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: "+personas.size()+" elemetnos");
            }
            case 2 ->{
                System.out.println("Listado de personas: ");
                //personas.forEach((persona) -> System.out.println(persona)); Forma 1
                personas.forEach(System.out::println); //forma 2
            }
            case 3 ->{
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion incorrectas: " + opcion);
        }//fin del switch
        return salir;
    }//fin de metodo ejecutarOperacion
}//fin Clase