package ut06e04encapsulamiento;

import java.time.*;

public class UT06E04Encapsulamiento {

    public static void main(String[] args) {
        
        
        System.out.println("-----Usando la clase Contacto-----");
        
        Contacto c1 = new Contacto("Jorge");
        c1.email = "jorgete@micolega.com";
        c1.telefono = 592296339;
        c1.fechaNacimiento = LocalDate.of(2002, Month.DECEMBER, 2);
        c1.mayorDeEdad = true;
        c1.diasParaCumplenios();
        c1.mandarEmail("Hola", "Hola colega.");
        c1.llamadaTelefonica();
        c1.saberSiEsMayorDeEdad();
        
        Contacto c2 = new Contacto("Eva");
        c2.email = "asñlkdjfa";
        c2.telefono = -4;
        c2.fechaNacimiento = LocalDate.of(2089, Month.APRIL, 26);
        c2.mayorDeEdad = true;
        c2.diasParaCumplenios();
        c2.mandarEmail("¿Qué lejía utilizas?", "Me interesa, es para un amigo.");
        c2.llamadaTelefonica();
        c2.saberSiEsMayorDeEdad();
        
        
        // Con Jorge parece que todo ha ido bien, pero con Eva hemos conseguido
        // que la clase funcione mal desde mi propio main. Este comportamiento
        // podría ser malintencionado o casual, veamos cómo mitigar este problema.
        
        System.out.println("-----Usando la clase ContactoMejorado-----");
        
        ContactoMejorado cm1 = new ContactoMejorado("Jorge");
        cm1.introducirEmail("jorgete@micolega.com");
        cm1.introducirTelefono(592296339);
        cm1.introducirFechaNacimiento(LocalDate.of(2002, Month.DECEMBER, 2));
        cm1.diasParaCumplenios();
        cm1.mandarEmail("Hola", "Hola colega.");
        cm1.llamadaTelefonica();
        cm1.saberSiEsMayorDeEdad();
        
        ContactoMejorado cm2 = new ContactoMejorado("Eva");
        cm2.introducirEmail("asñlkdjfa");
        cm2.introducirTelefono(-4);
        cm2.introducirFechaNacimiento(LocalDate.of(2089, Month.APRIL, 26));
        cm2.diasParaCumplenios();
        cm2.mandarEmail("Hola", "Hola colega.");
        cm2.llamadaTelefonica();
        cm2.saberSiEsMayorDeEdad();
        
        System.out.println("-----Usando la clase Datos con getters y setter-----");
        
        Datos d = new Datos();
        d.setId(5);
        d.setNombre("asdf");
        d.setAceptado(false);
        System.out.println("Campo id: " + d.getId());
        System.out.println("Campo nombre: " + d.getNombre());
        System.out.println("Campo aceptado: " + d.isAceptado());
        
        
        
        
    }
    
}
