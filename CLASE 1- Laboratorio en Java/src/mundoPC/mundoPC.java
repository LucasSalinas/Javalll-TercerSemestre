/*
Programacion 3: Clase 1
Lucas Salinas
Laboratorio en Java
*/
package mundoPC;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        
        Monitor monitorGamer = new Monitor("Gamer",15);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Monitor monitorLG = new Monitor("LG",20);
        Teclado tecladoLG = new Teclado("USB", "LG");
        Raton ratonLG = new Raton("USB", "LG");
        Computadora computadoraLG = new Computadora("Computadora LG",monitorLG,tecladoLG,ratonLG);
        
        Monitor monitorLenovo = new Monitor("Lenovo",30);
        Teclado tecladoLenovo = new Teclado("Bluetooth", "Lenovo");
        Raton ratonLenovo = new Raton("Bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo",monitorLenovo,tecladoLenovo,ratonLenovo);
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraLG);
        orden2.agregarComputadora(computadoraLenovo);
        orden2.mostrarOrden();
        
        Monitor monitorRazer = new Monitor("Razer",20);
        Teclado tecladoRazer = new Teclado("USB", "Razer");
        Raton ratonRazer = new Raton("USB", "Razer");
        Computadora computadoraRazer = new Computadora("Computadora Razer",monitorRazer,tecladoRazer,ratonRazer);
        
        Monitor monitorSteel = new Monitor("Steel",25);
        Teclado tecladoSteel = new Teclado("Bluetooth", "Steel");
        Raton ratonSteel = new Raton("Bluetooth", "Steel");
        Computadora computadoraSteel = new Computadora("Computadora Steel",monitorSteel,tecladoSteel,ratonSteel);
        
        Orden orden3 = new Orden();
        orden3.agregarComputadora(computadoraRazer);
        orden3.agregarComputadora(computadoraSteel);
        orden3.mostrarOrden();
    }
}