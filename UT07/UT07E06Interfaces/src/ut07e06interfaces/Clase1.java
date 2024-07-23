package ut07e06interfaces;

public class Clase1 implements Interface1 {
    int i;
    
    public Clase1(int i){
        this.i = i;
    }
    
    @Override
    public void metodo1(){
        System.out.println("Hola soy el método1");
    }
    
    public void miInfo(){
        System.out.println("El valor de i es " + this.i);
    }
    
}


