
package ut11e3eventos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class EventoConMasInfo implements ActionListener{

    private JTextField info;
    private JTextArea texto;
    private JLabel etiqueta;

    public EventoConMasInfo(JTextField info, JTextArea texto, JLabel etiqueta) {
        this.info = info;
        this.texto = texto;
        this.etiqueta = etiqueta;
    }
    

    
    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText(info.getText() + "/" + texto.getText());
    }
    
}
