package listas.lista8;
/*Lista 8 - Exerc�cio 1*/

public class Cliente {
	public String nome;
	public int anoNascimento;
	public boolean temCartao;
	
	public void mostraCarrinho() {
		System.out.print("Essas s�o as suas compras.");
	}
	
	public void descontoIdade(int anoAtual) {
		int idade = anoAtual - anoNascimento;
		
		System.out.printf("Pela nossa promo��o, voc� tem %d porcento de desconto!", idade);
	}
	
}
