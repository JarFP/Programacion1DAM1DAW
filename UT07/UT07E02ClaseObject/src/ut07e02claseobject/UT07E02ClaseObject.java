package ut07e02claseobject;

public class UT07E02ClaseObject {

    public static void main(String[] args) {
        
        System.out.println("----- Una clase totalmente vacía ¿tiene métodos? -----");
        ClaseVacia cv = new ClaseVacia();
        System.out.println(cv.toString());
        
        String cadena1 = "uno";
        String cadena2 = "uno";
        String cadena3 = "tres";
        
        System.out.println("----- Usando hashCode -----");
        System.out.println("El hash code de cadena1 es: " + cadena1.hashCode());
        System.out.println("El hash code de cadena2 es: " + cadena2.hashCode());
        System.out.println("El hash code de cadena3 es: " + cadena3.hashCode());
        
        
        System.out.println("----- Usando equals -----");
        if(cadena1.equals(cadena2)){
            System.out.println("cadena1 y cadena2 son iguales");
        } else {
            System.out.println("cadena1 y cadena2 son diferentes");
        }
        if(cadena1.equals(cadena3)){
            System.out.println("cadena1 y cadena3 son iguales");
        } else {
            System.out.println("cadena1 y cadena3 son diferentes");
        }
        
        System.out.println("----- Usando getClass -----");
        System.out.println("La clase de cadena1 es: " + cadena1.getClass());
                
    }
    
}
