package classes;

public class ContaPoupanca extends Conta{
	private int diaAniversario;

	public ContaPoupanca(int numero, String nomeCliente, double saldo, int diaAniversario) {
		super(numero, nomeCliente, saldo);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void diaAniversarioPoupanca(int dia) {
		if(dia == 0 || dia > 31) {
			System.out.print("Data inválida. Tente novamente");
		}else if(dia == diaAniversario) {
			super.credito(super.getSaldo()*0.005);
		}
	}
}
