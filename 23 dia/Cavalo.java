package desafio100Dias.dia023;

public class Cavalo extends Animal{
	
	Cavalo(){}

	Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void emitirSom(){
		System.out.println("iiirrrrí iiirrrrí");
	}

	void correr() {
		System.out.println("Estou correndo");
	}
}
