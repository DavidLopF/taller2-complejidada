package co.edu.unbosque.controller;

import co.edu.unbosque.view.VentanaPrincipal;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Controller extends Component implements ActionListener {
    private VentanaPrincipal view;

    public Controller() {
        view = new VentanaPrincipal();
        asignarListeners();

    }

    public void asignarListeners() {
        view.getPanelInicio().getChoose().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("CHOOSE")) {
            String path = view.getPanelInicio().abrirChooser();
            cambiarPanel(view.getPanelOperacion());

        }

    }

    public void cambiarPanel(Component panel) {
        view.getContentPane().removeAll();
        view.getContentPane().add(panel);
        panel.setVisible(true);
        view.getContentPane().repaint();
    }
}
