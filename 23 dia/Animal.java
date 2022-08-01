package desafio100Dias.dia023;

public class Animal {
	private String nome;
	private int idade;
	
	Animal(){
		
	}
	
	Animal(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	void emitirSom() {
		System.out.println("O animal emite algum som");
	}
	
	
	
}
