package com.sistema.janelas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame{

    private JTextField campo1;
    private JTextField campo2;
    private JButton calcularButton;
    private JPanel painel;

    public Janela(){
        this.setTitle("CALCULADORA");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(painel);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto1 = campo1.getText();
                String texto2 = campo2.getText();
                double numero1 = Double.parseDouble(texto1);
                double numero2 = Double.parseDouble(texto2);
                double soma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "SOMA: "+soma);
            }
        });
    }

}
