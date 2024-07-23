
package ut10e3buffers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class UT10E3Buffers {

    public static void main(String[] args) {
        
        // Escritura de líneas en fichero sin BufferedWriter
        System.out.println("----- Escribiendo sin Buffer -----");
        long tInicial, tFinal;
        int numeroLineas = 100000;
        tInicial = System.currentTimeMillis();

        
        try{
            FileWriter fw = new FileWriter("escribirFileWriter.txt");
            for (int i = 0; i < numeroLineas; i++) {
                fw.write("Línea: " + i + "\n");
            }
            fw.close();
        } catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (FileWriter) "+ numeroLineas +" líneas: " + (tFinal - tInicial));
        
        // Escritura de líneas en fichero con BufferedWriter
        System.out.println("----- Escribiendo con Buffer -----");
        tInicial = System.currentTimeMillis();
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("escribirBufferedWriter.txt"));
            for (int i = 0; i < numeroLineas; i++) {
                bw.write("Línea: " + i + "\n");
            }
            bw.close();
        } catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (BufferedWriter) "+ numeroLineas +" líneas: " + (tFinal - tInicial));

        // Contando la líneas de un archivo sin buffer
        System.out.println("----- Leyendo sin Buffer -----");
        long contadorCaracteres = 0;
        tInicial = System.currentTimeMillis();
        
        try{
            FileReader fr = new FileReader("escribirFileWriter.txt");
            int caracter = fr.read();
            while (caracter != -1) {
                contadorCaracteres++;
                caracter = fr.read();
            }
            fr.close();
        } catch (IOException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (FileReader) "+ contadorCaracteres +" caracteres: " + (tFinal - tInicial));
        
        // Contando la líneas de un archivo con buffer
        System.out.println("----- Leyendo con Buffer -----");
        contadorCaracteres = 0;
        tInicial = System.currentTimeMillis();
        
        try{
            BufferedReader br = new BufferedReader(new FileReader("escribirFileWriter.txt"));
            int caracter = br.read();
            while (caracter != -1) {
                contadorCaracteres++;
                caracter = br.read();
            }
            br.close();
        } catch (IOException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }

        tFinal = System.currentTimeMillis();
        System.out.println("Tiempo en milisegundos (BufferedReader) "+ contadorCaracteres +" caracteres: " + (tFinal - tInicial));
        
        
    }

}