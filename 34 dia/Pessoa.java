package desafio100Dias.dia34;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Pessoa {

	JTextField tfId, tfNome, tfEmail;
	JLabel lbId, lbNome, lbEmail;
	JButton btInserir, btExcluir;
	
	Pessoa(){
		JFrame f = new JFrame("Cadastro");
		
		lbId = new JLabel("ID: ");
		lbId.setBounds(30, 50, 150,20);
		
		tfId = new JTextField();
		tfId.setBounds(100,50, 80,20);
		
		lbNome = new JLabel("Nome: ");
		lbNome.setBounds(30,80, 150,20);
	
		tfNome = new JTextField();
		tfNome.setBounds(100,80, 200,20);
		
		lbEmail = new JLabel("E-mail: ");
		lbEmail.setBounds(30, 110, 150, 20);
		
		tfEmail = new JTextField();
		tfEmail.setBounds(100,110, 200,20);
		
		btInserir = new JButton("Inserir");
		btInserir.setBounds(100, 160, 80, 30);
		
		btExcluir = new JButton("Excluir");
		btExcluir.setBounds(200, 160, 80, 30);
		
		f.add(lbId);
		f.add(tfId);
		f.add(tfNome);
		f.add(lbNome);
		f.add(lbEmail);
		f.add(tfEmail);
		f.add(btInserir);
		f.add(btExcluir);
		
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
		
		
	}
	
}
