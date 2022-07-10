package desafio100Dias;
import java.util.Scanner;

public class dia003 {

	public static void main(String[] args) {
		//o objeto System.in faz a leitura do que se escreve no teclado
		Scanner entrada = new Scanner(System.in);
		// entrada indica aonde vai ser feita a entrada de dados
		
		System.out.println("Entre com o lado do hexagono: ");
		
		/*nextDouble() permite a entrada de um double. Antes de usar precisa indicar
		aonde vai ser feita a entrada
		*/
		double s = entrada.nextDouble();
		System.out.println("A área do hexagono é: " + areaHexagono(s)); //chamando o método

	}
	
	//criando o método para cálculo da área do hexágono
	public static double areaHexagono(double s) {
		return (6*(s*s))/(4*Math.tan(Math.PI/6));
	}

}
