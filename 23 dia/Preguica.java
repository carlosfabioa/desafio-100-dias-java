package desafio100Dias.dia023;

public class Preguica extends Animal{
	
	Preguica(){}

	Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void emitirSom() {
		System.out.println("Aaaa Aaaaa");
	}

	void subirArvore() {
		System.out.println("Estou subindo na arvore");
		
	}
}
