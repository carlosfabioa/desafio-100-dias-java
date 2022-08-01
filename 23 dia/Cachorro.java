package desafio100Dias.dia023;

public class Cachorro extends Animal{
	
	Cachorro(){
		
	}

	Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void emitirSom() {
		System.out.println("Au Au au");
	}
	
	void correr() {
		System.out.println("Estou correndo");
	}
	

}
