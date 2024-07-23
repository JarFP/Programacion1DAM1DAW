package ut06e04encapsulamiento;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactoMejorado {
        
    public String nombre;
    public LocalDate fechaNacimiento;
    public boolean mayorDeEdad;
    public int telefono;
    public String email;
    
    public ContactoMejorado(String nombre){
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
        if(this.fechaNacimiento != null){
            Period periodo = Period.between(this.fechaNacimiento, LocalDate.now());
            int anios = periodo.getYears();

            if(this.mayorDeEdad){
                System.out.println(this.nombre + " es mayor de edad, tiene "+ anios +" años.");
            } else{
                System.out.println(this.nombre + " no es mayor de edad, tiene "+ anios +" años.");
            }
        }
        
    }
    
    public void diasParaCumplenios(){
        if(this.fechaNacimiento != null){
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
    
    // En lugar de dejar que el usuario modifique los parámetros, crearemos
    // unos métodos que se asegurarán de que estos parámetros son apropiados
    
    public void introducirEmail(String email){
        String regexEmail = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern patron = Pattern.compile(regexEmail);
        Matcher matcher = patron.matcher(email);
        if (matcher.matches()) {
            this.email = email;
        } else {
            System.out.println("ERROR: La dirección de correo no es válida.");
        }
    }
    
    public void introducirTelefono(int telefono){
        int min = 100000000;
        int max = 999999999;
        if(telefono >= min && telefono <= max){
            this.telefono = telefono;
        } else {
            System.out.println("ERROR: El número de teléfono no es válido.");
        }
    }
    
    public void introducirFechaNacimiento(LocalDate fecha){
        if (fecha.isBefore(LocalDate.now())) {
            this.fechaNacimiento = fecha;
        } else {
            System.out.println("ERROR: La fecha de nacimiento no es válida.");
        }
    }
        
}
