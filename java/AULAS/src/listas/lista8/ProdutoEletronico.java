package listas.lista8;

public class ProdutoEletronico {
	public String nome;
	public String marca;
	public String modelo;
	public boolean status; //ligado-desligado

	public void liga() {
		this.status = true;
		System.out.println("Ligado");
	}
	
	public void desliga() {
		this.status = false;
		System.out.println("Desligado");
	}
	
	public void mostraTela() {
		if(this.status == false) {
			System.out.println("Ligue o aparelho");
		}else {
			System.out.println("Mostrando a tela");
		}
	}
	
}
