
package ut11e5graficos;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class UT11E5Graficos {


    
    public static void main(String[] args) {
        // "iconocagar.png"    "reloj.png"
        
        // creamos una JFrame con un icono y una imagen
        JFrame jframe = new JFrame("JFrame con icono e imagen");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(500, 500);
        JPanel jpanel = new JPanel();
        jframe.add(jpanel);
        
        // icono
        ImageIcon icono = new ImageIcon("icono.png");
        JButton jbutton = new JButton("Botón con icono", icono);
        jpanel.add(jbutton);
        
        // imagen
        try {
            BufferedImage imagen = ImageIO.read(new File("reloj.png"));
            Image imagenEscalada = imagen.getScaledInstance(380, 380, Image.SCALE_SMOOTH);
            JLabel etiqueta = new JLabel(new ImageIcon(imagenEscalada));
            jpanel.add(etiqueta);
        } catch (IOException e) {
            System.out.println("Error al cargar la imagen");
        }
        
        jframe.setVisible(true);
        
        
        
        // trabajando con gráficos
        JFrame jframeReloj = new JFrame("JFrame grafico repintado");
        jframeReloj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframeReloj.setSize(300, 200);
        Reloj reloj = new Reloj();
        jframeReloj.add(reloj);
        
        Timer temporizador = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jframeReloj.repaint();
            }
        });
        temporizador.start();
        
        jframeReloj.setVisible(true);
        
        
    }
    
}
