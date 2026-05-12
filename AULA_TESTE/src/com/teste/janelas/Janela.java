package com.teste.janelas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame{
    private JTextField jnumero1;
    private JTextField jnumero2;
    private JButton jbutao;
    private JPanel jpainel;
    private JLabel jresultado;

    public Janela(){
        this.setSize(300,250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CALCULADORA");
        this.add(jpainel);
        jbutao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(jnumero1.getText());
                double n2= Double.parseDouble(jnumero2.getText());
                double soma = n1 + n2;
                jresultado.setText("RESULTADO: "+soma);
            }
        });
    }

}
