package ut07e03sobrescritura;

public class ClaseHija extends ClasePadre{
    // sobrescritura del método de la clase padre  
    @Override
    protected void saludar(){
        System.out.println("  La clase hija saluda.");
    }
}


