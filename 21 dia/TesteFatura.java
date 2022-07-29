package desafio100Dias.dia021;

public class TesteFatura {

	public static void main(String[] args) {
		Fatura fatura = new Fatura(10, "computador", 10, 10); //instanciando uma nova fatura e inicializando os valores
		
		
		//calculando a fatura
		double valor = fatura.calcularValorFatura(fatura.getQtdeCompradaItem(), fatura.getPrecoUnitarioItem());
		System.out.println(valor);
	}

}
