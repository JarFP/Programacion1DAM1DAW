package ut10e2readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class UT10E2ReadWrite {
    
    public static void main(String[] args) throws IOException {
        

        // Ejemplo de uso de Stream
        System.out.println("----- Usando Streams -----");
        try {
            OutputStream os = new FileOutputStream("streamsalida.txt");
            os.write("Datos de salida".getBytes());
            os.close();
            System.out.println("Archivo streamsalida.txt escrito usando OutputStream.");
        } catch (IOException e) {
            System.out.println("Error con OutputStream");
        }
        
        // ejemplo para crear y escribir en un fichero
        System.out.println("----- Creando un archivo con FileWriter -----");
        try{
            FileWriter fw = new FileWriter("fichero.txt");
            //FileWriter fw = new FileWriter("fichero.txt",true); // añadir
            fw.write("Mis números:");
            for (int i = 0; i < 20; i++) {
                fw.write("\n-" + i);
            }
            fw.close();
            System.out.println("Archivo fichero.txt escrito usando FileWriter.");
        } catch (IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }
        
        
        // ejemplo para leer datos de un fichero
        System.out.println("----- Leyendo un archivo con FileReader -----");
        try{
            FileReader fr = new FileReader("fichero.txt");
            int c = fr.read();
            System.out.println("Contenido del archivo:");
            while(c != -1){
                System.out.println((char)c);
                c = fr.read();
            }
        } catch(IOException e){
            System.out.println("Error al leer el fichero " + e.getMessage());
        }
        
        
        // Ejemplo de uso de la clase PrintWriter
        
        
        System.out.println("----- Escribiendo con PrintWriter -----");
        try{
            PrintWriter pw = new PrintWriter(new FileWriter("numeros.txt"));
            for (int i = 0; i < 10; i++) {
                int numero = (int)(Math.random() * 100 + 1);
                pw.println(numero);
            }
            pw.close();
            System.out.println("Se escribió el arctivo numeros.txt con 10 números aleatorios del 1 al 100.");
        } catch(IOException e){
            System.out.println("Error al escribir el fichero " + e.getMessage());
        }
        
               
        // Ejemplo de uso de la clase Scanner para leer archivos
        System.out.println("----- Leyendo numeros.txt con Scanner -----");
        try{
            Scanner sc = new Scanner(new File("numeros.txt"));
            while(sc.hasNext()){
                System.out.println("Número: " + sc.nextInt());
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo numeros.txt");
        } catch (IOException e) {
            System.out.println("Problama con la lectura de numeros.txt");
        }
        
    }
    
}
