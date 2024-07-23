package ut09e2genericos.animales;


public class Animal {
    
    public void comer(){
        System.out.println("El animal come.");
    }

    @Override
    public String toString() {
        return "Soy un animal";
    }
    
    
     
}
