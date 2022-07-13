package desafio100Dias;

import java.util.Scanner;

public class dia006 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a tabuada: ");
		int tabuada = entrada.nextInt();
		
		System.out.println("Qual valor inicial da tabuada: ");
		int inicial = entrada.nextInt();
		
		System.out.println("Qual o valor final da tabuada: ");
		int ultimo = entrada.nextInt();
		
		//Processamento
		System.out.printf("Tabuada do %d\n", tabuada);
		for(int i = inicial; i <= ultimo; i++ ) {
			System.out.printf("%d X %d = %d\n", tabuada, i, tabuada*i);
		}
		

	}

}
