package ut11e3eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class UT11E3Eventos {


    public static void main(String[] args) {
        
            // Creamos una ventana con un botón
            JFrame jframe1 = new JFrame();
            jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe1.setTitle("1 Botón con evento");
            jframe1.setLayout(new FlowLayout(FlowLayout.LEFT));
            jframe1.setSize(300, 300);
            JButton boton1 = new JButton("Botón 1");
            JButton boton2 = new JButton("Botón 2");
            jframe1.add(boton1);
            jframe1.add(boton2);
            jframe1.setVisible(true);
            
            // añadimos el evento al botón
            ReaccionEvento re = new ReaccionEvento();
            boton1.addActionListener(re);
            
            // añadimos el evento con una clase anónima
            boton2.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Otra reacción a evento...");
                }
            
            });
            
            
            // interactuando con otros componentes mediante eventos
            JFrame jframe2 = new JFrame();
            jframe2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe2.setTitle("2 Eventos y componentes");
            jframe2.setLayout(new FlowLayout(FlowLayout.LEFT));
            jframe2.setSize(300, 300);
            JButton botonSumar = new JButton("Sumar");
            JLabel etiqueta = new JLabel("0");
            jframe2.add(botonSumar);
            jframe2.add(etiqueta);
            botonSumar.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    Integer valor = Integer.parseInt(etiqueta.getText()) + 1;
                    etiqueta.setText(valor.toString());
                }
            
            });            
            jframe2.setVisible(true);
            
            
            // proporcionando más información a los eventos
            JFrame jframe3 = new JFrame();
            jframe3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe3.setTitle("3 Más info y componentes");
            jframe3.setLayout(new FlowLayout(FlowLayout.LEFT));
            jframe3.setSize(500, 300);
            JButton botonAccion = new JButton("Accion");
            JTextField info = new JTextField(10);
            JTextArea texto = new JTextArea(4, 10);            
            JLabel resultado = new JLabel("?");
            jframe3.add(botonAccion);
            jframe3.add(info);
            jframe3.add(texto);
            jframe3.add(resultado);
            botonAccion.addActionListener(new EventoConMasInfo(info, texto, resultado));            
            jframe3.setVisible(true);
            
            
            // key listener
            JFrame jframe4 = new JFrame();
            jframe4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe4.setTitle("4 Teclas");
            jframe4.setLayout(new FlowLayout(FlowLayout.LEFT));
            jframe4.setSize(300, 200);
            JLabel tecla = new JLabel("-");
            jframe4.add(tecla);
            jframe4.addKeyListener(new EventosTeclado(tecla));
            jframe4.setVisible(true);
            
            
            // mouse listener
            JFrame jframe5 = new JFrame();
            jframe5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jframe5.setTitle("5 Ratón");
            jframe5.setLayout(new FlowLayout(FlowLayout.LEFT));
            jframe5.setSize(300, 200);
            JButton botonMouse = new JButton("Eventos ratón");
            jframe5.add(botonMouse);
            botonMouse.addMouseListener(new EventosRaton());
            jframe5.setVisible(true);
            
        
    }
    
}
