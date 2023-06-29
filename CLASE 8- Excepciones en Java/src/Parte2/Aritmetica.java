/*
Programacion 3: Clase 8
Lucas Salinas
Excepciones en Java
*/
package Parte2;

import Parte2.*;

public class Aritmetica {
    public static int division(int numerador, int denominador)
            //throws OperacionException
    { 
        if(denominador == 0){
            throw  new OperacionException("Divicion entre cero");
        }
        return numerador / denominador;
    }
}
