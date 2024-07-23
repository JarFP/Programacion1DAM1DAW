package ut10e6serializacion;

import java.io.Serializable;


public class ClaseB implements Serializable{
    private String info;
    private ClaseA[] cae;

    public ClaseB(String info, ClaseA[] cae) {
        this.info = info;
        this.cae = cae;
    }

    @Override
    public String toString() {
        String cad = "ClaseB: " + "info=" + info;
        for (ClaseA ca : cae) {
            cad += "\n  - " + ca;
        }
        return cad;
    }
    
    
    
}
