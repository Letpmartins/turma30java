package listas.lista8;

public class Funcionario {
	public String nome;
	public String matricula;
	public int horaEntrada;
	public int horaSaida;
	public double salario;
	
	public void estaTrabalhando(int horaDoDia) {
		if(this.horaEntrada < horaDoDia && this.horaSaida > horaDoDia) {
			System.out.println("Est� Trabalhando.");
		} else {
			System.out.println("N�o est� trabalhando.");
		}
	}
}
