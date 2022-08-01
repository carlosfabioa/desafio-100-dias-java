package desafio100Dias.dia024;

public class CD extends Midia{
	
	private int nMusicas;
	
	public CD(){}

	public CD(int c, double p, String n, int nMusicas) {
		super(c, p, n);
		this.nMusicas = nMusicas;
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}
	
	public String getDetalhes() {
		String detalhes = getCodigo() + "\n" +  getNome() + "\n" +  getPreco() +"\n" + getnMusicas();
		return detalhes;
	}

	
	public void setMusic(int m) {
		setnMusicas(nMusicas);
	}
	
	public void inserirDados() {
		setnMusicas(getnMusicas());
	}
	
	
	

}
