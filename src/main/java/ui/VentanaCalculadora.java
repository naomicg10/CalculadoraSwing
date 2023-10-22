package ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCalculadora extends JFrame {

    private JPanel panel1;
    private JTextField textField1;
    private JButton cButton;
    private JButton button1;
    private JButton xButton;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton a0Button;
    private JButton a1Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton a7Button;
    private JButton a8Button;
    private JButton a9Button;
    private JLabel labelInfo;

    private ArrayList<Double> lista = new ArrayList<>();
    private Double resultado;
    private String operacion;
    /**
     * Esta es la clase principal que representa una calculadora.
     */
    public VentanaCalculadora(){
        setContentPane(panel1);
        setSize(300,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setTitle("Calculadora");

        /**
         * Limpia la pantalla de la calculadora cuando se presiona el botón "C".
         */
        //Button C
        cButton.addActionListener(e -> textField1.setText(""));
        /**
         * Realiza la operación de división cuando se presiona el botón "/".
         */
        //Button /
        button1.addActionListener(e -> {
            lista.add(Double.parseDouble(textField1.getText()));
            textField1.setText("");
            if(operacion != null){
                operacionesMultiples();
                lista.clear();
                lista.add(resultado);
            }
            operacion = "/";
        });
        /**
         * Realiza la operación de multiplicación cuando se presiona el botón "x".
         */
        //Button x
        xButton.addActionListener(e -> {
            lista.add(Double.parseDouble(textField1.getText()));
            textField1.setText("");
            if(operacion != null){
                operacionesMultiples();
                lista.clear();
                lista.add(resultado);
            }
            operacion = "x";
        });
        /**
         * Realiza la operación de resta cuando se presiona el botón "-".
         */
        //Button -
        button2.addActionListener(e -> {
            lista.add(Double.parseDouble(textField1.getText()));
            textField1.setText("");
            if(operacion != null){
                operacionesMultiples();
                lista.clear();
                lista.add(resultado);
            }
            operacion = "-";
        });
        /**
         * Realiza la operación de suma cuando se presiona el botón "+".
         */
        //Button +
        button3.addActionListener(e -> {
            lista.add(Double.parseDouble(textField1.getText()));
            textField1.setText("");
            if(operacion != null){
                operacionesMultiples();
                lista.clear();
                lista.add(resultado);
            }
            operacion = "+";
        });
        /**
         * Realiza el cálculo final y muestra el resultado cuando se presiona el botón "=".
         */
        //Button =
        button4.addActionListener(e -> {
            String seleccionar;
            lista.add(Double.parseDouble(textField1.getText()));

            if(operacion == "+"){
                suma();
                seleccionar = String.format("%.2f", resultado);
                textField1.setText(seleccionar);
            }else if(operacion == "-"){
                resta();
                seleccionar = String.format("%.2f", resultado);
                textField1.setText(seleccionar);
            }else if(operacion == "x"){
                multiplicar();
                seleccionar = String.format("%.2f", resultado);
                textField1.setText(seleccionar);
            }else if(operacion == "/"){
                dividir();
                seleccionar = String.format("%.2f", resultado);
                textField1.setText(seleccionar);
            }
        });
        /**
         * Muestra el número 0 en la pantalla cuando se presiona el botón "0".
         */
        //Button 0
        a0Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a0Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "1".
         */
        //Button 1
        a1Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a1Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "2".
         */
        //Button 2
        a2Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a2Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "3".
         */
        //Button 3
        a3Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a3Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "4".
         */
        //Button 4
        a4Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a4Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "5".
         */
        //Button 5
        a5Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a5Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "6".
         */
        //Button 6
        a6Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a6Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "7".
         */
        //Button 7
        a7Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a7Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "8".
         */
        //Button 8
        a8Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a8Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón "9".
         */
        //Button 9
        a9Button.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + a9Button.getText();
            textField1.setText(ingresaNumero);
        });
        /**
         * Muestra el número 1 en la pantalla cuando se presiona el botón ".".
         */
        //Button .
        button5.addActionListener(e -> {
            String ingresaNumero = textField1.getText() + button5.getText();
            textField1.setText(ingresaNumero);
        });
    }

    /**
     * Realiza operaciones múltiples (suma, resta, multiplicación o división) en función del valor de "operacion".
     */
    private void operacionesMultiples() {
        if(operacion == "+"){
            suma();
        }else if(operacion == "-"){
            resta();
        }else if(operacion == "x"){
            multiplicar();
        }else if(operacion == "/"){
            dividir();
        }
    }

    /**
     * Realiza una operación de división utilizando los valores en la lista y almacena el resultado.
     */
    private void dividir() {
        resultado = 0.0;
        for (int i = 0; i <= lista.size()-1; i++){
            double divisor = lista.get(i);
            if(divisor == 0){
                labelInfo.setText("Error: Division por cero");
            }
            if(resultado == 0.0){
                resultado = divisor;
            } else{
                resultado = resultado / divisor;
            }
        }
    }

    /**
     * Realiza una operación de multiplicación utilizando los valores en la lista y almacena el resultado.
     */
    private void multiplicar() {
        resultado = 0.0;
        for (int i = 0; i <= lista.size()-1; i++){
            if(resultado == 0.0){
                resultado = lista.get(i);
            } else{
                resultado = resultado * lista.get(i);
            }
        }
    }

    /**
     * Realiza una operación de resta utilizando los valores en la lista y almacena el resultado.
     */
    private void resta() {
        resultado = 0.0;
        for (int i = 0; i <= lista.size()-1; i++){
            if(resultado == 0.0){
                resultado = lista.get(i);
            } else{
                resultado = resultado - lista.get(i);
            }
        }
    }

    /**
     * Realiza una operación de suma utilizando los valores en la lista y almacena el resultado.
     */
    private void suma() {
        resultado = lista.stream().mapToDouble(Double::doubleValue).sum();
    }

    /**
     * Carga y muestra la ventana de la calculadora.
     */
    public void load(){
        setVisible(true);
    }
}
