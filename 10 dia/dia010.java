package desafio100Dias;
import java.util.Random;

public class dia010 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int [] posicao = new int[7];
		
		for(int i = 1; i <= 100 ; i++) {
			int sorteio = aleatorio.nextInt(6) + 1;
			for(int j = 1; j <= 6; j++) {
				if(sorteio == j) {
					posicao[j]  += 1;
				}
			}
		}
		
		for(int i = 1; i <= 6; i++) {
			System.out.println(posicao[i]);
			
		}
		
	}

}
