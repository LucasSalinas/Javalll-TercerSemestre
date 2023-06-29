/*
Programacion 3: Clase 2
Lucas Salinas
Bloques y mucho mas
*/
package Continentes;

public enum Continentes{
    AFRICA(53, "1.216 miles de millones"),
    EUROPA(46, "756.4 millones"),
    ASIA(44, "4.561 miles de millones"),
    AMERICA(34, "1.002 miles de millones"),
    OCEANIA(14, "44.0 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    public int getPaises(){
        return this.paises;
    }
    public String getHabitantes(){
        return this.habitantes;
    }
}