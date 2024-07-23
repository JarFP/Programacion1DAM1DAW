package ut06e04encapsulamiento;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Esta clase modela un contacto de una agenda telefónica
 */
public class Contacto {
    
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean mayorDeEdad;
    public int telefono;
    public String email;
    
    public Contacto(String nombre){
        this.nombre = nombre;
    }
    
    public void llamadaTelefonica(){
        System.out.println("Llamando a " + this.nombre 
                + ", su número es " + this.telefono + "...");
    }
    
    public void mandarEmail(String tituloEmail, String cuerpoEmail){
        System.out.println("MANDANDO EMAIL A: " + this.email);
        System.out.println("TÍTULO: " + tituloEmail);
        System.out.println("CUERPOR: " + cuerpoEmail);
    }
    
    public void saberSiEsMayorDeEdad(){
        Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
        int anios = periodo.getYears();
        
        if(this.mayorDeEdad){
            System.out.println(this.nombre + " es mayor de edad, tiene "+ anios +" años.");
        } else{
            System.out.println(this.nombre + " no es mayor de edad, tiene "+ anios +" años.");
        }
        
    }
    
    public void diasParaCumplenios(){
        LocalDate fechaActual = LocalDate.now();
        LocalDate proximoCumpleanios = fechaNacimiento.withYear(fechaActual.getYear());
        // Si ya ha pasado el cumpleaños de este año calculo el del que viene
        if (proximoCumpleanios.isBefore(fechaActual)) {
            proximoCumpleanios = proximoCumpleanios.plusYears(1);
        }
        // Calcular la diferencia en días
        long diasHastaCumpleanios = ChronoUnit.DAYS.between(fechaActual, proximoCumpleanios);
        if(diasHastaCumpleanios == 0){
            System.out.println("¡Hoy es el cumpleaños de " + this.nombre + "!");
        } else {
            System.out.println("Días hasta el cumpleaños de " 
                    + this.nombre +": " + diasHastaCumpleanios);
        }
        
    }
    
    
    
}
