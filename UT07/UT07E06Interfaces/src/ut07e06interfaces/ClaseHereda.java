package ut07e06interfaces;

public class ClaseHereda implements InterfaceHereda {

    @Override
    public void metodoHereda() {
        System.out.println("Método hereda desde claseHereda");
    }

    @Override
    public void metodo1() {
        System.out.println("Método 1 desde claseHereda");
    }

    @Override
    public void metodo2() {
        System.out.println("Método 2 desde claseHereda");
    }
    
}
