package ut10e6serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UT10E6Serializacion {

    
    public static void main(String[] args) {

        System.out.println("----- Creando objetos de ClaseA y ClaseB -----");
        ClaseA ca1 = new ClaseA("primero", 1, true);
        ClaseA ca2 = new ClaseA("segundo", 2, true);
        ClaseA ca3 = new ClaseA("tercero", 3, false);
        
        System.out.println(ca1);
        System.out.println(ca2);
        System.out.println(ca3);
        
        ClaseB cb = new ClaseB("Mi clase B", new ClaseA[]{ca1, ca2, ca3});
        System.out.println(cb);
        
        System.out.println("----- Serializando la instancia del objeto ClaseB -----");
        
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("instanciab.dat"));
            oos.writeObject(cb);
            oos.close();
            System.out.println("Archivo con objeto serializado escrito correctamente.");
        } catch(IOException e) {
            System.out.println("Error al serializar el objeto B.");
        }
        
        // Creamos otra instancia de ClaseB diferente
        ClaseB cb2 = null;
        
        System.out.println("----- Leemos el archivo y deserializamos el objeto -----");
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("instanciab.dat"));
            cb2 = (ClaseB)ois.readObject();
            ois.close();
            System.out.println("Archivo con objeto serializado leido correctamente.");
        } catch (ClassNotFoundException e) {
            System.out.println("Clase no encontrada al deserializar.");
        } catch(IOException e) {
            System.out.println("Error al serializar el objeto B.");
        }
        
        System.out.println("Mostrando la información del objeto deserializado:");
        System.out.println(cb2);
    }
    
}

