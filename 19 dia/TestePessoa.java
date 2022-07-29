package dia019;

import java.util.Calendar;

public class TestePessoa {
	public static void main(String[] args) {
		//pegando a data atual
		Calendar data = Calendar.getInstance();
		int diaAtual = data.get(Calendar.DATE);
		int mesAtual = data.get(Calendar.MONTH) + 1;
		int anoAtual = data.get(Calendar.YEAR);
		
		
		Pessoa pessoa1 = new Pessoa(); //instância a pessoa1
		Pessoa pessoa2 = new Pessoa(); //instância a pessoa2
		
		//objeto que representa o Albert Einstein
		pessoa1.informaNome("Albert Einstein");
		pessoa1.ajustaDataDeNascimento(14,3,1879);	
		pessoa1.informaIdade(pessoa1.calculaIdade(diaAtual, mesAtual, anoAtual));

		//Objeto que representa Issac Newton
		pessoa2.informaNome("Isaac Newton");
		pessoa2.ajustaDataDeNascimento(4, 1, 1643);
		pessoa2.informaIdade(pessoa2.calculaIdade(diaAtual, mesAtual, anoAtual));
		
		
	}

}
