package ut07e06interfaces;

public class UT07E06Interfaces {

    public static void main(String[] args) {
        
        System.out.println("----- Ejemplo base de interface -----");
        Clase1 c1 = new Clase1(3);
        c1.miInfo();
        c1.metodo1(); // método de la interface1       
        
        
        System.out.println("----- Ejemplo de interface con atributo final -----");
        Clase2 c2 = new Clase2();
        c2.metodo2();
        System.out.println("El dato que heredo de la interface " + c2.dato);        
        
        
        System.out.println("----- Ejemplo con métod static y default -----");
        Interface3.soyUnMetodoEstatico();
        Clase3A c3a = new Clase3A();
        Clase3B c3b = new Clase3B();
        c3a.soyUnMetodoDefault();
        c3b.soyUnMetodoDefault();       
        
        
        System.out.println("----- Referencias a distintas clases que implementen misma interfaz -----");
        Interface3[] ia = {c3a, c3b};
        for(Interface3 i : ia){
            i.soyUnMetodoDefault();
        }
                
        
        System.out.println("----- Una clase implementando más de una interface -----");
        Clase123 c123 = new Clase123();
        c123.metodo1();
        c123.metodo2();
        c123.soyUnMetodoDefault();
                
        
        System.out.println("----- Interfaz que hereda de otras interfaces -----");
        ClaseHereda ch = new ClaseHereda();
        ch.metodo1();
        ch.metodo2();
        ch.metodoHereda();
        ch.soyUnMetodoDefault(); 

        
    }
    
}
