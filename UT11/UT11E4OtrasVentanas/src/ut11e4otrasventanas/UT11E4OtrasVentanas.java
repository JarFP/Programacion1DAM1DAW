package ut11e4otrasventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class UT11E4OtrasVentanas {

    public static void main(String[] args) {
            
        // el primer parámetro hereda características de otro componente
        JOptionPane.showMessageDialog(null, "Mensaje 1.");
        
                
        // tener un componente permite heredar algunas características:
        // - coordenadas en la pantalla
        // - aspecto
        // - icono
        JFrame jframe = new JFrame("Mi JFrame");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        JPanel jpanel = new JPanel();
        jframe.add(jpanel);
        jpanel.add(new JLabel("Pulsame con el botón derecho del ratón"));
        JButton jbutton = new JButton("Selector de archivos");
        jpanel.add(jbutton);
        jframe.setVisible(true);
        JOptionPane.showMessageDialog(jframe, "Mensaje 2, referenciado al JFrame.");
        JOptionPane.showMessageDialog(jframe, "Mensaje 3.", "Tipo: info", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(jframe, "Mensaje 4.", "Tipo: error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(jframe, "Mensaje 5.", "Tipo: warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(jframe, "Mensaje 6.", "Tipo: pregunta", JOptionPane.QUESTION_MESSAGE);
        
        // option pane con pregunta
        int resultado = JOptionPane.showConfirmDialog(jframe, "¿Sí o No?");
        if(resultado == JOptionPane.YES_OPTION){
            System.out.println("Respuesta: Sí");        
        } else if(resultado == JOptionPane.NO_OPTION){
            System.out.println("Respuesta: No");
        } else {
            System.out.println("Sin respuesta");
        }
        
        // solicitar datos con option pane
        String nombre = JOptionPane.showInputDialog(jframe, "¿Cómo te llamas?");
        System.out.println("Hola " + nombre);
        
        
        //
        Object[] opciones = {"Opción 1","Opción 2","Opción 3","Opción 4","Opción 5"};
        resultado = JOptionPane.showOptionDialog(jframe, "Selecciona una:", 
                "Selección de opciones", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        System.out.println("Selección: " + opciones[resultado]);
        

        // menú pop up. configuramos el menú y las opciones        
        JPopupMenu jpm = new JPopupMenu();
        JMenuItem jmi1 = new JMenuItem("Opción 1");
        jmi1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsada la opción de menú 1");
            }
        });
        JMenuItem jmi2 = new JMenuItem("Opción 2");
        jmi2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsada la opción de menú 2");
            }
        });
        JMenuItem jmi3 = new JMenuItem("Opción 3");
        jmi3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pulsada la opción de menú 3");
            }
        });
        jpm.add(jmi1);
        jpm.add(jmi2);
        jpm.add(jmi3);
        jpanel.add(jpm);
        
        // añadimos un event listener del ratón al label
        jpanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                showPopupMenu(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                showPopupMenu(e);
            }

            private void showPopupMenu(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    jpm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        
        // añadiendo JFileChooser       
        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea un JFileChooser
                JFileChooser fileChooser = new JFileChooser();
                // ventana emergente del JFileChooser
                int result = fileChooser.showOpenDialog(jframe);
                // Si se selecciona un archivo, se saca por consola la info
                if (result == JFileChooser.APPROVE_OPTION) {
                    String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
                    System.out.println("Seleccionado el archivo: " + rutaArchivo);
                }
            }
        });
        
        
        
        
        
    }
    
}
