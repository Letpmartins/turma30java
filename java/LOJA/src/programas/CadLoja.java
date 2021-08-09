package programas;

import entidades.Produto;

public class CadLoja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto prod1 = new Produto("001", "Camisa");
		Produto prod2 = new Produto("002", "Calça", 100.50, 10);
		
		prod2.retiraEstoque(4);
		prod1.incluiEstoque(10);
		
		System.out.println(prod1.getEstoque());
		System.out.print(prod2.getEstoque());
	}

}
