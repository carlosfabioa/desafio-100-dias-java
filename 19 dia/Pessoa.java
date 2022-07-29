package dia019;

public class Pessoa {
	int idade;
	int diaNascimento;
	int mesNascimento;
	int anoNascimento;
	String nome;

	
	//função para calcular a idade
	int calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		idade = anoAtual - anoNascimento ;
		if(diaAtual < diaNascimento && mesAtual == mesNascimento) { //verificando se já chegou o mês de aniversário
			return idade -1;
		}else {
			return idade;
		}
	}
	
	//mostra a idade
	void informaIdade(int idade) {
		System.out.println(idade);
	}
	
	//recebe o nome e imprime 
	void informaNome(String nome) {
		System.out.println(nome);
	}
	
	//recebe dia, mes e ano como parâmetros e preenche nos atributos correspondentes
	void ajustaDataDeNascimento(int diaNascimento, int mesNascimento, int anoNascimento) {
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}
}