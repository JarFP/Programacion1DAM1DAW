package ut10e6serializacion;

import java.io.Serializable;


public class ClaseA implements Serializable {
    private String cadena;
    private int entero;
    private boolean verdaderoFalso;

    public ClaseA(String cadena, int entero, boolean verdaderoFalso) {
        this.cadena = cadena;
        this.entero = entero;
        this.verdaderoFalso = verdaderoFalso;
    }

    @Override
    public String toString() {
        return "ClaseA: " + "cadena=" + cadena + ", entero=" + entero + ", verdaderoFalso=" + verdaderoFalso;
    }
    
    
}
