package ut08e01erroresyexcepciones;

public class UT08E01ErroresYExcepciones {

    public static void main(String[] args) {
                
        //    descomenta las siguientes líneas una a una y fuerza su ejecución
        //    lee los mensajes de error
        //System.out.println("Hola")
        //ont a = 1;
        //llamoAFuncionQueNoExiste(1,2,3);
        
        
        //    prueba ahora con esta
        //int i = 1/0;
        
        //    y esta? en qué se diferencia?
        //funcionQueDividePorCero();
        
        //    y esta sobre las anteriores?
        //cosa1();
        
        //    y estas dos líneas
        //int[] arrayEnteros = {1,2,3,4,5};
        //System.out.println(arrayEnteros[8]);
                
    }
    
    public static void funcionQueDividePorCero(){
        int i = 1/0;
    }
    
    public static void cosa1(){
        cosa2();
    }
    
    public static void cosa2(){
        cosa3();
    }
    
    public static void cosa3(){
        cosa4();
    }
    
    public static void cosa4(){
        cosa5();
    }
    
    public static void cosa5(){
        funcionQueDividePorCero();
    }
    
}
