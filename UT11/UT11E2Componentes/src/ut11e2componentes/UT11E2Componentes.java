package ut11e2componentes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;



public class UT11E2Componentes {


    public static void main(String[] args) {
        
    // sin layout
    JFrame jf1 = new JFrame();
    jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf1.setTitle("1 Sin layout");
    jf1.setSize(300, 300);
    JButton b1a = new JButton("Botón 1");
    JButton b1b = new JButton("Botón 2");
    jf1.add(b1a);
    jf1.add(b1b);
    jf1.setVisible(true);
    
    // con BorderLayout
    JFrame jf2 = new JFrame();
    jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf2.setTitle("2 Con BorderLayout");
    jf2.setLayout(new BorderLayout());
    jf2.setSize(300, 300);
    JButton b2a = new JButton("Botón 1");
    JButton b2b = new JButton("Botón 2");
    jf2.add(b2a, BorderLayout.NORTH);
    jf2.add(b2b, BorderLayout.SOUTH);
    jf2.setVisible(true);
    
    // con FlowLayout
    JFrame jf3 = new JFrame();
    jf3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf3.setTitle("3 Con FlowLayout");
    jf3.setLayout(new FlowLayout(FlowLayout.LEFT));
    jf3.setSize(300, 300);
    JButton b3a = new JButton("Botón 1");
    JButton b3b = new JButton("Botón 2");
    jf3.add(b3a);
    jf3.add(b3b);
    jf3.setVisible(true);
    
    // con GridLayout
    JFrame jf4 = new JFrame();
    jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf4.setTitle("4 Con GridLayout");
    jf4.setLayout(new GridLayout(2, 2)); // 2 fila 2 columnas
    jf4.setSize(300, 300);
    JButton b4a = new JButton("Botón 1");
    JButton b4b = new JButton("Botón 2");
    JButton b4c = new JButton("Botón 3");
    JButton b4d = new JButton("Botón 4");
    jf4.add(b4a);
    jf4.add(b4b);
    jf4.add(b4c);
    jf4.add(b4d);
    jf4.setVisible(true);
    
    
    // ejemplo componentes
    JFrame frameComp = new JFrame();
    frameComp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameComp.setTitle("5 Componentes de ejemplo");
    frameComp.setSize(400, 400);
    frameComp.setLayout(new GridLayout(2, 2));
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    p1.setBorder(BorderFactory.createLineBorder(Color.black));
    p2.setBorder(BorderFactory.createLineBorder(Color.red));
    p3.setBorder(BorderFactory.createLineBorder(Color.blue));
    p4.setBorder(BorderFactory.createLineBorder(Color.green));
    
    // jlabel
    JLabel jl = new JLabel("Etiqueta JLabel");
    p1.add(jl);
    // jbutton
    JButton jb = new JButton("Botón");
    p1.add(jb);
    // jtextfield
    JTextField jtf = new JTextField("Campo de texto");
    p2.add(jtf);
    // jtextarea
    JTextArea jta = new JTextArea("Área de texto");
    p2.add(jta);
    // jcheckbox
    JCheckBox jcb = new JCheckBox("Checkbox");
    p3.add(jcb);    
    // jradiobutton
    JRadioButton jrb1 = new JRadioButton("RadioButton1", true);
    JRadioButton jrb2 = new JRadioButton("RadioButton2", false);
    JRadioButton jrb3 = new JRadioButton("RadioButton3", false);
    ButtonGroup bg = new ButtonGroup();
    bg.add(jrb1);
    bg.add(jrb2);
    bg.add(jrb3);
    p4.add(jrb1);
    p4.add(jrb2);
    p4.add(jrb3);   
    // jcombobox
    String[] opciones = {"Opción 1", "Opción 2", "Opción 3", "Opción 4"};
    JComboBox<String> jcombo = new JComboBox<>(opciones);
    p3.add(jcombo);
    // jmenubar
    JMenuBar jmb = new JMenuBar();
    JMenu jm1 = new JMenu("Editar");
    jm1.add(new JMenuItem("Edición 1"));
    jm1.add(new JMenuItem("Edición 2"));
    jm1.add(new JMenuItem("Edición 3"));
    jm1.add(new JMenuItem("Edición 4"));
    JMenu jm2 = new JMenu("Formato");
    jm2.add(new JMenuItem("Formatear 1"));
    jm2.add(new JMenuItem("Formatear 2"));
    jm2.add(new JMenuItem("Formatear 3"));
    jm2.add(new JMenuItem("Formatear 4"));
    jmb.add(jm1);
    jmb.add(jm2);
    frameComp.setJMenuBar(jmb);
    
    frameComp.add(p1);
    frameComp.add(p2);
    frameComp.add(p3);
    frameComp.add(p4);
    
    frameComp.setVisible(true);
        
    }
    
}
