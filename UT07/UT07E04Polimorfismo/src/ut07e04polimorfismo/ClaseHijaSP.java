package ut07e04polimorfismo;

public class ClaseHijaSP extends ClasePadre{
    // en esta clase hija vamos a hacer una sobrescritura parcial del método
    // usando tanto el contenido de saludar del padre como uno propio
    
    @Override
    protected void saludar(){
        super.saludar();
        System.out.println("  La clase hija saluda.");
    }
    
}
