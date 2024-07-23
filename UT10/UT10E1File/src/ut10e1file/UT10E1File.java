package ut10e1file;

import java.io.File;
import java.io.IOException;

public class UT10E1File {

// Sobre la clase File
    // esta clase da información, no los crea o modifica
    // crear archivos y directorios
    
    public static void main(String[] args) {
        
        // ejemplo información fichero (tiene extensión)
        File fichero = new File("miFichero.txt");
        if(fichero.exists()){
            System.out.println("El fichero existe");
        } else {
            System.out.println("El fichero no existe");
        }
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta: " + fichero.getAbsolutePath());
        
        
        // ejemplo información carpeta (no tiene extensión)
        File carpeta = new File("miCarpeta");
        if(carpeta.exists()){
            System.out.println("La carpeta existe");
        } else {
            System.out.println("La carpeta no existe");
        }
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta: " + carpeta.getAbsolutePath());
        
        
        // crear un nuevo archivo
        File fichero2 = new File("miFichero2.txt");
        try {
            if(fichero2.createNewFile()){
                    System.out.println("Fichero creado.");
            } else {
                    System.out.println("El fichero ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el fichero " + e.getMessage());
        }
        
        // crear una carpeta
        File carpeta2 = new File("miCarpeta2");
        if(carpeta2.mkdir()){
            System.out.println("Carpeta creada.");
        } else {
            System.out.println("No se ha podido crear la carpeta.");        
        }
        
        // borrar un archivo
        File fichero3 = new File("borrar.txt");
        if(fichero3.delete()){
            System.out.println("Fichero eliminado");
        } else {
            System.out.println("No se pudo eliminar el fichero.");
        }
        
        // lista de archivos en una carpeta
        File carpeta3 = new File("."); // directorio actual
        String[] contenido = carpeta3.list();
        System.out.println("Lista de archivos/carpetas en la carpeta actual:");
        if(contenido != null) {
            for(String c: contenido){
                System.out.println("  - " + c);
            }
        }
        
    }
    
}
