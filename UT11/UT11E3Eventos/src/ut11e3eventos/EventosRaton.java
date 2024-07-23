
package ut11e3eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;


public class EventosRaton implements MouseListener{
   
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Ratón: Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Ratón: Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Ratón: Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Ratón: Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Ratón: Exited");
    }
    
}
