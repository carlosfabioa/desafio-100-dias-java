package desafio100Dias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dia018 extends JFrame{
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, proximo;
	
	public dia018() {
		//Construindo os botões
		btn1 = new JButton("1");
		btn2 = new JButton(" ");
		btn3 = new JButton("3");
		btn4 = new JButton("4");
		btn5 = new JButton("5");
		btn6 = new JButton("6");
		btn7 = new JButton("7");
		btn8 = new JButton("8");
		btn9 = new JButton("2");
		proximo = new JButton("Novo Jogo");
		
		//Posicionando os botoes
		btn1.setBounds(10,30,50,40);  
		btn2.setBounds(70,30,50,40);  
		btn3.setBounds(130,30,50,40);  
		btn4.setBounds(10,80,50,40);  
		btn5.setBounds(70,80,50,40);  
		btn6.setBounds(130,80,50,40);  
		btn7.setBounds(10,130,50,40);  
		btn8.setBounds(70,130,50,40);  
		btn9.setBounds(130,130,50,40);  
		proximo.setBounds(40,200,100,40); 
		
		//Adicionando os botões a janela
		add(btn1);add(btn2);add(btn3);add(btn4);add(btn5);add(btn6);add(btn7);add(btn8);add(btn9);add(proximo);
		
		//registra os eventos dos botões
		ManipularBotoes manipular = new ManipularBotoes();
		btn1.addActionListener(manipular);
		btn2.addActionListener(manipular);
		btn3.addActionListener(manipular);
		btn4.addActionListener(manipular);
		btn5.addActionListener(manipular);
		btn6.addActionListener(manipular);
		btn7.addActionListener(manipular);
		btn8.addActionListener(manipular);
		btn9.addActionListener(manipular);
		proximo.addActionListener(manipular);
		
		setSize(200,300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		dia018 aplicacao = new dia018();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	//classe interna privada para tratar os eventos dos botões
	private class ManipularBotoes implements ActionListener{
		public void actionPerformed(ActionEvent evento) {
			if(evento.getSource() == proximo) {
				String s=btn4.getText();  
				btn4.setText(btn9.getText());  
				btn9.setText(s);  
				s=btn1.getText();  
				btn1.setText(btn5.getText());  
				btn5.setText(s);  
				s=btn2.getText();  
				btn2.setText(btn7.getText());  
				btn7.setText(s);  
			}
			
			if(evento.getSource() == btn1) {
				String s = btn1.getText(); //pegando o texto e guardando variável s
				if(btn2.getText().equals(" ")) { //verifica se o vizinho que é o btn2 está vazio
					btn2.setText(s);
					btn1.setText(" ");
				}else if(btn4.getText().equals(" ")) {//verifica se o abaixo (btn4) está vazio
					btn4.setText(s);
					btn1.setText(" ");
				}

			}
			

			if(evento.getSource() == btn3) {
				String s = btn3.getText();
				if(btn2.getText().equals(" ")) {
					btn2.setText(s);
					btn3.setText(" ");
				}else if(btn6.getText().equals(" ")) {
					btn6.setText(s);
					btn3.setText(" ");
				}

			}
			
			if(evento.getSource() == btn2) {
				String s = btn2.getText();
				if(btn1.getText().equals(" ")) {
					btn1.setText(s);
					btn2.setText(" ");
				}else if(btn3.getText().equals(" ")) {
					btn3.setText(s);
					btn2.setText(" ");
				}else if(btn5.getText().equals(" ")) {
					btn5.setText(s);
					btn2.setText(" ");
				}
			}
			
			
			if(evento.getSource() == btn4) {
				String s = btn4.getText();
				if(btn1.getText().equals(" ")) {
					btn1.setText(s);
					btn4.setText(" ");
				}else if(btn7.getText().equals(" ")) {
					btn7.setText(s);
					btn4.setText(" ");
				}else if(btn5.getText().equals(" ")) {
					btn5.setText(s);
					btn4.setText(" ");
				}

			}
			
			if(evento.getSource() == btn5) {
				String s = btn5.getText();
				if(btn2.getText().equals(" ")) {
					btn2.setText(s);
					btn5.setText(" ");
				}else if(btn4.getText().equals(" ")) {
					btn4.setText(s);
					btn5.setText(" ");
				}else if(btn6.getText().equals(" ")) {
					btn6.setText(s);
					btn5.setText(" ");
				}else if(btn8.getText().equals(" ")) {
					btn8.setText(s);
					btn5.setText(" ");
				}

			}
			
			if(evento.getSource() == btn6) {
				String s = btn6.getText();
				if(btn9.getText().equals(" ")) {
					btn9.setText(s);
					btn6.setText(" ");
				}else if(btn3.getText().equals(" ")) {
					btn3.setText(s);
					btn6.setText(" ");
				}else if(btn5.getText().equals(" ")) {
					btn5.setText(s);
					btn6.setText(" ");
				}
			}
			if(evento.getSource() == btn7) {
				String s = btn7.getText();
				if(btn4.getText().equals(" ")) {
					btn4.setText(s);
					btn7.setText(" ");
				}else if(btn8.getText().equals(" ")) {
					btn8.setText(s);
					btn7.setText(" ");
				}
			}
			
			if(evento.getSource() == btn8) {
				String s = btn8.getText();
				if(btn7.getText().equals(" ")) {
					btn7.setText(s);
					btn8.setText(" ");
				}else if(btn9.getText().equals(" ")) {
					btn9.setText(s);
					btn8.setText(" ");
				}else if(btn5.getText().equals(" ")) {
					btn5.setText(s);
					btn8.setText(" ");
				}
			}
			
			if(evento.getSource() == btn9) {
				String s = btn9.getText();
				if(btn6.getText().equals(" ")) {
					btn6.setText(s);
					btn9.setText(" ");
				}else if(btn8.getText().equals(" ")) {
					btn8.setText(s);
					btn9.setText(" ");
				}
			}
			
			if(btn1.getText().equals("1")&& btn2.getText().equals("2") && btn3.getText()  
					.equals("3") && btn4.getText().equals("4") && btn5.getText().equals("5")  
					&& btn6.getText().equals("6") && btn7.getText().equals("7") && btn8.getText()  
					.equals("8") && btn9.getText().equals(" ")){   
					JOptionPane.showMessageDialog(dia018.this,"!!!Você ganhou!!!");  
					} 
		}
	}

}
