package ut09e6mapqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class UT09E6MapQueue {

    public static void main(String[] args) {

        System.out.println("----- Ejemplo de uso de HashMap -----");

        // Creando HashMap	
        HashMap<String, Integer> hmap = new HashMap<>();

        // Comprobando si el mapa está vacío
        boolean empty = hmap.isEmpty();
        System.out.println("El mapa está vacío: " + empty);

        // Añadiendo elementos al hashMap
        hmap.put("Alba", 24);    // hmap.size() - 1.
        hmap.put("Ignacio", 22); // hmap.size() - 2.
        hmap.put("Nerea", 15);   // hmap.size() - 3.
        hmap.put("Víctor", 22);  // hmap.size() - 4. // Valor duplicado
        hmap.put("Silvia", 30);  // hmap.size() - 5.
        
        System.out.println("Leyendo claves y valores del HashMap:");
        for(Map.Entry<String, Integer> p: hmap.entrySet()){
            System.out.println("Clave: " + p.getKey() + " - Valor: " + p.getValue());
        }

        System.out.println("Elementos en el mapa: " + hmap);
        int size = hmap.size();
        System.out.println("Tamaño del mapa: " + size);

        // Añadiendo elementos null
        hmap.put(null, null); // hmap.size() - 6.
        System.out.println("Mapa actualizado: " + hmap);

        
        
        System.out.println("----- Ejemplo de uso de Queue -----");

        // Creando la cola 
        Queue<String> q = new LinkedList<>();

        // Añadiendo elementos
        q.add("A"); // <- primero en llegar a la cola
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E"); // <- último en llegar a la cola

        System.out.println("Elementos en la cola: " + q);
        System.out.println("Primer elemento en la cola: " + q.element());
        System.out.println("Eliminando elemento: " + q.remove());
        System.out.println("Elementos en la cola tras quitar uno: " + q);

        boolean addElement = q.offer("F");
        System.out.println("¿Se ha añadido un nuevo elemento a la cola?: " + addElement);
        System.out.println("La cola con el nuevo elemento: " + q);

        System.out.println("----- Ejemplo de uso de Deque -----");

        // Creando la doble cola
        Deque<String> dq = new ArrayDeque<>();

        // Añadiendo elementos
        dq.offer("1"); // <- inicio de la cola
        dq.offer("2");
        dq.offer("3");
        dq.offer("4");
        dq.offer("5"); // <- fin de la cola
        System.out.println("Doble cola: " + dq);

        System.out.println("dq.getFirst(): " + dq.getFirst());
        System.out.println("Doble cola: " + dq);
        System.out.println("dq.removeFirst(): " + dq.removeFirst());
        System.out.println("Doble cola tras remover el primero: " + dq);

        dq.addFirst("Y");
        System.out.println("Doble cola tras añadir al primero: " + dq);

        System.out.println("dq.getLast(): " + dq.getLast());
        System.out.println("Doble cola: " + dq);

        System.out.println("dq.removeLast(): " + dq.removeLast());
        System.out.println("Doble cola tras eliminar el último: " + dq);

        dq.addLast("Z");
        System.out.println("Doble cola tras añadir al último: " + dq);

    }

}
