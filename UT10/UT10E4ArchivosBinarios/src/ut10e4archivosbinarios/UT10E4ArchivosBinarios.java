package ut10e4archivosbinarios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;


public class UT10E4ArchivosBinarios {

    
    public static void main(String[] args) {

        // Generamos números enteros aleatorios
        int cantidadDatos = 5;
        int[] enterosAleatorios = new int[cantidadDatos];
        Random generadorNumeros = new Random();
        for (int i = 0; i < cantidadDatos; i++) {
            enterosAleatorios[i] = generadorNumeros.nextInt(100);            
        }

        String archivoBinario = "datosBinarios.bin";

        // Escribir datos en el archivo binario
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream(archivoBinario))) {
            for (int value : enterosAleatorios) {
                os.writeInt(value);
            }
            System.out.println("Datos escritos en el archivo binario correctamente.");
            System.out.println("El tamaño del archivo es: " + os.size() + " bytes.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo binario: " + e.getMessage());
        }

        // Leer datos del archivo binario
        try (DataInputStream is = new DataInputStream(new FileInputStream(archivoBinario))) {
            System.out.println("Leyendo datos del archivo binario:");
            while (is.available() > 0) {
                int value = is.readInt();
                System.out.println(value);
            }
        } catch (IOException e) {
            System.out.println("Error al leer del archivo binario: " + e.getMessage());
        }
        
        
    }
    
}
