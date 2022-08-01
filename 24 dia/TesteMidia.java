package desafio100Dias.dia024;

public class TesteMidia {

	public static void main(String[] args) {
		DVD dvd = new DVD(1, 1.3, "DVD1", 3 );
		DVD dvd1 = new DVD();
		CD cd = new CD(2, 2.3, "CD1", 1);
		CD cd1 = new CD();
		
		dvd1.setCodigo(2);
		dvd1.setNome("DVD2");
		dvd1.setPreco(25.4);
		dvd1.setnFaixas(1);
		
		dvd.inserirDados();	
		
		dvd.printDados();
		dvd1.printDados();
		
		cd1.setCodigo(4);
		cd1.setNome("CD2");
		cd1.setPreco(33.3);
		cd1.setnMusicas(4);
		
		cd.printDados();
		cd1.printDados();
	}

}
