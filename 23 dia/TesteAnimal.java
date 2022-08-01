package desafio100Dias.dia023;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro("Toto", 3);
		Animal cavalo = new Cavalo("Campeao", 1);
		Animal preguica = new Preguica ("Giovanna", 10);
		Veterinario vet = new Veterinario();
		
		//Emitindo o som de cada animal examinado
		vet.examinar(cachorro);
		vet.examinar(cavalo);
		vet.examinar(preguica);
		
		
		//Percorrer a Jaula
		Zoologico zoo = new Zoologico();
		System.out.println("\nAnimais na jaula");
		for(int i = 0; i < 10; i++) {
			zoo.jaula[i].emitirSom();
		}
		
	}

}
