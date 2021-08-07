package listas.lista8;
/*Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto cliente, 
 * defina as instancias deste objeto e apresente as informações deste objeto no console.
 */


public class lista8exercicio1teste {
	
	public static void main(String[] args) {
		
		Cliente exemplo = new Cliente() ;
		exemplo.nome = "Letícia";
		exemplo.anoNascimento = 1993;
		exemplo.temCartao = false;
		
		System.out.println(exemplo.nome);
		System.out.println(exemplo.anoNascimento);
		
		if(exemplo.temCartao == true) {
			exemplo.descontoIdade(2021);
		} else {
			System.out.println("Gostaria de ter o nosso cartão?");
		}
		
		System.out.println();
		exemplo.mostraCarrinho();
		
		
		
		
	}
}
