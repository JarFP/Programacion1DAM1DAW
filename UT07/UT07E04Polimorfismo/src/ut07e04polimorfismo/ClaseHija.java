package ut07e04polimorfismo;

public class ClaseHija extends ClasePadre{
    // sobrescritura del método de la clase padre  
    @Override
    protected void saludar(){
        System.out.println("  La clase hija saluda.");
    }
}


