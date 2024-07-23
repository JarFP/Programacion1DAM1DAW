package ut07e05clasesabstractas;


abstract class ClaseAbstracta {
    int variable = 3;
    
    void informarVariable(){
        System.out.println("El valor de la variable es " + this.variable);
    }
    
    abstract void metodo1();
    abstract void metodo2(int a);
    
    
}
