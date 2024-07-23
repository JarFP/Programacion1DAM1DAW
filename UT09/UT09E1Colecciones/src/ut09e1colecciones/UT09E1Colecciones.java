package ut09e1colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.WeakHashMap;


public class UT09E1Colecciones {


    public static void main(String[] args) {
        
        // -------------------------
        // Colecciones de tipo lista
        // -------------------------
        System.out.println("----- Ejemplo de uso de ArrayList -----");
        ArrayList<String> al = new ArrayList<String>();
        ArrayList<String> al2 = new ArrayList<String>(20); // <-- ojo!
        List<String> lista = new ArrayList<>();
        
            // Ya conoces los ArrayList...
            
        // Ejemplo de uso de Stack (pila)
        System.out.println("----- Ejemplo de uso de Stack -----");
        Stack<String> pila = new Stack<>();
        pila.push("Zubat");
        pila.push("Golbat");
        pila.push("Crobat");
        pila.push("Mega Crobat");
        System.out.println(pila.pop());
        System.out.println(pila.pop());
        pila.push("Bulbasaur");
        System.out.println(pila.pop());
        System.out.println(pila.pop());

        
        // Ejemplo de uso de Vector
        System.out.println("----- Ejemplo de uso de Vector -----");
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);
        System.out.println(vector.get(2));
        vector.set(2, 9999);
        System.out.println(vector.get(2));
       
        
        // Ejemplo de uso de LinkedList
        System.out.println("----- Ejemplo de uso de LinkedList -----");
        LinkedList<String> le = new LinkedList<>();
        le.add("Uno");
        le.add("Dos");
        le.add("Tres");
        le.add(1, "Uno y medio");
        System.out.println(le.get(2));
        le.set(0, "1");
        System.out.println("Elementos de la lista:");
        for (String elem : le) {
            System.out.println(elem);
        }
        le.remove(2);        
        System.out.println("Elementos de la lista tras eliminar el de índice 2:");
        for (String fruta : le) {
            System.out.println(fruta);
        }
        
        
        // -----------------------
        // Colecciones de tipo set
        // -----------------------
        System.out.println("----- Ejemplo de uso de HashSet -----");
        Set<Integer> set = new HashSet<>();
        HashSet<String> hs = new HashSet<>();
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        for (String elem : hs) {
            System.out.println(elem);
        }
        
        
        System.out.println("----- Ejemplo de uso de LinkedHashSet -----");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        
        System.out.println("----- Ejemplo de uso de TreeSet -----");
        TreeSet<Integer> ts = new TreeSet<>();
        
              
        
        // -----------------------
        // Colecciones de tipo map
        // -----------------------       
        System.out.println("----- Ejemplo de uso de HashMap -----");
        HashMap<String, String> frutas = new HashMap<>();
        frutas.put("Manzana", "Verde");
        frutas.put("Banana", "Amarillo");
        frutas.put("Cereza", "Rojo");    
        System.out.println("El color de la manzana es: " + frutas.get("Manzana"));
        
        
        System.out.println("----- Ejemplo de uso de WeakHashMap -----");
        Map<String, Integer> whm = new WeakHashMap<>();
        
        System.out.println("----- Ejemplo de uso de IdentityHashMap -----");
        Map<Object, String> ihm = new IdentityHashMap<>();
        
        System.out.println("----- Ejemplo de uso de LinkedHashMap -----");
        Map<String, String> lhm = new LinkedHashMap<>();
        
        System.out.println("----- Ejemplo de uso de HashTable -----");
        Hashtable<String, String> paisesCapitales = new Hashtable<>();
        paisesCapitales.put("Francia", "París");
        paisesCapitales.put("España", "Madrid");
        paisesCapitales.put("Italia", "Roma");
        System.out.println("Países y sus capitales:");
        for (Map.Entry<String, String> entry : paisesCapitales.entrySet()) {
            String pais = entry.getKey();
            String capital = entry.getValue();
            System.out.println(pais + " - " + capital);
        }
        
        System.out.println("----- Ejemplo de uso de TreeMap -----");
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        
        // ------------------------
        // Colecciones de tipo cola
        // ------------------------
        System.out.println("----- Ejemplo de uso de Queue -----");
        Queue<String> cola = new LinkedList<>();
        cola.offer("Mensaje 1");
        cola.offer("Mensaje 2");
        cola.offer("Mensaje 3");
        System.out.println("Elementos de la cola:");
        for (String mensaje : cola) {
            System.out.println(mensaje);
        }

        
    }
    
}
