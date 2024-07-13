package jframe;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author leonel Paitan
 */

public class ventana_historial extends JFrame {
    
    private JTextArea historialTextArea;
    private JButton borrarButton;
    
    public ventana_historial() {
        initComponents();
        setTitle("              Historial");
        setSize(300, 550);
        setLocation(810, 64); 
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void initComponents() {
        historialTextArea = new JTextArea();
        historialTextArea.setFont(new java.awt.Font("Serif",0, 17));
        historialTextArea.setBackground(new java.awt.Color(40, 54, 55));
        historialTextArea.setForeground(Color.white);
        historialTextArea.setEditable(false);
        
        getContentPane().setLayout(new BorderLayout());
        
        getContentPane().add(historialTextArea, BorderLayout.CENTER);
        
        // Inicialización del botón
        borrarButton = new JButton("Eliminar Historial");
        borrarButton.setBackground(new java.awt.Color(253, 17, 5));
        borrarButton.setForeground(new java.awt.Color(255,255,255));
        borrarButton.setFont(new java.awt.Font("Montserrat", Font.BOLD, 16));

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                borrarHistorial(); 
            }
        });
        
        getContentPane().add(borrarButton, BorderLayout.SOUTH);
    }
    
    public void agregarOperacion(String operacion) {
        historialTextArea.append(operacion + "\n");
    }
    
    public void borrarHistorial() {
        historialTextArea.setText("");
    }
    
}
