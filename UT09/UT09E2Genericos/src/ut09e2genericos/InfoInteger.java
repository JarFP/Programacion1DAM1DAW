package ut09e2genericos;


public class InfoInteger {
    private Integer dato;
    
    public InfoInteger(Integer dato){
        this.dato = dato;
    }
    
    public void dameInfo(){
        System.out.println("La información es: " + dato);
    }
}
