package ut09e2genericos;

public class Info<T> { // <-- ojo! (T es una notación de convenio, puedes nombrarla como quieras)
    private T dato;
    
    public Info(T dato){
        this.dato = dato;
    }
    
    public void dameInfo(){
        System.out.println("La información es: " + dato);
    }
}
