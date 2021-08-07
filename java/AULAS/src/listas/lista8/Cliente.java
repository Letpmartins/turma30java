package listas.lista8;
/*Lista 8 - Exercício 1*/

public class Cliente {
	public String nome;
	public int anoNascimento;
	public boolean temCartao;
	
	public void mostraCarrinho() {
		System.out.print("Essas são as suas compras.");
	}
	
	public void descontoIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		
		System.out.printf("Pela nossa promoção, você tem %d porcento de desconto!", idade);
	}
	
}
