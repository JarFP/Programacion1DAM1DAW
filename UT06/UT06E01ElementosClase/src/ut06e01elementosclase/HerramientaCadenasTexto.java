package ut06e01elementosclase;

/**
 * Esta es una clase que no tiene atributo pero tiene métodos.
 */
public class HerramientaCadenasTexto {
    
    // Método para contar palabras de una cadena
    public int contarPalabras(String cadena){
        int numeroPalabras;
        numeroPalabras = (cadena.split(" ")).length;
        return numeroPalabras;
    }
    
    // Método para convertir una cadena a mayusculas
    public String convertirMayusculas(String cadena){
        return cadena.toUpperCase();
    }
    
    // Método para convertir una cadena a minusculas
    public String convertirMinusculas(String cadena){
        return cadena.toLowerCase();
    }
    
}
