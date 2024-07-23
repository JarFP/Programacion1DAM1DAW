package ut06e01elementosclase;

/**
 * Esta es una clase con constructor que recibe el radio como parámetro
 */
public class Circulo {
    double radio;
    
    // Este es el constructor, que recibe un double como parámetro
    public Circulo(double r){
        radio = r;
    }
    
    public double perimetro(){
        return 2*Math.PI*radio;
    }
    
    public double area(){
        return Math.PI*radio*radio;
    }
        
}
