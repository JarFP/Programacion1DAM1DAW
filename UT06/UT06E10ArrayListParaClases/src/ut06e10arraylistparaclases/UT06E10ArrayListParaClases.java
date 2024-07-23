package ut06e10arraylistparaclases;

import java.util.ArrayList;

public class UT06E10ArrayListParaClases {

    public static void main(String[] args) {
        
        System.out.println("----- Array list de tipos primitivos/wrappers -----");
        
        //ArrayList<int> al1 = new ArrayList<int>(); //<-- esto da error
        // debemos usar la clase wrapper (int -> Integer, etc.)
        ArrayList<Integer> al1 = new ArrayList<Integer>(); // <-- esto si funciona
        
        // añadiendo elementos
        al1.add(1);
        al1.add(2);
        al1.add(3);
        
        System.out.println(al1); // observa el formato
        
        // tamaño del ArrayList
        System.out.println("tamaño: " + al1.size());
        
        // accediendo a un elemento
        System.out.println("accedo la elemento de índice 1: " + al1.get(1)); // índices como en arrays de 0 a size - 1
        
        // cambiando un elemento
        al1.set(1, 20);
        System.out.println("modifico elemento de índice 1: " + al1);
        
        // eliminando un elemento
        al1.remove(1);
        System.out.println("elimino elemento de índice 1: " + al1);
        
        al1.clear();
        System.out.println("elimino todos lo elementos: " + al1);
        
        al1.add(1);
        al1.add(2);
        al1.add(3);
        
        // podemos recorrer el ArrayList con for o for each igual que un array
        System.out.println("Recorriendo con bucle convencional");
        for (int i = 0; i < al1.size(); i++) {
            System.out.println("  Elemento " + i + " es: " + al1.get(i));
            
        }
        System.out.println("Recorriendo con for each");
        for(Integer i : al1){
            System.out.println("  Elemento: " + i);
        }
        
              
        System.out.println("----- Array list de clases -----");
        
        ArrayList<Carta> al2 = new ArrayList<Carta>();
        
        al2.add(new Carta("Oros", "As"));
        al2.add(new Carta("Oros", "Sota"));
        al2.add(new Carta("Espadas", "Cinco"));
        al2.add(new Carta("Bastos", "Dos"));
        
        al2.get(2).infoCarta();
        
        System.out.println("----- Ejemplo conversión ArrayList a Array de String -----");
        // Genero el ArrayList       
        ArrayList<String> cadArrayList = new ArrayList<String>();
        cadArrayList.add("de ArrayList a Array de String 1");
        cadArrayList.add("de ArrayList a Array de String 2");
        cadArrayList.add("de ArrayList a Array de String 3");

        // declaro el array y lo inicializo con toArray sobre la colección
        String[] cadArray = new String[cadArrayList.size()];
        cadArray = cadArrayList.toArray(cadArray);        

        // Imprimo el array resultante (puedes comprobar el tipo en el IDE)
        for(String a : cadArray){
            System.out.println(a);
        }
        
        
    }
    
}
