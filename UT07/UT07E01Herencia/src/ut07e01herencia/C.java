package ut07e01herencia;

public class C extends B{
    protected char atributoC;
    
    public C(){
        this.atributoC = 'C';
    }
    
    protected void metodoC(){
        System.out.println("  yo soy " + this.atributoC);
    }
    
}
