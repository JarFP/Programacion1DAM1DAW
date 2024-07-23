package ut06e10arraylistparaclases;

public class Carta {
    private String palo;
    private String figura;
    
    public Carta (String palo, String figura){
        this.palo = palo;
        this.figura = figura;
    }
    
    public void infoCarta(){
        System.out.println(figura + " de " + palo);
    }
}
