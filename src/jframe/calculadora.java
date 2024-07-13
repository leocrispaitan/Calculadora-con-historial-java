
package jframe;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author leonel Paitan
 */

public class calculadora extends JFrame{
    
    private JLabel titulo;
    private JLabel pantalla;
    private JLabel operaciones;
    private JButton borrar;
    private JButton eliminar_valor;
    private JButton boton0;
    private JButton punto;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;
    private JButton boton8;
    private JButton boton9;
    private JButton resta;
    private JButton raiz;
    private JButton division;
    private JButton multiplicacion;
    private JButton suma;
    private JButton igual;
    //private JButton historial;
    private JPanel fondo;
    
    double primer_numero;
    String operador;
    private ventana_historial ventanaHistorial;
    
    
    public calculadora (){
        setLayout(null);
        
        fondo = new JPanel();
        fondo.setBounds(0, 0, 360, 550);
        fondo.setBackground(new java.awt.Color(40, 54, 55));
        fondo.setOpaque(true);
        ventanaHistorial = new ventana_historial();
        
        titulo = new JLabel("Calculadora");
        titulo.setBounds(120,0 , 100, 30);
        titulo.setOpaque(true);
        titulo.setForeground(new java.awt.Color(255,255,255));
        titulo.setFont(new java.awt.Font("Serif", 0, 20));
        titulo.setBackground(new java.awt.Color(40, 54, 55));
        
        JButton historial = new JButton();
        historial.setBackground(new java.awt.Color(40, 54, 55));
        historial.setBorder(null);
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/historial.png"));

        // Escalar la imagen al tamaño deseado
        Image imagen = icono.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        ImageIcon iconoEscalado = new ImageIcon(imagen);

        historial.setIcon(iconoEscalado);
        historial.setBounds(300, 10, 30, 30); // Ajusta también el tamaño del botón si es necesario

        pantalla = new JLabel("");
        pantalla.setBounds(10, 40 , 320, 50); 
        pantalla.setOpaque(true);
        pantalla.setForeground(new java.awt.Color(107, 125, 125));
        pantalla.setFont(new java.awt.Font("Serif", 0, 20));
        pantalla.setBackground(new java.awt.Color(40, 54, 55));
        pantalla.setHorizontalAlignment(SwingConstants.RIGHT);

        operaciones = new JLabel("");
        operaciones.setBounds(10, 90 , 320, 50); 
        operaciones.setOpaque(true);
        operaciones.setForeground(Color.white);
        operaciones.setFont(new java.awt.Font("Serif", 4, 25));
        operaciones.setBackground(new java.awt.Color(40, 54, 55));
        operaciones.setHorizontalAlignment(SwingConstants.RIGHT);
        
        borrar = new JButton("AC");
        borrar.setBounds(10, 150, 80, 70);
        borrar.setBackground(new java.awt.Color(107, 125, 125));
        borrar.setForeground(new java.awt.Color(255,255,255));
        borrar.setFont(new java.awt.Font("Serif",0, 22));
        
        eliminar_valor = new JButton("⌫");
        eliminar_valor.setBounds(90, 150, 80, 70);
        eliminar_valor.setBackground(new java.awt.Color(107, 125, 125));
        eliminar_valor.setForeground(new java.awt.Color(255,255,255));
        eliminar_valor.setFont(new java.awt.Font("Serif",0, 22));
        
        boton0 = new JButton("0");
        boton0.setBounds(10, 430, 160, 70);
        boton0.setBackground(new java.awt.Color(40, 54, 55));
        boton0.setForeground(new java.awt.Color(255,255,255));
        boton0.setFont(new java.awt.Font("Serif",0, 22));
        
        punto = new JButton(".");
        punto.setBounds(170, 430, 80, 70);
        punto.setBackground(new java.awt.Color(40, 54, 55));
        punto.setForeground(new java.awt.Color(255,255,255));
        punto.setFont(new java.awt.Font("Serif",0, 22));
        
        boton1 = new JButton("1");
        boton1.setBounds(10, 360, 80, 70);
        boton1.setBackground(new java.awt.Color(40, 54, 55));
        boton1.setForeground(new java.awt.Color(255,255,255));
        boton1.setFont(new java.awt.Font("Serif",0, 22));
        
        boton2 = new JButton("2");
        boton2.setBounds(90, 360, 80, 70);
        boton2.setBackground(new java.awt.Color(40, 54, 55));
        boton2.setForeground(new java.awt.Color(255,255,255));
        boton2.setFont(new java.awt.Font("Serif",0, 22));
        
        boton3 = new JButton("3");
        boton3.setBounds(170, 360, 80, 70);
        boton3.setBackground(new java.awt.Color(40, 54, 55));
        boton3.setForeground(new java.awt.Color(255,255,255));
        boton3.setFont(new java.awt.Font("Serif",0, 22));
        
        boton4 = new JButton("4");
        boton4.setBounds(10, 290, 80, 70);
        boton4.setBackground(new java.awt.Color(40, 54, 55));
        boton4.setForeground(new java.awt.Color(255,255,255));
        boton4.setFont(new java.awt.Font("Serif",0, 22));
        
        boton5 = new JButton("5");
        boton5.setBounds(90, 290, 80, 70);
        boton5.setBackground(new java.awt.Color(40, 54, 55));
        boton5.setForeground(new java.awt.Color(255,255,255));
        boton5.setFont(new java.awt.Font("Serif",0, 22));
        
        boton6 = new JButton("6");
        boton6.setBounds(170, 290, 80, 70);
        boton6.setBackground(new java.awt.Color(40, 54, 55));
        boton6.setForeground(new java.awt.Color(255,255,255));
        boton6.setFont(new java.awt.Font("Serif",0, 22));
        
        boton7 = new JButton("7");
        boton7.setBounds(10, 220, 80, 70);
        boton7.setBackground(new java.awt.Color(40, 54, 55));
        boton7.setForeground(new java.awt.Color(255,255,255));
        boton7.setFont(new java.awt.Font("Serif",0, 22));
        
        boton8 = new JButton("8");
        boton8.setBounds(90, 220, 80, 70);
        boton8.setBackground(new java.awt.Color(40, 54, 55));
        boton8.setForeground(new java.awt.Color(255,255,255));
        boton8.setFont(new java.awt.Font("Serif",0, 22));
        
        boton9 = new JButton("9");
        boton9.setBounds(170, 220, 80, 70);
        boton9.setBackground(new java.awt.Color(40, 54, 55));
        boton9.setForeground(new java.awt.Color(255,255,255));
        boton9.setFont(new java.awt.Font("Serif",0, 22));
        
        resta = new JButton("-");
        resta.setBounds(250, 290, 80, 70);
        resta.setBackground(new java.awt.Color(255,255,255));
        resta.setForeground(new java.awt.Color(0, 151, 136));
        resta.setFont(new java.awt.Font("Montserrat",1, 22));
        
        raiz = new JButton("√");
        raiz.setBounds(170, 150, 80, 70);
        raiz.setBackground(new java.awt.Color(255,255,255));
        raiz.setForeground(new java.awt.Color(0, 151, 136));
        raiz.setFont(new java.awt.Font("Montserrat",1, 22));
        
        division = new JButton("÷");
        division.setBounds(250, 150, 80, 70);
        division.setBackground(new java.awt.Color(255,255,255));
        division.setForeground(new java.awt.Color(0, 151, 136));
        division.setFont(new java.awt.Font("Montserrat",1, 22));
        
        multiplicacion = new JButton("x");
        multiplicacion.setBounds(250, 220, 80, 70);
        multiplicacion.setBackground(new java.awt.Color(255,255,255));
        multiplicacion.setForeground(new java.awt.Color(0, 151, 136));
        multiplicacion.setFont(new java.awt.Font("Montserrat",1, 22));
        
        suma = new JButton("+");
        suma.setBounds(250, 360, 80, 70);
        suma.setBackground(new java.awt.Color(255,255,255));
        suma.setForeground(new java.awt.Color(0, 151, 136));
        suma.setFont(new java.awt.Font("Montserrat",1, 22));
        
        igual = new JButton("=");
        igual.setBounds(250, 430, 80, 70);
        igual.setBackground(new java.awt.Color(0, 163, 62));
        igual.setForeground(new java.awt.Color(255,255,255));
        igual.setFont(new java.awt.Font("Montserrat",1, 22));
        
        add(titulo);
        add(pantalla);
        add(operaciones);
        add(borrar);
        add(eliminar_valor);
        add(boton0);
        add(punto);
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
        add(boton5);
        add(boton6);
        add(boton7);
        add(boton8);
        add(boton9);
        add(resta);
        add(raiz);
        add(division);
        add(multiplicacion);
        add(suma);
        add(igual);
        add(fondo);
        add(historial);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }

            private void historialActionPerformed(ActionEvent evt) {
            mostrarHistorial();
            }
        });
 
         
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }

            private void boton0ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "0");
            }
        });
        
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }

            private void boton1ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "1");
            }
        });
        
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }

            private void boton2ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "2");
            }
        });
        

        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }

            private void boton3ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "3");
            }
        });
        
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }

            private void boton4ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "4");
            }
        });
        
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }

            private void boton5ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "5");
            }
        });
        
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }

            private void boton6ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "6");
            }
        });
        
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }

            private void boton7ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "7");
            }
        });
        
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }

            private void boton8ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "8");
            }
        });

        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }

            private void boton9ActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + "9");
            }
        });
        
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }

            private void puntoActionPerformed(ActionEvent evt) {
            pantalla.setText(pantalla.getText() + ".");
            }
        });
        
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }

            private void borrarActionPerformed(ActionEvent evt) {
            pantalla.setText("");
            operaciones.setText("");
            }
        });
        
        eliminar_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_valorActionPerformed(evt);
            }

            private void eliminar_valorActionPerformed(ActionEvent evt) {
            String textoPantalla = pantalla.getText();
        int longitudTexto = textoPantalla.length();

        if (longitudTexto > 0) {
            String nuevoTexto = textoPantalla.substring(0, longitudTexto - 1);
            pantalla.setText(nuevoTexto);
        }
            }
        });

        //Operadores
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
            private void restaActionPerformed(ActionEvent evt) {
                primer_numero=Float.parseFloat(pantalla.getText());
                operador="-";
                pantalla.setText("");
            }
        });

        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
            private void sumaActionPerformed(ActionEvent evt) {
                primer_numero=Double.parseDouble(pantalla.getText());
                operador="+";
                pantalla.setText("");
            }
        });

        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
            private void multiplicacionActionPerformed(ActionEvent evt) {
                primer_numero=Double.parseDouble(pantalla.getText());
                operador="*";
                pantalla.setText("");
            }
        });

        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
            private void divisionActionPerformed(ActionEvent evt) {
                primer_numero=Double.parseDouble(pantalla.getText());
                operador="/";
                pantalla.setText("");
            }
        });

        raiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
            private void divisionActionPerformed(ActionEvent evt) {
                double numero = Double.parseDouble(pantalla.getText());
                double segundoNumero = Double.parseDouble(pantalla.getText());
        
                if (numero >= 0) {
                    double resultado = Math.sqrt(numero);
                    operaciones.setText(formatearResultado(primer_numero) + " " + operador + " " + 
        formatearResultado(segundoNumero) + " = " + formatearResultado(resultado));
        pantalla.setText(formatearResultado(resultado));
                } else {
                    pantalla.setText("ERROR: Número negativo");
                }
            }
        });

        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
            private void puntoActionPerformed(ActionEvent evt) {
                if(!(pantalla.getText().contains("."))){
                    pantalla.setText(pantalla.getText() + ""); 
                }
            
            }
        });
        

        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }

            private void igualActionPerformed(ActionEvent evt) {
            // Obtener el segundo número desde la pantalla
        double segundoNumero = Double.parseDouble(pantalla.getText());
        
        // Realizar la operación dependiendo de la operación seleccionada
        double resultado = 0.0;
        switch (operador) {
            case "+":
                resultado = primer_numero + segundoNumero;
                break;
            case "-":
                resultado = primer_numero - segundoNumero;
                break;
            case "*":
                resultado = primer_numero * segundoNumero;
                break;
            case "/":
                if (segundoNumero != 0) {
                    resultado = primer_numero / segundoNumero;
                } else {
                    // Manejar división por cero
                    pantalla.setText("ERROR: División por cero");
                    return;
                }
                break;
        }
        
        operaciones.setText(formatearResultado(primer_numero) + " " + operador + " " + 
        formatearResultado(segundoNumero) + " = " + formatearResultado(resultado));
        pantalla.setText(formatearResultado(resultado));
        
        // Preparar para la siguiente operación
        primer_numero = resultado;
        operador = "";

        // Agregar la operación al historial
        ventanaHistorial.agregarOperacion(operaciones.getText());
    }
});
        
        
    }
    //Metodo eliminar decimales si son ceros
    private String formatearResultado(double numero) {
    if (numero == (long) numero) {
        return String.format("%d", (long) numero);
    } else {
        return String.format("%s", numero);
    }
}
    

private void mostrarHistorial() {
    ventanaHistorial.setVisible(true);
}
    
    public static void main(String args[]) {
        calculadora sf = new calculadora();
        sf.setSize(360, 550);
        sf.setVisible(true);
        sf.setLocationRelativeTo(null);
    }
    

}