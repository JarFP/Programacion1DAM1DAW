package ut07e05clasesabstractas;

public class ClaseQueHeredaDeUnaAbstracta extends ClaseAbstracta {
    
    @Override
    void metodo1(){
        System.out.println("Esto es el método 1");
    }
    
    @Override
    void metodo2(int a){
        System.out.println("El valor de a es: " + a);
    }
    
}
