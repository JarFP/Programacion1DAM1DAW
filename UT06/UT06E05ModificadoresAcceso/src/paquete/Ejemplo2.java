package paquete;

public class Ejemplo2 {
    private int elementoPrivate;
    public int elementoPublic;
    protected int elementoProtected;
    int elementoSinModificadorDeAcceso;
    
    private void metodoPrivate(){
        System.out.println("Hola, soy un método private");
    }
    
    public void metodoPublic(){
        System.out.println("Hola, soy un método public");
    }
    
    protected void metodoProtected(){
        System.out.println("Hola, soy un método protected");
    }
    
    void metodoSinModificadorDeAcceso(){
        System.out.println("Hola, soy un método sin modificador de acceso");
    }
    
}