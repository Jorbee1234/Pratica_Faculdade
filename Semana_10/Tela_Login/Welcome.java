package Tela_Login;

import javax.swing.*;

public class Welcome {
	    private JFrame janela;
	    private JPanel painel;

	    private JLabel lbllogou;
	    
	    public Welcome(){   
	        janela = new JFrame();

	        painel = new JPanel();
	        janela.add(painel);
	        painel.setLayout(null);

	        lbllogou = new JLabel("Bem-vindo!");
	        lbllogou.setBounds(10, 20, 80, 25);
	        painel.add(lbllogou);

	        janela.setSize(350, 200);
	        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        janela.setTitle("Welcome");
	        janela.setVisible(true);
	    }
}

