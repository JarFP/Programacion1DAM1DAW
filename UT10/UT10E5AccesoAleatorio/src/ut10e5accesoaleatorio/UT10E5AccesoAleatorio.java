package ut10e5accesoaleatorio;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UT10E5AccesoAleatorio {

    public static void main(String[] args) {

        System.out.println("----- Leyendo ficheros con acceso aleatorio -----");
        try {
            RandomAccessFile raf = new RandomAccessFile("accesoAleatorio.bin", "rw");
            for (int i = 0; i < 10; i++) {
                raf.writeInt(i);
            }
            
            raf.seek(5*4);
            System.out.println("Números en posición 20("+raf.readInt()+") y 24(" + raf.readInt() + ")");
            
        } catch (IOException e) {
            System.out.println("Error al acceder al archivo.");
        }
        
        
    }
    
}
