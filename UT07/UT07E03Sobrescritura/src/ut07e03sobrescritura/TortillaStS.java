package ut07e03sobrescritura;

// esta es la misma clase tortilla pero sobrescribe el método toString de Object
public class TortillaStS {
    private final String[] ingredientes;

    public TortillaStS(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    @Override
    public String toString(){
        String valorRetornado = "Esta gloriosa tortilla está formada por " +
                this.ingredientes.length + " ingredientes, que son:";
        for(String ing: this.ingredientes){
            valorRetornado += " " + ing + ",";
        }
        valorRetornado = valorRetornado.substring(0, valorRetornado.length()-1) + 
                ". Espero que sea de su agrado.";
        return valorRetornado;
    }
}
