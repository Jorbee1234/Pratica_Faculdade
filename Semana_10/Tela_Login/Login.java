package Tela_Login;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private JFrame janela;
    private JPanel painel;

    private JLabel lblUsuario;
    private JLabel lblSenha;
    private JLabel lblResultado;

    private JTextField txtUsuario;

    private JPasswordField txtSenha;

    private JButton btLogin;


    public Login(){

        janela = new JFrame();

        painel = new JPanel();
        janela.add(painel);
        painel.setLayout(null);

        lblUsuario = new JLabel("Usuário");
        lblUsuario.setBounds(10, 20, 80, 25);
        painel.add(lblUsuario);

        lblSenha = new JLabel("Senha");
        lblSenha.setBounds(10, 50, 80, 25);
        painel.add(lblSenha);
        
        lblResultado = new JLabel("");
        lblResultado.setBounds(10, 110, 300, 25);
        painel.add(lblResultado);
        
        txtUsuario = new JTextField(20);
        txtUsuario.setBounds(100, 20, 165, 25);
        painel.add(txtUsuario);

        txtSenha = new JPasswordField();
        txtSenha.setBounds(100, 50, 165, 25);
        painel.add(txtSenha);

        btLogin = new JButton("Login");
        btLogin.setBounds(10, 80, 80, 25);
        btLogin.addActionListener(this);
        painel.add(btLogin);

        janela.setSize(350, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Login");
        janela.setVisible(true);
    }

    public static void main(String[] args){
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           String usuario = txtUsuario.getText();  
           String senha = new String(txtSenha.getPassword());

           System.out.println(usuario + ", " + senha);

           if(usuario.equals("jorbe") && senha.equals("1234")){
               new Welcome();
           }
           else {
               lblResultado.setText("SENHA INCORRETA, TENTE NOVAMENTE!");
           }
    }
}
