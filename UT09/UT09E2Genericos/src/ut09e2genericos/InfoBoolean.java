package ut09e2genericos;

public class InfoBoolean {
    private Boolean dato;
    
    public InfoBoolean(Boolean dato){
        this.dato = dato;
    }
    
    public void dameInfo(){
        System.out.println("La información es: " + dato);
    }
}
