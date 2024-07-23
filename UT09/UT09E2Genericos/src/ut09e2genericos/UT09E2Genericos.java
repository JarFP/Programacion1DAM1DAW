
package ut09e2genericos;

import java.util.ArrayList;
import ut09e2genericos.animales.*;


public class UT09E2Genericos {

    public static void main(String[] args) {
        
        // usando clases muy similares sin genéricos
        System.out.println("----- Usando clases muy similares sin genéricos -----");
        InfoBoolean ib = new InfoBoolean(Boolean.TRUE);
        ib.dameInfo();
        InfoInteger ii = new InfoInteger(234);
        ii.dameInfo();
        InfoString is = new InfoString("Hola");
        is.dameInfo();
        
        // mismo ejemplo con genéricos
        System.out.println("----- Usando genéricos en nuestras clases -----");
        Info<Boolean> ib2 = new Info<>(Boolean.FALSE);
        ib2.dameInfo();  
        Info<Integer> ii2 = new Info<>(7);     
        ii2.dameInfo();
        Info<String> is2 = new Info<>("Adiós");
        is2.dameInfo();
        Info<Double> id = new Info<>(8.4);
        id.dameInfo();
        
        // Genéricos es lo que hemos usado para definir colecciones como ArrayList
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("lunes");
        al1.add("martes");
        al1.add("miércoles");
        
        // jerarquía de parámetros
        CuidarAnimal<Animal> ca1 = new CuidarAnimal<>(new Animal());
        CuidarAnimal<Perro> ca2 = new CuidarAnimal<>(new Perro());
        CuidarAnimal<Gato> ca3 = new CuidarAnimal<>(new Gato());
        //CuidarAnimal<String> ca4 = new CuidarAnimal<>("Animal falso"); // <- error
        
        // métodos genéricos
        System.out.println("----- Usando métodos con genéricos -----");
        miMetodo("cosa");
        miMetodo(3);
        
        // ? wildcard
        System.out.println("----- Usando métodos con wildcard ? -----");
        miMetodoWildcard(al1);
        //miMetodoWildcardAnimales(al1); // <- error
        
        ArrayList<Animal> ala = new ArrayList<>();
        ala.add(new Animal());
        ArrayList<Perro> alp = new ArrayList<>();
        alp.add(new Perro());
        alp.add(new Perro());
        
        miMetodoWildcardAnimales(ala);
        miMetodoWildcardAnimales(alp);
        
        
    }
    
    public static <T> void miMetodo(T dato){
        System.out.println("miMetodo: " + dato);
    }
    
    public static void miMetodoWildcard(ArrayList<?> lista){
        System.out.println("Lista: " + lista);
    }
    
    public static void miMetodoWildcardAnimales(ArrayList<? extends Animal> lista){
        System.out.println("Lista de animales: " + lista);
    }
    
}
