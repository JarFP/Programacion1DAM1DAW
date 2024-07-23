package ut09e2genericos;

import ut09e2genericos.animales.*;


public class CuidarAnimal<T extends Animal> {
    private T animal;

    public CuidarAnimal(T animal) {
        this.animal = animal;
    }
    
    
    
}
