package dia020;

public class Livro {
	//criando os atributos com o modificador de acessso private
	private String titulo;
	private int qtdPaginas;
	private int paginasLidas;
	
	//criando os métodos get e set
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdPaginas() {
		return qtdPaginas;
	}
	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	public int getPaginasLidas() {
		return paginasLidas;
	}
	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}
	
	//método para calcular o progresso da leitura e mostrar o percentual lido
	public void verificarProgresso() {
		int porcentagem = paginasLidas * 100 /qtdPaginas;
		System.out.println("Você já leu " + porcentagem + " por cento do livro");
	}
	
}
