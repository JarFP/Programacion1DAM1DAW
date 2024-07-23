package ut09e5set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class UT09E5Set {


    public static void main(String[] args) {
        
        System.out.println("----- COCHE -----");
        
        HashSet<Coche> coches = new HashSet<>();
        coches.add(new Coche("Seat", "Ibiza", "1234BCD"));
        coches.add(new Coche("Seat", "Córdoba", "2222BBB"));
        coches.add(new Coche("Seat", "Ibiza", "3333CCC"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Opel", "Astra", "5555FFF"));
        coches.add(new Coche("Ford", "Fiesta", "1234BCD"));
        
        for(Coche c : coches){
            System.out.println(c);
        }
        
        // ¿¿¿Pero no se supone que Set no permitía duplicados???
        
        Coche c1 = new Coche("Opel", "Astra", "5555FFF");
        Coche c2 = new Coche("Opel", "Astra", "5555FFF");
        if(c1.equals(c2)){
            System.out.println("Coches iguales");
        } else {
            System.out.println("Coches diferentes");
        }
        
        
        System.out.println("----- COCHE2 -----");
        
        HashSet<Coche2> coches2 = new HashSet<>();
        coches2.add(new Coche2("Seat", "Ibiza", "1234BCD"));
        coches2.add(new Coche2("Seat", "Córdoba", "2222BBB"));
        coches2.add(new Coche2("Seat", "Ibiza", "3333CCC"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Opel", "Astra", "5555FFF"));
        coches2.add(new Coche2("Ford", "Fiesta", "1234BCD"));
        
        // está en esta lista todo lo que pase por diferente hashCode
        for(Coche2 c : coches2){
            System.out.println(c);
        }
        
        
        Coche2 c21 = new Coche2("Opel", "Astra", "5555FFF");
        Coche2 c22 = new Coche2("Toyota", "Verso", "5555FFF");
        if(c21.equals(c22)){
            System.out.println("Coches iguales");
        } else {
            System.out.println("Coches diferentes");
        }
        
        System.out.println("----- Ejemplos de uso de la interfaz comparable -----");
        System.out.println("*Secadores en un TreeSet:");
        TreeSet<SecadorPelo> misSecadores = new TreeSet<>();
        misSecadores.add(new SecadorPelo("Rowenta", "Super dry", 2000, 20.99));
        misSecadores.add(new SecadorPelo("Ufesa", "Essential Blue", 1900, 19.99));
        misSecadores.add(new SecadorPelo("Philips", "Total care", 3000, 49.99));
        misSecadores.add(new SecadorPelo("Rowenta", "Pro dry", 2400, 26.99));
        
        System.out.println(misSecadores.toString());
        
        
        ArrayList<SecadorPelo> misOtrosSecadores = new ArrayList<>();
        misOtrosSecadores.add(new SecadorPelo("Rowenta", "Super dry", 2000, 20.99));
        misOtrosSecadores.add(new SecadorPelo("Ufesa", "Essential Blue", 1900, 19.99));
        misOtrosSecadores.add(new SecadorPelo("Philips", "Total care", 3000, 49.99));
        misOtrosSecadores.add(new SecadorPelo("Ufesa", "Essential Red", 1900, 20.99));
        misOtrosSecadores.add(new SecadorPelo("Rowenta", "Pro dry", 2400, 26.99));
        
        System.out.println("*Secadores sin ordenar en un ArrayList:");
        System.out.println(misOtrosSecadores.toString());
        
        System.out.println("*Secadores ordenados en un ArrayList:");
        Collections.sort(misOtrosSecadores);
        System.out.println(misOtrosSecadores.toString());
        
        System.out.println("----- Ejemplos de uso de la interfaz comparator -----");
        // vamos a comparar un ArrayList de "Coche" por su matrícula
        ArrayList<Coche> comparaCoches = new ArrayList<>();
        comparaCoches.add(new Coche("Seat", "Ibiza", "1234BCD"));
        comparaCoches.add(new Coche("Opel", "Astra", "5555FFF"));
        comparaCoches.add(new Coche("Seat", "Córdoba", "2222BBB"));
        comparaCoches.add(new Coche("Seat", "Ibiza", "3333CCC"));
        comparaCoches.add(new Coche("Opel", "Astra", "5555FFA"));
        comparaCoches.add(new Coche("Ford", "Fiesta", "1234BCD"));
        
        Collections.sort(comparaCoches, new ComparadorCoches());
        for(Coche c : comparaCoches){
            System.out.println(c);
        }
    }
    
}

class ComparadorCoches implements Comparator<Coche>{
    @Override
    public int compare(Coche a, Coche b) {
        return a.getMatricula().compareTo(b.getMatricula());
    }
}
