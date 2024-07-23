package ut07e05clasesabstractas;

public class UT07E05ClasesAbstractas {

    public static void main(String[] args) {
        
        System.out.println("----- Probando clases abstractas -----");
        //ClaseAbstracta a = new ClaseAbstracta(); // <- esto da error
        
        ClaseQueHeredaDeUnaAbstracta b = new ClaseQueHeredaDeUnaAbstracta();
        b.metodo1();
        b.metodo2(5);
        b.informarVariable();
        b.variable = 7;
        b.informarVariable();
        
        
    }
    
}
