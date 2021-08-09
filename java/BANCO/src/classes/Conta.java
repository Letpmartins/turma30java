package classes;

public abstract class Conta {
	private int numero;
	private String nomeCliente;
	private double saldo;
	
	
	public Conta(int numero, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	/*public void setSaldo(double saldo) {
		this.saldo = saldo;
	}*/
	
	public void debito(double valor) {
		if(valor > saldo) {
			System.out.print("Impossível realizar.");
		} else this.saldo -=valor;
	}
	public void credito(double valor) {
		if(valor < 0) {
			System.out.print("Valor informado inválido.");
		}else this.saldo +=valor;
	}
}
