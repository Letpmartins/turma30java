package listas.lista9.programas;

/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List do Java 
 * para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
*/


import java.util.ArrayList;
import java.util.List;
import listas.lista9.classes.Estoque;

public class lista9exercicio3Collections {

	public static void main(String[] args) {
		List<Estoque> lista = new ArrayList<>();
		
		lista.add(new Estoque("001", "Camisa", 100));
		lista.add(new Estoque("002", "Calça", 100));
		lista.add(new Estoque("003", "Vestido", 100));
		lista.add(new Estoque("004", "Saia", 100));
		lista.add(new Estoque("005", "Lenço", 100));
		
		System.out.print("Inventário inicial: \n");
		for(Estoque item : lista) {
			System.out.printf("Código: %s - Item: %s - Qntd em Estoque: %d\n", item.getCodigoProduto(), item.getNomeProduto(), item.getQntdEstoque());
		}
		
		lista.remove(3);
		
		System.out.print("\nInventário com um item removido: \n");
		for(Estoque item : lista) {
			System.out.printf("Código: %s - Item: %s - Qntd em Estoque: %d\n", item.getCodigoProduto(), item.getNomeProduto(), item.getQntdEstoque());
		}
		
		lista.get(0).setQntdEstoque(50);
		lista.get(3).setQntdEstoque(70);
		
		System.out.print("\nInventário com o estoque atualizado: \n");
		for(Estoque item : lista) {
			System.out.printf("Código: %s - Item: %s - Qntd em Estoque: %d\n", item.getCodigoProduto(), item.getNomeProduto(), item.getQntdEstoque());
		}
	}

}
