
package ut11e3eventos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JLabel;


public class EventosTeclado implements KeyListener{
    
    private JLabel tecla;

    public EventosTeclado(JLabel tecla) {
        this.tecla = tecla;
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        // no quiero que este haga nada    
    }

    @Override
    public void keyPressed(KeyEvent e) {
        String dir = "";
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                dir = "Teclado: izquierda";
                System.out.println(dir);
                tecla.setText(dir);
                break;
            case KeyEvent.VK_RIGHT:
                dir = "Teclado: derecha";
                System.out.println(dir);
                tecla.setText(dir);
                break;
            case KeyEvent.VK_UP:
                dir = "Teclado: arriba";
                System.out.println(dir);
                tecla.setText(dir);
                break;
            case KeyEvent.VK_DOWN:
                dir = "Teclado: abajo";
                System.out.println(dir);
                tecla.setText(dir);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // no quiero que este haga nada
    }
    
}
