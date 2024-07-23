
package ut06e07sobrecarga;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BarajaSobrecargada {
    
    private final String[] PALOS_BASE = {"Oros", "Copas", "Espadas", "Bastos"};
    private final String[] FIGURAS_BASE = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Sota", "Caballo", "Rey"};
    
    private String nombre;
    private String[] palos;
    private String[] figuras; 
    private String[] cartas;
    
    public BarajaSobrecargada(){
        this.palos = PALOS_BASE;
        this.figuras = FIGURAS_BASE;
        this.nombre = "Baraja sin nombre";
        generarCartas();

    }
    
    public BarajaSobrecargada(String nombre){
        this(); // <-- llamamos al contructor base y luego hacemos operaciones adicionales
        this.nombre = nombre;
    }
    
    public BarajaSobrecargada(String nombre, String[] palos, String[] figuras){
        this.nombre = nombre;
        this.palos = palos;
        this.figuras = figuras;
        generarCartas();
    }
    
    private void generarCartas(){
        this.cartas = new String[palos.length * figuras.length];
        int indiceBaraja = 0;
        for(int i = 0; i < palos.length; i++){
            for(int j = 0; j < figuras.length; j++){
                this.cartas[indiceBaraja] = figuras[j] + " de " + palos[i];
                indiceBaraja++;
            }
        }
    }
    
    public void barajarCartas(){
       // Esto no lo hemos visto aún, pero soy un ninja!
       List<String> cartasList = Arrays.asList(this.cartas);
       Collections.shuffle(cartasList);
       this.cartas = cartasList.toArray(new String[cartasList.size()]);
    }
    
    public void mostrarBaraja(){
        System.out.println("CONTENIDO DE LA BARAJA (" + this.nombre + "):");
        for(String carta : this.cartas){
            System.out.println(" - " + carta);
        }
    }
    
}
