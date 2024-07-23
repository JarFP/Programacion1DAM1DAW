package ut02e01imprimiendo;

/**
 * En este ejemplo vamos a entender cómo imprimir por la pantalla.
 * Esta es una herramienta esencial que necesitamos para poder
 * hacer pruebas, comprobar que nuestro código hace lo que esperábamos
 * y como herramienta primitiva de depuración.
 * 
 * Practicaremos con:
 * - System.out.println
 * - System.out.print
 * - Uso de colores y caracteres especiales en cadenas de texto (ascii/unicode)
 * 
 * Además, repasamos los comentarios, con los dos tipos de notaciones,
 * de una línea y de múltiples líneas.
 */
public class UT02E01Imprimiendo {

    public static void main(String[] args) {
        // Texto + nueva línea
        System.out.println("-----Imprimiendo textos-----");
        System.out.println("Esto imprime un texto.");
        System.out.println("Esto imprime otro texto.");
        
        // Texto sin nueva línea
        System.out.println("-----Imprimiendo sin cambio de línea-----");
        System.out.print("Uno");
        System.out.print("Dos");
        System.out.print("Tres");
        System.out.print("\n");
    
        // Añadiendo colores (ansi)
        System.out.println("-----Imprimiendo con colores-----");
        System.out.println("\033[30m colores");
        System.out.println("\033[31m colores");
        System.out.println("\033[32m colores");
        System.out.println("\033[33m colores");
        System.out.println("\033[34m colores");
        System.out.println("\033[35m colores");
        System.out.println("\033[36m colores");
        System.out.println("\033[37m colores");
        System.out.println("\033[31mc\033[32mo\033[33ml\033[34mo\033[35mr\033[36me\033[37ms");
        
        // Caracteres especiales (unicode)
        System.out.println("-----Imprimiendo caracteres especiales-----");
        System.out.println("\u263A");
        System.out.println("\u00A9");
        System.out.println("\u24FE");

    }
    
}


/**
 * Ejercicio 1.
 * Dibuja un tablero de 3 en raya en el que se aprecien las fichas (X O)
 * y los bordes de las casillas.
 */

/**
 * Ejercicio 2.
 * Dibuja esta figura por pantalla:
 *  @@@@@@@@
 *  @ x  x @
 *  @  uu  @
 *  @@@@@@@@
 * Los ojos deben ser verdes, la boca roja y las @ amarillas.
 */

/**
 * Ejercicio 3.
 * Ejecuta las siguientes líneas de código en un nuevo programa:
 *      System.out.print("\033[35m uno");
        System.out.print("dos");
 * Reemplaza "print" por "println" ¿Qué diferencias aprecias?
 */