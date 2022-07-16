package desafio100Dias;

import java.util.Scanner;

public class dia007 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com a taxa de juros: ");
		double taxa_juros = entrada.nextDouble();
		taxa_juros = taxa_juros /100; //convertendo para percentual
		System.out.println(juros(taxa_juros));

	}
	
	//função para cálculo de juros
	public static double juros(double taxa) {
		int contador = 0; //para controlar quantas vezes executa o while
		int investimento = 100; //corresponde a 100% do investimento
		while(investimento < 200) { //200 corresponde a 200% do valor do investimento
			contador +=1; //incrementando um ao contador
			investimento += investimento * taxa; //somando o percentual + a taxa
		}
		return contador;
	}

}
