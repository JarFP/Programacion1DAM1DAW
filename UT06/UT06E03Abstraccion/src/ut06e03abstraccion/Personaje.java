package ut06e03abstraccion;

public class Personaje {
    private String nombre;
    private String clase;
    private int nivel;
    private int puntosDeVida;
    private Dado dado;
    
    /**
    * Constructor de la clase Personaje.
    * @param nombre Nombre del personaje
    * @param clase Puede ser: Guerrero, Arquero y Mago (si se introducen valores erroneos será Guerrero)
    * @param nivel Nivel del personaje, afectará a su poder de ataque y sus puntos de vida
    */
    public Personaje(String nombre, String clase, int nivel){
        this.nombre = nombre;
        switch (clase.toLowerCase()) {
            case "mago":
                this.clase = "mago";
                this.puntosDeVida = nivel * 5;
                this.dado = new Dado(12);
                break;
            case "arquero":
                this.clase = "arquero";
                this.puntosDeVida = nivel * 8;
                this.dado = new Dado(8);
                break;
            default:
                this.clase = "guerrero";            
                this.puntosDeVida = nivel * 12; 
                this.dado = new Dado(5);
        }
        this.nivel = nivel;
        
    }
    
    /**
    * Este método hace que el personaje ataque.
    * @return Devuelve el valor del ataque realizado por el personaje
    */
    public int atacar(){
        return this.nivel * 2 + this.dado.lanzarDado() + this.dado.lanzarDado();
    }
    
    /**
    * Este método hace que el personaje se defienda de un ataque.
    * @param valorAtaque Valor del ataque del enemigo del que deberá defenderse el personaje
    * @return Devuelve true si el personaje sigue vivo tras la defensa y false si muere
    */
    public boolean defender(int valorAtaque){
        if(this.puntosDeVida > valorAtaque){
            this.puntosDeVida = this.puntosDeVida - valorAtaque;
            System.out.println(this.nombre + " aguanta el ataque de " 
                    + valorAtaque + " puntos de daño, aún le quedan " 
                    + this.puntosDeVida + " puntos de vida.");
            return true;
        } else {
            System.out.println(this.nombre + " ha muerto al recibir un "
                    + "ataque de " + valorAtaque + " puntos de daño.");
            return false;
        }
    }
    
    
    
    
}
