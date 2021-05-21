package prof_soma;

//Nome : Jorbe Muniz Braga Junior / Matricula : 0050016533

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class prof_soma implements ActionListener {

	private JFrame janela;
	private JPanel painel;
	
	private JLabel lbltitulo;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JLabel lblResultado;
	
	private JTextField txtNum1;
	private JTextField txtNum2;
	
	private JButton btnSomar;
	private JButton btnDividir;
	private JButton btnMultiplicar;
	private JButton btnSubtrair;
	
	public prof_soma() {
		janela = new JFrame ();
		
		painel = new JPanel();
		painel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		painel.setLayout(new GridLayout(0,1));
	
		//Componentes da tela
		lbltitulo = new JLabel("Calculadora");
		lbltitulo.setFont(new Font("Verdana",Font.BOLD,20));
		painel.add(lbltitulo);
		
		lblNum1 = new JLabel("Num1: ");
		painel.add(lblNum1);
		txtNum1 = new JTextField("0");
		painel.add(txtNum1);
		lblNum2 = new JLabel ("Num2: ");
		painel.add(lblNum2);
		txtNum2 = new JTextField("1");
		painel.add(txtNum2);
		
		btnSomar = new JButton("Somar");
		btnSomar.addActionListener(this);
		painel.add(btnSomar);
		
		btnDividir = new JButton("Dividir");
		btnDividir.addActionListener(this);
		painel.add(btnDividir);
		
		btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.addActionListener(this);
		painel.add(btnMultiplicar);
		
		btnSubtrair = new JButton("Subtrair");
		btnSubtrair.addActionListener(this);
		painel.add(btnSubtrair);
		
		lblResultado = new JLabel("Resultado = ");
		lblResultado.setFont(new Font("Verdana", Font.BOLD,18));
		lblResultado.setForeground(Color.red);
		painel.add(lblResultado);
		
		
		janela.add(painel,BorderLayout.CENTER);
		janela.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		janela.setSize(300,300);
		janela.pack();
		janela.setVisible(true);
		
	}
	public static void main(String [] args) {
		new prof_soma();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		somar mate = new somar();
		
		
		Integer num1 = Integer.parseInt( txtNum1.getText() );
		Integer num2 = Integer.parseInt( txtNum2.getText() );
		
		if(e.getActionCommand().equalsIgnoreCase("Dividir"))
		lblResultado.setText("Resultado =" + mate.div(num1,num2));
		else if (e.getActionCommand().equalsIgnoreCase("Somar"))
		lblResultado.setText("Resultado =" + mate.mat(num1,num2));
		else if (e.getActionCommand().equalsIgnoreCase("Multiplicar"))
		lblResultado.setText("Resultado =" + mate.multi(num1,num2));
		else 
		lblResultado.setText("Resultado =" + mate.sub(num1,num2));
	}
}
