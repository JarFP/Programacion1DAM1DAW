package ut06e02claseseinstancias;

public class UT06E02ClasesEInstancias {

    public static void main(String[] args) {
        
        // Sin contar la clase UT06E02ClasesEInstancias:
        // En este punto del programa ¿cuántas clases tiene mi programa? 2
        // En este punto del programa ¿cuántas instancias tiene mi programa? 0
        
        Erizo e1 = new Erizo("Ramón", "Mar mediterraneo", 2);
        Erizo e2 = new Erizo("Paco", "Mar cantábrico", 3);
        Erizo e3 = new Erizo("Juan", "Oceano Atlántico", 1);
        e1.informacion();
        e2.informacion();
        e3.informacion();
        
        // Sin contar la clase UT06E02ClasesEInstancias:
        // En este punto del programa ¿cuántas clases tiene mi programa? 2
        // En este punto del programa ¿cuántas instancias tiene mi programa? 3
        
        if(e3.edad == 1){
            Tortuga t1 = new Tortuga("Mari Pili", "Pecera", 3);
            t1.informacion();
            // Sin contar la clase UT06E02ClasesEInstancias:
            // En este punto del programa ¿cuántas clases tiene mi programa? 2
            // En este punto del programa ¿cuántas instancias tiene mi programa? 4
        }
        
        // Sin contar la clase UT06E02ClasesEInstancias:
        // En este punto del programa ¿cuántas clases tiene mi programa? 2
        // En este punto del programa ¿cuántas instancias tiene mi programa? 3
        
        
    }
    
}
