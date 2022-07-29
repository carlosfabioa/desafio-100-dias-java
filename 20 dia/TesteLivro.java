package dia020;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livroFavorito = new Livro(); //criando um objeto livroFavorito
		
		livroFavorito.setTitulo("Pequeno Príncipe"); //alterando o título
		livroFavorito.setQtdPaginas(98); // alterando a quantidade de páginas
		
		System.out.println("O livro " + livroFavorito.getTitulo() + " possui " + livroFavorito.getQtdPaginas() + " páginas.");
		
		//depois de ler 20 páginas
		livroFavorito.setPaginasLidas(20);
		livroFavorito.verificarProgresso();

		//depois de ler 50 páginas
		livroFavorito.setPaginasLidas(50);
		livroFavorito.verificarProgresso();
	}

}
