package ut06e02claseseinstancias;

public class Erizo {
    String nombre;
    String habitat;
    int edad;
    
    public Erizo(String nombre, String habitat, int edad){
        this.nombre = nombre;
        this.habitat = habitat;
        this.edad = edad;
    }
    
    public void informacion(){
        System.out.println("Información del erizo:");
        System.out.println(" - Nombre: " + this.nombre);
        System.out.println(" - Hábitat: " + this.habitat);
        System.out.println(" - Edad: " + this.edad);
    }
    
}
