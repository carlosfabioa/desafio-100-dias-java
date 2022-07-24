package desafio100Dias;

import javax.swing.JButton;
import javax.swing.JFrame;

public class dia017 extends JFrame{
	
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, proximo;
	
	public dia017() {
		//Construindo os botões
		btn1 = new JButton("1");
		btn2 = new JButton("");
		btn3 = new JButton("2");
		btn4 = new JButton("3");
		btn5 = new JButton("4");
		btn6 = new JButton("5");
		btn7 = new JButton("6");
		btn8 = new JButton("7");
		btn9 = new JButton("8");
		proximo = new JButton("proximo");
		
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
		
		setSize(200,300);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		dia017 aplicacao = new dia017();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
