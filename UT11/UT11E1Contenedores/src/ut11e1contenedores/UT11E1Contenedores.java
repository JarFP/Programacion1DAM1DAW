
package ut11e1contenedores;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class UT11E1Contenedores {


    public static void main(String[] args) {
        
        // Creamos un JFrame escribiendo el código directamente
        JFrame miFrame = new JFrame("Título de la ventana");
        
        // Establecemos el comportamiento que tendrá pulsar el botón X 
        // mira la Javadoc para ver qué más opciones exiten
        miFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // establecemos el tamaño de la ventana en px
        miFrame.setSize(300, 100);
        
        // mostramos la ventana
        miFrame.setVisible(true);
        
        // creamos un panel
        JPanel panel1 = new JPanel();
        
        // añadimos el panel a miFrame
        miFrame.add(panel1);
               
         
    }
    
}
