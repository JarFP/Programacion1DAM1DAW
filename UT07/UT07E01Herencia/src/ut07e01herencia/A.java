package ut07e01herencia;

public class A {
    protected char atributoA;
    
    public A(){
        this.atributoA = 'A';
    }
    
    protected void metodoA(){
        System.out.println("  yo soy " + this.atributoA);
    }
    
}
