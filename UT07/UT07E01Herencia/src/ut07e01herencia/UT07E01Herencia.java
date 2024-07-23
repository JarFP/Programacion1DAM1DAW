package ut07e01herencia;

public class UT07E01Herencia {


    public static void main(String[] args) {
        System.out.println("----- Usando clase Padre e Hija -----");
        
        System.out.println("Instancia de padre:");
        Padre p = new Padre();
        p.saludarDesdePadre();
        
        System.out.println("Instancia de hija:");
        Hija h = new Hija();
        
        h.saludarDesdeHija();
        System.out.println("");
        
        h.saludarDesdePadre();
        System.out.println("");
        
        h.saludoFamiliar();
        System.out.println("");
        
        h.imprimirTodosLosAtributosALosQueTengoAcceso();
        System.out.println("");
        
        
        System.out.println("----- Usando la jerarquía de clases A-B-C -----");
        
        // En esta jerarquía B hereda de A y C hereda de B
        
        System.out.println("Cosas que puede hacer A");
        A a = new A();
        a.metodoA();
                
        System.out.println("Cosas que puede hacer B");
        B b = new B();
        b.metodoB();
        b.metodoA();
        
        System.out.println("Cosas que puede hacer C");
        C c = new C();
        c.metodoC();
        c.metodoB();
        c.metodoA(); // <-- gracias abuelo! :D
                
    }
    
}
