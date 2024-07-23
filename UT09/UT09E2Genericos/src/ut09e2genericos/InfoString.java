
package ut09e2genericos;


public class InfoString {
    private String dato;
    
    public InfoString(String dato){
        this.dato = dato;
    }
    
    public void dameInfo(){
        System.out.println("La información es: " + dato);
    }
}