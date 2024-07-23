
package ut11e5graficos;

import java.awt.Font;
import java.awt.Graphics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;


public class Reloj extends JPanel{
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        LocalDateTime hora = LocalDateTime.now();
        DateTimeFormatter formatearHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = hora.format(formatearHora);
        g.setFont(new Font("Arial", Font.PLAIN, 30));
        g.drawString(horaFormateada, 100, 100);        
    }
}
