package desafio100Dias.dia021;

public class Fatura {
	//atributos da fatura
	private int numeroItemFaturado;
	private String descricaoItem;
	private int qtdeCompradaItem;
	private double precoUnitarioItem;
	
	//construtor que inicializa os 4 valores
	public Fatura(int numeroItemFaturado, String descricaoItem, int qtdeCompradaItem, double precoUnitarioItem) {
		this.numeroItemFaturado = numeroItemFaturado;
		this.descricaoItem = descricaoItem;
		if(qtdeCompradaItem < 0) { //verifica se quantidade não é positiva
			this.qtdeCompradaItem = 0; //configura valor como 0
			}else {
				this.qtdeCompradaItem = qtdeCompradaItem;
			}
		if(precoUnitarioItem < 0) { //verifica se o preço unitário não é positivo
			this.precoUnitarioItem = 0.0; //configura o valor como 0
		}else {
			this.precoUnitarioItem = precoUnitarioItem;
		}
		
	}
	
	//métodos get e set
	public int getNumeroItemFaturado() {
		return numeroItemFaturado;
	}
	public void setNumeroItemFaturado(int numeroItemFaturado) {
		this.numeroItemFaturado = numeroItemFaturado;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public int getQtdeCompradaItem() {
		return qtdeCompradaItem;
	}
	public void setQtdeCompradaItem(int qtdeCompradaItem) {
		this.qtdeCompradaItem = qtdeCompradaItem;
	}
	public double getPrecoUnitarioItem() {
		return precoUnitarioItem;
	}
	public void setPrecoUnitarioItem(double precoUnitarioItem) {
		this.precoUnitarioItem = precoUnitarioItem;
	}
	
	//método que calcula o valor da fatura
	double calcularValorFatura(int qtdeCompradaItem, double precoUnitarioItem){
		double valorFatura = qtdeCompradaItem * precoUnitarioItem;
		return valorFatura;
	}
}
