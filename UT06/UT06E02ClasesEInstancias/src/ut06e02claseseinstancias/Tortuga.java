package ut06e02claseseinstancias;

public class Tortuga {
    String nombre;
    String habitat;
    int edad;
    
    public Tortuga(String nombre, String habitat, int edad){
        this.nombre = nombre;
        this.habitat = habitat;
        this.edad = edad;
    }
    
    public void informacion(){
        System.out.println("Información de la tortuga:");
        System.out.println(" - Nombre: " + this.nombre);
        System.out.println(" - Hábitat: " + this.habitat);
        System.out.println(" - Edad: " + this.edad);
    }
    
}
