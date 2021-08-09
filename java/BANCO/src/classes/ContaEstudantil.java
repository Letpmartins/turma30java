package classes;

public class ContaEstudantil extends Conta {
	private double limiteEstudantil;

	public ContaEstudantil(int numero, String nomeCliente, double saldo, double limiteEstudantil) {
		super(numero, nomeCliente, saldo);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	public void limiteEstudantil(double valor) {
		double auxValor = 0.0;
		if(valor > (super.getSaldo() + this.limiteEstudantil)) {
			System.out.print("Impossível realizar");
		} else if (valor > super.getSaldo()) {
			auxValor = valor - super.getSaldo();
			super.credito(auxValor);
			this.limiteEstudantil -= auxValor;
			System.out.print("Novo limite estudantil: "+this.limiteEstudantil);
		}
	}
}
