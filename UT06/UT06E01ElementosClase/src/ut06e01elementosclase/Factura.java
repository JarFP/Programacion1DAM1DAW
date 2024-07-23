package ut06e01elementosclase;

/**
 * Esta es una clase que tiene atributos y métodos, esto es lo habitual
 * ya que hace que tenga mucha sinérgia y facilita la abstracción.
 */
public class Factura {
    // Atributos de la calse Factura
    String concepto;
    float precio;
    int iva;
    
    // Métodos de la clase Factura
    public float calcularImpuestos(){
        return (precio * iva) / 100;
    }   
        
    
}
