
package ut06e07sobrecarga;

public class OperacionesMatematicas {
    
    public static int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static float sumar(float numero1, float numero2){
        return numero1 + numero2; 
    }
    
    public static double sumar(double numero1, float numero2){
        return numero1 + numero2;
    }
    
    public static double sumar(double numero1, double numero2){
        return numero1 + numero2;
    }
    
    public static int[] sumar(int[] numero1, int[] numero2){
        int[] resultado = new int[numero1.length];
        for(int i = 0; i < numero1.length; i++){
            resultado[i] = numero1[i] + numero2[i];
        }
        return resultado;
    }

}
