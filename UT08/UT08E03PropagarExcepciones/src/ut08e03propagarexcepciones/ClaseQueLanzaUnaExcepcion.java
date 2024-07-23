
package ut08e03propagarexcepciones;

import java.io.IOException;


public class ClaseQueLanzaUnaExcepcion {
    
    // esta es una función que genera una excepción pero que no la maneja
    // ya que no tiene un try catch, pero puede lanzarla para que otro
    // la maneje con throws
    public static void lanzoVariasExcepciones() throws ArithmeticException, NullPointerException, IOException{
        int i = 1/0;
    }
    

}
