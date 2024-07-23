
package ut06e06otrosmodificadores;

import java.util.Arrays;

public class UT06E06OtrosModificadores {

    final static int NUMERO = 4;
    final static int numero2 = 9; // <-- O_O mira ese warning! 

    
    public static void main(String[] args) {
        
        System.out.println("-----Trabajando con atributos finales-----");
        System.out.println("Valor de numero: " + NUMERO);
        //numero = 7; // <- da error! 
        System.out.println("Valor de numero: " + NUMERO);
        System.out.println("Valor de numero2: " + numero2);
        
        System.out.println("-----Explorando clases que usamos estáticamente-----");
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        // Sin miedo, pulsa control y pincha en Arrays o en comparte. 
        // Mira los modificadores que usa.
        Arrays.compare(a,b);
        
        System.out.println("-----Usando métodos sin instanciar la clase-----");
        m1();
        m2();
        m3();
        //m4(); // <- da error!               
                
    }
    
    public static void m1(){
        System.out.println("public static void m1()");
    }
    
    static void m2(){
        System.out.println("static void m2()");
    }
    
    protected static void m3(){
        System.out.println("sprotected static void m3()");
    }
    
    public void m4(){
        System.out.println("public void m4()");
    }
    
}
