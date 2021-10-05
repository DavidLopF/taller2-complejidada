package co.edu.unbosque.view;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame{

    private PanelInicio panelInicio;
    private PanelOperacion panelOperacion;

    public VentanaPrincipal(){
        setTitle("Internacionale FC");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(10, 10));
        inicializarComponentes();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void inicializarComponentes() {
        panelInicio =  new PanelInicio();


        panelOperacion = new PanelOperacion();
        add(panelOperacion);

    }

    public PanelInicio getPanelInicio() {
        return panelInicio;
    }

    public PanelOperacion getPanelOperacion() {
        return panelOperacion;
    }
}
