/*
Programacion 3: Clase 9
Lucas Salinas
Proyecto calculadora
*/
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){
            System.out.println("***** Aplicación Calculadora *****");
            mostrarMenu();

            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                    if(operacion >= 1 && operacion <=4){

                        ejecutarOperacion(operacion,entrada);
                    }//Fin if
                    else if (operacion == 5) {
                        System.out.println("Hasta pronto...");
                        break;
                    }
                    else {
                        System.out.println("ocurrio un error: " + operacion);
                    }
                    System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error" + e.getMessage());
                System.out.println();
            }
        }
    }

    private static void mostrarMenu(){
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir           
                    """);
        System.out.print("¿Operación a realizar? -> ");
    }

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Ingrese el valor para el operando1: ");
        var operador1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese el valor para el operando1: ");
        var operador2 = Double.parseDouble(entrada.nextLine());
        double resultado;

        switch (operacion){
            case 1 -> {
                resultado = operador1 + operador2;
                System.out.println("Resultado de la suma: "+resultado);
            }
            case 2 -> {
                resultado = operador1 - operador2;
                System.out.println("Resultado de la resta = " + resultado);
            }
            case 3 -> {
                resultado = operador1 * operador2;
                System.out.println("Resultado de la multiplicación = " + resultado);
            }
            case 4 -> {
                resultado = operador1 / operador2;
                System.out.println("Resultado de la división = " + resultado);
            }
            default -> System.out.println("Operacion Erronea: " + operacion);
        }
}
