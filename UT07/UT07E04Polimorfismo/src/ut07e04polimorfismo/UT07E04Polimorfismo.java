package ut07e04polimorfismo;

import java.util.Scanner;


public class UT07E04Polimorfismo {

    public static void main(String[] args) {
        
        System.out.println("----- Polimorfismo con clase Padre, Hija e HijaSP -----");
        ClasePadre instanciaPadre = new ClasePadre();
        ClaseHija instanciaHija = new ClaseHija();
        ClaseHijaSP instanciaHijaSP = new ClaseHijaSP();
        
        // tenemos tres clases diferentes, pero podemos tratarlas como
        // iguales desde el punto de vista de su jerarquía
        
        ClasePadre[] array = {instanciaPadre, instanciaHija, instanciaHijaSP};
        
        // hacemos un bucle para que todos los elementos del array saluden
        for(ClasePadre p : array){
            p.saludar();
        }
        
        System.out.println("---- Todo puede almacenarse en un Object -----");
        
        Object[] trastero = new Object[5];
        
        trastero[0] = instanciaPadre;
        trastero[1] = instanciaHija;
        trastero[2] = "Hola";
        trastero[3] = 3;
        trastero[4] = new Scanner(System.in);
        
        System.out.println("Depura y mira el contenido de trastero");
        
        for(Object o : trastero){
            System.out.println(o);
        }
        
        // Usando instanceof
        System.out.println("---- Usando instanceOf -----");
        boolean esInstancia;
        esInstancia = instanciaPadre instanceof ClasePadre;
        System.out.println("instanciaPadre es de la ClasePadre: " + esInstancia);
        esInstancia = instanciaPadre instanceof ClaseHija;
        System.out.println("instanciaPadre es de la ClaseHija: " + esInstancia);
        esInstancia = instanciaHija instanceof ClasePadre;
        System.out.println("instanciaHija es de la ClasePadre: " + esInstancia + " <-- OJO!");
        esInstancia = instanciaHija instanceof ClaseHija;
        System.out.println("instanciaHija es de la ClaseHija: " + esInstancia);
        
    }
    
}
