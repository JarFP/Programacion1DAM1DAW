package ut06e01elementosclase;

/**
 * Clase cuadrado, que emplea la palabra reservada this
 */
public class Cuadrado {
    double lado;
    
    // Este es el constructor, que recibe un double como parámetro
    public Cuadrado(double lado){
        this.lado = lado;
    }
    
    public double perimetro(){
        return this.lado*4; // se puede emplear this
    }
    
    public double area(){
        return lado*lado; // o no emplearlo ya que aquí no hay ambigüiedad
    }
    
}
