package desafio100Dias.dia024;

public class DVD extends Midia{
	
	private int nFaixas;

	public DVD(){}

	public DVD(int c, double p, String n, int f) {
		super(c, p, n);
		this.nFaixas = f;
	}
		
	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}

	
	public void setFaixas(int f) {
		setnFaixas(f);
	}
	
	public String getDetalhes() {
		String detalhes = getCodigo() + "\n" +  getNome() + "\n" +  getPreco() +"\n" + getnFaixas();
		return detalhes;
	}
	
	public void inserirDados() {
		setFaixas(getnFaixas());
	}


 
}
