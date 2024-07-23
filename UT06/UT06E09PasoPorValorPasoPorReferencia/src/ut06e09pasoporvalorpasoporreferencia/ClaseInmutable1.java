package ut06e09pasoporvalorpasoporreferencia;

public final class ClaseInmutable1 {
    private final int dato;
    
    public ClaseInmutable1(int dato){
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }
    
    public void miInfo(){
        System.out.println(" Soy una ClaseInmutable1");
        System.out.println(" Mi dato es: " + this.dato);
    }
    
}
