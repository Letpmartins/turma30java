package listas.lista8;
/*Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto produto eletrônico, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class lista8exercicio3teste {

	public static void main(String[] args) {
		
		ProdutoEletronico exemplo = new ProdutoEletronico();
		
		exemplo.nome = "celular";
		exemplo.marca = "Mi";
		exemplo.modelo = "Note 7";
		
		System.out.println(exemplo.nome);
		System.out.println(exemplo.marca);
		System.out.println(exemplo.modelo);
		
		exemplo.mostraTela();
		exemplo.liga();
		exemplo.mostraTela();
		exemplo.desliga();
		
	}

}
