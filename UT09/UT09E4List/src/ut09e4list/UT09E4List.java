package ut09e4list;

import java.util.ArrayList;
import java.util.Iterator;

public class UT09E4List {

    public static void main(String[] args) {

        System.out.println("----- Ejemplo básico uso iterador -----");
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);

        Iterator<Integer> it = al.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ¿Qué diferencia tiene con un for each?
        System.out.println("----- Uso de iterador diferente a bucle for -----");
        Integer precioPan = 1;
        Integer precioLeche = 2;
        Integer precioHuevos = 3;

        ArrayList<Integer> monedero = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            monedero.add(1);
        }
        Iterator<Integer> cuentaMonedero = monedero.iterator();

        System.out.println("Pepito se va con su monedero a comparar lo que le ha pedido su mamá:");
        System.out.println(" - pan (1€)");
        System.out.println(" - leche (2€)");
        System.out.println(" - huevos (3€)");

        System.out.println("Pepito llega a la panadería a comprar pan.");
        Integer pagoEnPanaderia = 0;

        while (pagoEnPanaderia < precioPan && cuentaMonedero.hasNext()) {
            pagoEnPanaderia += cuentaMonedero.next();
        }
        if (pagoEnPanaderia.equals(precioPan)) {
            System.out.println("Pepito compró pan.");
        } else {
            System.out.println("No tenía dinero suficiente para comprar pan.");
        }

        System.out.println("Pepito llega a la lechería a comprar huevos.");
        Integer pagoEnLecheria = 0;
        while (pagoEnLecheria < precioLeche && cuentaMonedero.hasNext()) {
            pagoEnLecheria += cuentaMonedero.next();
        }
        if (pagoEnLecheria.equals(precioLeche)) {
            System.out.println("Pepito compró leche.");
        } else {
            System.out.println("No tenía dinero suficiente para comprar leche.");
        }

        System.out.println("Pepito llega a la huevería a comprar huevos.");
        Integer pagoEnHueveria = 0;
        while (pagoEnHueveria < precioHuevos && cuentaMonedero.hasNext()) {
            pagoEnHueveria += cuentaMonedero.next();
        }
        if (pagoEnHueveria.equals(precioHuevos)) {
            System.out.println("Pepito compró huevos.");
        } else {
            System.out.println("No tenía dinero suficiente para comprar huevos.");
        }

        Integer dineroSobrante = 0;
        while (cuentaMonedero.hasNext()) {
            dineroSobrante += cuentaMonedero.next();
        }
        System.out.println("A Pepito le han sobrado " + dineroSobrante + "€.");

    }

}
