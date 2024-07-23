
package ut09e5set;


public class SecadorPelo implements Comparable<SecadorPelo>{
    private String marca;
    private String modelo;
    private int potencia;
    private double precio;

    public SecadorPelo(String marca, String modelo, int potencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nSecadorPelo{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + ", precio=" + precio + "}";
    }

    // Método que me obliga a implementar la interfaz Comparable
    @Override
    public int compareTo(SecadorPelo t) {
        return this.potencia - t.potencia; 
    }
    
    
}
