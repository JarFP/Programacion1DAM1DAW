package ut07e01herencia;

public class Hija extends Padre{ // <-- extends
    private int atributoHija;
    
    public Hija(){
        super();  // <-- solo se puede usar como primera línea del constructor
        this.atributoHija = 4;
    }
    
    public void saludarDesdeHija(){
        System.out.println("  Saludo desde clase Hija.");
    }
    
    public void saludoFamiliar(){
        System.out.println("  ¡Saluda familia!");
        this.saludarDesdeHija();
        super.saludarDesdePadre();
    }
    
    public void imprimirTodosLosAtributosALosQueTengoAcceso(){
        System.out.println("   atributoHija: " + this.atributoHija);
        System.out.println("   atributoPadreProtected: " + this.atributoPadreProtected);
        System.out.println("   atributoPadreSinModificador: " + this.atributoPadreSinModificador);
        // no tiene acceso a atributoPadrePrivate
    }
}
