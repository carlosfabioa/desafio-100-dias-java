package desafio100Dias.dia024;

public class Midia {
	private int codigo;
	private double preco;
	private String nome;
	
	
	public Midia(){}
	
	Midia(int c, double p, String n){
		this.codigo = c;
		this.preco = p;
		this.nome = n;
	}
	

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		String nome = getClass().toString();
		return nome;
	}
	
	public String getDetalhes() {
		String detalhes = getCodigo() + "\n" +  getNome() + "\n" +  getPreco();
		return detalhes;
	}

	public void printDados() {
		System.out.println(getTipo() + getDetalhes());
	}
	
	public void inserirDados() {
		setNome(nome);
		setCodigo(codigo);
		setPreco(preco);
	}
	
	

}
