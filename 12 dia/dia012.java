package desafio100Dias;

import javax.swing.JOptionPane;

public class dia12 {

	public static void main(String[] args) {
	
		int num1, num2;
		
		//https://www.w3schools.com/jsref/jsref_parseint.asp
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro segundo: "));
		
		JOptionPane.showMessageDialog(null, "A soma dois dois números é: " + (num1 + num2));

		
	}

}
