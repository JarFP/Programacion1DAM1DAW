package ut06e08clasesanidadasenum;

public class Coche {
    
    private String marca;
    
    public Coche(String marca){
        this.marca = marca;
    }
    
    public void arrancarChoche(){
        Bujia b = new Bujia();
        b.hacerCosasDeBujias();
        System.out.println("¡El " + this.marca + " arranca!");
        OtraClaseAnidada o = new OtraClaseAnidada();
        o.accederAElementosDeLaClaseExterna();
    }
    
    private class Bujia { // clase anidada
        public void hacerCosasDeBujias(){
            System.out.println("La bujía está haciendo su función...");
        }
    }
    
    private class OtraClaseAnidada{
        public void accederAElementosDeLaClaseExterna(){
            System.out.println("La marca es: " + marca);
        }
    }
    
}
