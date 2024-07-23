package ut08e04excepcionespersonalizadas;

public class UT08E04ExcepcionesPersonalizadas {

    public static void main(String[] args) {

        
        System.out.println("----- Usando una excepción simple con un constructor vacío -----");
        try {
            MiExcepcion1 e1 = new MiExcepcion1();
            throw e1;
        } catch (MiExcepcion1 e1) {
            System.out.println("He capturado una MiExcepcion1");
            System.out.println(e1.getMessage());
        }
        
        // este es el ejemplo más habitual
        System.out.println("----- Usando una excepción simple con un constructor con información -----");
        try {
            MiExcepcion2 e2 = new MiExcepcion2("Algo raro causó esto");
            throw e2;
        } catch (MiExcepcion2 e2) {
            System.out.println("He capturado una MiExcepcion2");
            System.out.println(e2.getMessage());
        }
        
        
        // generando excepción solo en casos concretos
        System.out.println("----- Generando la excepción condicionalmente -----");
        int valor = 2;
        try {
            if(valor > 0){
                MiExcepcion2 e2 = new MiExcepcion2("Valor no puede ser un número positivo y era " + valor);
                throw e2;
            } else {
                System.out.println("Gracias por darme este número negativo, todo ok!");
            }
        } catch (MiExcepcion2 e2) {
            System.out.println("He capturado una MiExcepcion2");
            System.out.println(e2.getMessage());
        }
        
        
    }
    
}
