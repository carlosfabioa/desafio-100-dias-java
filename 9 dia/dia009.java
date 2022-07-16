package desafio100Dias;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class dia009 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		ArrayList linhas = new ArrayList();
		double soma = 0;
		Iterator l, d; //criando dois iterator para iterar sobre linhas e disciplinas
		
		
		char continuar = 's';
		
		while(continuar == 's') {
			ArrayList disciplinas = new ArrayList();
			System.out.println("Entre com a disciplina: ");
			disciplinas.add(entrada.next());
			for(int i =0 ; i < 4; i++) {
				System.out.printf("Entre com a %dª nota: ", i+1);
				double valor = entrada.nextInt();
				soma += valor;
				disciplinas.add(valor);
			}
			
			
			double media = 0; 
			media= soma / 4; //calculando a media 
			disciplinas.add(media); //adicionando a media a linha da disciplina
			linhas.add(disciplinas);
			
			System.out.println("Deseja adicionar outra disciplina: s-sim | n-não");
			continuar = entrada.next().charAt(0);
		}
		
	//usei de propósito (https://www.w3schools.com/java/java_iterator.asp )
		l = linhas.iterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		
		entrada.close();

	}
	
	
	

}
