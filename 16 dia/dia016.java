package desafio100Dias;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class dia016 implements ActionListener{
	JTextField tf1, tf2, tf3;
	JLabel lb1, lb2, lb3;
	JButton bt1, bt2;

	dia016(){
		JFrame f = new JFrame("Calculadora simples");
		
		tf1 = new JTextField();
		tf1.setBounds(150,50, 150,20);
		
		tf2 = new JTextField();
		tf2.setBounds(150,80, 150,20);
		
		tf3 = new JTextField();
		tf3.setEditable(false);
		tf3.setBounds(150,110, 150,20);
		
		lb1 = new JLabel("Primeiro número: ");
		lb1.setBounds(30, 50, 150,20);
		
		lb2 = new JLabel("Segundo número: ");
		lb2.setBounds(30,80, 150,20);
		
		lb3 = new JLabel("Resultado: ");
		lb3.setBounds(30, 110, 150, 20);
		
		
		bt1 = new JButton("+");
		bt1.setBounds(150, 160, 50, 50);
		
		bt2 = new JButton("-");
		bt2.setBounds(240, 160, 50, 50);
		
		f.add(tf1);
		f.add(lb1);
		f.add(tf2);
		f.add(tf3);
		f.add(lb2);
		f.add(lb3);
		f.add(bt1);
		f.add(bt2);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		new dia016();
	}
		
	
	public void actionPerformed(ActionEvent evento) {
		String texto1 = tf1.getText(); //pega o texto do JTextField e adiciona na variável
		String texto2 = tf2.getText();
		
		int num1 = Integer.parseInt(texto1); //converte o texto em inteiro
		int num2 = Integer.parseInt(texto2);
		int resultado = 0;
		
		if(evento.getSource() == bt1) {
			resultado = num1 + num2;
		}
		else if(evento.getSource() == bt2) {
			resultado = num1 - num2;
		}
		
		String mostrar = String.valueOf(resultado); //converte resultado para texto
		tf3.setText(mostrar); //adiciona o resultado no JTextField
	}


}
