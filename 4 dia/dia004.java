package desafio100Dias;
import java.util.Scanner;

public class dia004 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		//Entrada números e da operação matemática
		System.out.println("Entre com o primeiro número: ");
		double num1 = ler.nextDouble();
		System.out.println("Entre com o segundo número: ");
		double num2 = ler.nextDouble();
		System.out.println("Entre com a operação a ser executada: ");
		String operacao = ler.next();
		
		//Processamento
		double resultado = "+".equals(operacao) ? num1 + num2 : 0; //se falso retorna 0
		resultado = "-".equals(operacao) ? num1 - num2: resultado; 
		//se for falso retorna o valor da variável, que é foi feito na operação de adição
		resultado = "*".equals(operacao) ? num1 * num2: resultado; 
		resultado = "/".equals(operacao) ? num1 / num2: resultado; 
		resultado = "%".equals(operacao) ? num1 % num2: resultado; 
		/*
		 * PARA ENTENDER O MÉTODO EQUALS: https://www.w3schools.com/java/ref_string_equals.asp
		 * PARA ENTENDER O OPERADOR TERNÁRIO: https://www.w3schools.com/java/java_conditions_shorthand.asp
		 * */
		
		//Saida do resultado
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado); 
		//observe que estou usando printf e não println
		
		ler.close(); //para fechar o Scanner

	}
}
