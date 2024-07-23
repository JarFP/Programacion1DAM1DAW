package ut06e03abstraccion;

/**
 * Esta clase sirve para simular el comportamiento de un dado. El número de caras
 * del dado se puede personalizar desde 2 hasta 100.
 */
public class Dado {
    private static int TAMANO_HISTORIAL = 5;
    private int caras;
    private int[] historial;
    
    /**
    * Constructor de la clase Dado.
    * @param caras Número de caras de nuestro dado, de 2 a 100. Un valor fuera de este rango lo inicializa a 6 caras.
    */
    public Dado(int caras){
        if(caras > 1 && caras <= 100){
            this.caras = caras;
        } else{
            this.caras = 6;
        }
        historial = new int[TAMANO_HISTORIAL];
        for(int i = 0; i < TAMANO_HISTORIAL; i++){
            historial[i] = -1;
        }
        
    }
    
    /**
     * Método que devuelve el resultado de lanzar el dado.
     * @return número obtenido al lanzar el dado
     */
    public int lanzarDado(){
        int resultado = (int)(Math.random()*this.caras+1);
        for(int i = TAMANO_HISTORIAL-1; i > 0; i--){
            historial[i] = historial[i-1];
        }
        historial[0] = resultado;
        return resultado;
    }
    
     /**
     * Método que devuelve un historial con las últimas tiradas del dado
     */
    public void mostrarHistorial(){
        System.out.println("@@@Resultado de las últimas tiradas "
                + "del dado, de más reciente a menos reciente "
                + "(maximos resultados: "+TAMANO_HISTORIAL+")@@@");
        for (int elem : historial) {
            if(elem != -1){
                System.out.println(" - " + elem);
            }
        }
    }
    
}
