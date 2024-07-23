package ut06e07sobrecarga;

public class UT06E07Sobrecarga {


    public static void main(String[] args) {
        
        // Usando métodos sobrecargados para sumar
        System.out.println("-----Usando métodos sobrecargados para sumar-----");
        int intA = 1, intB = 2;
        float floatA = 0.4F, floatB = 0.7F;
        double doubleA = 0.05, doubleB = 1.23;
        int[] intArrayA = {1,2,3};
        int[] intArrayB = {10,20,30};
        
        System.out.println("Suma de int: " + OperacionesMatematicas.sumar(intA, intB));
        System.out.println("Suma de float: " + OperacionesMatematicas.sumar(floatA, floatB));
        System.out.println("Suma de double/float: " + OperacionesMatematicas.sumar(doubleA, floatB));
        System.out.println("Suma de double: " + OperacionesMatematicas.sumar(doubleA, doubleB));
        System.out.print("Suma de int array: ");
        int[] aux = OperacionesMatematicas.sumar(intArrayA, intArrayB);
        for(int a: aux){
            System.out.print(a + " ");
        }
        System.out.println("");
        
        
        // Usando la sobrecarga de constructores
        System.out.println("-----Usando la sobrecarga de constructores-----");
        BarajaSobrecargada b1 = new BarajaSobrecargada();
        BarajaSobrecargada b2 = new BarajaSobrecargada("Mi bajara");
        
        String[] misPalos = {"Pikachus", "Charmanders", "Zubats"};
        String[] misFiguras = {"Uno", "Dos", "Tres", "Mega"};
        BarajaSobrecargada b3 = new BarajaSobrecargada("Mi pokebaraja", misPalos, misFiguras);
        
        b1.mostrarBaraja();
        b2.mostrarBaraja();
        b3.mostrarBaraja();
        
        System.out.println("-----Probando a barajar-----");
        b3.barajarCartas();
        b3.mostrarBaraja();
        
        
    }
    
}
