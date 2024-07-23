package ut07e01herencia;

public class Padre {
    private int atributoPadrePrivate;
    protected int atributoPadreProtected;
    int atributoPadreSinModificador;
    
    public Padre(){
        this.atributoPadrePrivate = 1;
        this.atributoPadreProtected = 2;
        this.atributoPadreSinModificador = 3;
    }
    
    protected void saludarDesdePadre(){
        System.out.println("  Saludo desde clase Padre.");
    }
    
    
}
