package listas.lista8;

public class ContaBancaria {
	public String nome;
	public String cpf;
	public String numeroCartao;
	public double saldo;
	
	public void pedirEmprestimo(double valor) {
		System.out.println("Você pediu um empréstimo de "+valor+" reais.");
	}
	
	public double saque(double valor) {
		if(this.saldo <= 0 || this.saldo < valor) {
			System.out.println("Saldo insuficiente."); //isso pode (E provavelmente vai) complicar, vou pensar melhor.
		} else {
			this.saldo -=valor;
		}
		return this.saldo;
	}
	
	public double deposito(double valor) {
		this.saldo +=valor;
		return this.saldo;
	}
}
