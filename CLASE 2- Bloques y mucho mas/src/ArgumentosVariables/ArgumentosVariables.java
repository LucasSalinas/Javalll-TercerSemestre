/*
Programacion 3: Clase 2
Lucas Salinas
Bloques y mucho mas
*/
package ArgumentosVariables;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,3,4);
        imprimirNumeros(1,5);
        imprimirConMas("Abel", 6,7,8);
        
    }
    private static void imprimirConMas(String nombre, int ...numeros){
        System.out.println("nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    private static void imprimirNumeros(int ...numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: " + numeros[i] );
        }
    }
}