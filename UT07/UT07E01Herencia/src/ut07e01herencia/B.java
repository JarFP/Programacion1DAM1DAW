package ut07e01herencia;

public class B extends A{
    protected char atributoB;
    
    public B(){
        this.atributoB = 'B';
    }
    
    protected void metodoB(){
        System.out.println("  yo soy " + this.atributoB);
    }
    
}
