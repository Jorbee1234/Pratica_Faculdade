package Soma;

import javax.swing.*;
import java.awt.event.*;


public class calculo_soma {

    public static void main(String[] args){

        JFrame f = new JFrame("Calculadora");
        JButton b = new JButton("Somar");
        b.setBounds(130, 200, 100, 40);
        JLabel l1, l2, l3;
        
        final JTextField tf = new JTextField();
        tf.setBounds(120, 55, 70, 20);
        final JTextField tf2 = new JTextField();
        tf2.setBounds(120, 100, 70, 20);

        
        l1 = new JLabel("1° Valor: ");
        l1.setBounds(50, 50, 100, 30);

        l2 = new JLabel("2° Valor: ");
        l2.setBounds(50, 100, 100, 30);

        l3 = new JLabel(">Resposta<");
        l3.setBounds(150, 150, 450, 20);

        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1 = tf.getText();
                String s2 = tf2.getText();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int c = a+b;
                
                l3.setText(""+c);
            }
        });


        f.add(l1); 
        f.add(l2); 
        f.add(l3); 
        f.add(tf); 
        f.add(tf2);
        f.add(b);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}