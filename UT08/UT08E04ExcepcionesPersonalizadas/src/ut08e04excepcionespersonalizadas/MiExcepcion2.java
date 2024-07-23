package ut08e04excepcionespersonalizadas;

import java.io.IOException;

public class MiExcepcion2 extends IOException{ // se puede heredar de otro tipo de excepciones si lo necesitamos

    public MiExcepcion2() {
    }
    
    public MiExcepcion2(String info) {
        super(info); // pasamos info al constructor de Exception
    }
    
}
