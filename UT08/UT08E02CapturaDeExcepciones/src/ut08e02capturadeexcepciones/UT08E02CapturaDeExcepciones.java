package ut08e02capturadeexcepciones;

import java.util.Scanner;

public class UT08E02CapturaDeExcepciones {

    public static void main(String[] args) {

        
        try {
            // aquí ponemos el código que puede causar la excepción
        } catch (Exception e) {
            // aquí ponemos el código que se ejecutara si se produce
            // la excepción, si no se produce la excepción este código
            // no se ejecuta
        } finally {
            // aquí ponemos el código que se ejecutará tanto si se
            // produce la excepción como si no se produce
        }
        
        int numero = 4;
        
        System.out.println("----- Escenario en el que ocurre una excepción -----");
        System.out.println("A1 - fuera antes");
        try {
            System.out.println("A2 - try antes excepción");
            numero = numero / 0; //<-- esto genera excepción
            System.out.println("A3 - try después excepción");
        } catch (Exception e) {
            System.out.println("A4 - catch");
        } finally {
            System.out.println("A5 - finally");
        }
        System.out.println("A6 - fuera después");
        
        
        System.out.println("----- Escenario en el que no ocurre una excepción -----");
        System.out.println("B1 - fuera antes");
        try {
            System.out.println("B2 - try antes excepción");
            numero = numero / 2; //<-- esto no genera excepción
            System.out.println("B3 - try después excepción");
        } catch (Exception e) {
            System.out.println("B4 - catch");
        } finally {
            System.out.println("B5 - finally");
        }
        System.out.println("B6 - fuera después");
        
        System.out.println("------- LLAMANDO AL MÉTODO -----");
        metodoQuePropagaExcepcion();
        
        
        System.out.println("----- Ejemplo habitual de uso de finally -----");
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("Introduzca un número entero: ");
            int num = scanner.nextInt();
            System.out.println("Número: " + num);
        } catch (Exception e) {
            System.out.println("Usando los métodos de Exception");

            System.out.println("e.getCause() - "+e.getCause());
            System.out.println("e.getClass() - "+e.getClass());
            System.out.println("e.getLocalizedMessage() - "+e.getLocalizedMessage());
            System.out.println("e.getMessage() - "+e.getMessage());
            System.out.println("Imprimiendo la traza:");
            e.printStackTrace();
        } finally {
            // Cerramos el Scanner en el bloque finally
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner cerrado en finally.");
            }
        }
        
        System.out.println("----- Ejemplo múltiples catch -----");
        try {
            // Intentamos dividir por cero
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Manejamos la excepción ArithmeticException (división por cero)
            System.out.println("Se produjo una excepción de división por cero: " + e.getMessage());
        } catch (NullPointerException e) {
            // Manejamos la excepción NullPointerException (acceso a un objeto nulo)
            System.out.println("Se produjo una excepción de puntero nulo: " + e.getMessage());
        } catch (Exception e) {
            // Manejamos cualquier otra excepción que no se haya capturado en los bloques catch anteriores
            System.out.println("Se produjo una excepción: " + e.getMessage());
        }
        
        
    }
    
    public static boolean metodoQuePropagaExcepcion() throws ArithmeticException {
            
        int numero = 4;
        
        System.out.println("----- Escenario en el que ocurre una excepción y hay un retrun en el catch -----");
        System.out.println("C1 - fuera antes");
        try {
            System.out.println("C2 - try antes excepción");
            numero = numero / 0; //<-- esto genera excepción
            System.out.println("C3 - try después excepción");
        } catch (Exception e) {
            System.out.println("C4 - catch");
            return true;
        } finally {
            System.out.println("C5 - finally");
        }
        System.out.println("C6 fuera después");        
        return false;
         
        
    }
        
    
    
}
