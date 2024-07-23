package ut08e03propagarexcepciones;

public class UT08E03PropagarExcepciones {

    public static void main(String[] args) {

        System.out.println("----- Uso de la palabra throw -----");
        
        try {
            // creando un objeto del tipo de la excepción y luego lanzándolo
            ArithmeticException miExcepcion = new ArithmeticException();
            throw miExcepcion;
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción ArithmeticException");
        }
        
        
        try {
            // lanzándolo directamente
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Se ha producido una excepción ArithmeticException");
        }

        int valor = 20;
        
        try {
            // imaginemos un caso en el que si valor es 20 mi programa 
            // sufriría un problema al ejecutarse, con otros valores no
            if(valor == 20){
                throw new ArithmeticException();
            } else {
                System.out.println("Valor es " + valor + " es me parece bien.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Si valor es 20 mi programa explota :(");
        }
        
        
        
        System.out.println("----- Uso de la palabra throws -----");
        try {
            lanzoExcepcion();
        } catch (ArithmeticException e) {
            System.out.println("Esta excepción me ha llegado desde un método de mi clase");
        }
        
        try {
            ClaseQueLanzaUnaExcepcion.lanzoVariasExcepciones();
        } catch (Exception e) {
            System.out.println("Esta excepción me ha llegado desde un método de otra clase");
        }
        
    }
    
   public static void lanzoExcepcion() throws ArithmeticException{
        int i = 1/0;
    }
    
}
