package ut06e03abstraccion;

public class UT06E03Abstraccion {

    public static void main(String[] args) {
        
        // Usando la clase String
        System.out.println("-----Usando la clase string-----");
        String s = new String("Me abstraigo de todo!");
        System.out.println(s.toUpperCase());
        String s2 = "Yo me instancio de forma especial, soy un enchufado!";
        System.out.println(s2.toLowerCase());

        // Usando la clase Dados
        System.out.println("-----Usando la clase dado-----");
        Dado d = new Dado(50);
        // Lanzando el dado 5 veces
        for(int i = 0; i < 5; i++){
            System.out.println("El resultado de la tirada es: " + d.lanzarDado());
        }
        d.mostrarHistorial();
                
        Dado d2 = new Dado(3);
        System.out.println("El resultado es: " + d2.lanzarDado());
        d2.mostrarHistorial();
        
        // Usando la clase Personaje
        System.out.println("-----Usando la clase personaje-----");
        Personaje miArqueroOP = new Personaje("Legolasxd", "Arquero", 5);
        Personaje miMagoGigachad = new Personaje("Beygar", "Mago", 4);
        
        int ataque;
        // Turno de atacar para el arquero.
        ataque = miArqueroOP.atacar();
        // A ver ese mago cómo se defiende
        miMagoGigachad.defender(ataque);
        // Llego la venganza del mago!
        miArqueroOP.defender(miMagoGigachad.atacar());
        
    }
    
}
