package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class PanelOperacion extends JPanel {

    private JLabel[] labels;
    private JComboBox algortmos;
    private JLabel fondo;

    
    public PanelOperacion(){
        setLayout(null);
        setVisible(true);
        setBackground(Color.RED);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        labels =  new JLabel[2];
        iniciarLabelTexto(0, "Algoritmo para realizar busqueda: ", 390, 100, 70, 300, 13, Color.white);

        algortmos = new JComboBox();
        algortmos.setBounds(410,150, 200, 25 );
        add(algortmos);

        fondo = new JLabel();
        devolverImagenLabel("panel2", "png", 700, 600, fondo);
        fondo.setBounds(0, 0, 700, 600);
        add(fondo);
    }


    public void devolverImagenLabel(String src, String tipo, int escalax, int escalay, JLabel b) {
        ImageIcon imagen1 = new ImageIcon(ClassLoader.getSystemResource("Images/" + src + "." + tipo));
        ImageIcon icon = new ImageIcon(imagen1.getImage().getScaledInstance(escalax, escalay, Image.SCALE_DEFAULT));
        b.setIcon(icon);
    }


    public void iniciarLabelTexto(int pos, String texto, int x, int y, int alto, int ancho, int tamañoLetra, Color colorLetra) {
        labels[pos] = new JLabel(texto);
        labels[pos].setBounds(x, y, ancho, alto);
        labels[pos].setFont(new Font("Century Gothic", Font.BOLD, tamañoLetra));
        labels[pos].setForeground(colorLetra);
        add(labels[pos]);
    }
}
