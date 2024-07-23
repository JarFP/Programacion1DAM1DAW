/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut06e09pasoporvalorpasoporreferencia;

/**
 *
 * @author jar
 */
public final class ClaseInmutable2 {
    private final int dato;
    private final ClaseInmutable1 ci1;
    
    public ClaseInmutable2(int dato, ClaseInmutable1 ci1){
        this.dato = dato;
        this.ci1 = ci1;
    }
    
    public ClaseInmutable1 retornarMiCI(){
        return new ClaseInmutable1(this.ci1.getDato());
    }
    
    public void miInfo(){
        System.out.println("Soy una ClaseInmutable2");
        System.out.println("Mi dato es: " + this.dato);
        System.out.println("La info de mi atributo de tipo ClaseInmutable1 es:");
        this.ci1.miInfo();
    }
    
}
