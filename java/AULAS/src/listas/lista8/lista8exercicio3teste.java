package listas.lista8;
/*Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto produto eletr�nico, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

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
