package listas.lista8;

public class Paciente {
	public String nome;
	public String dataConsulta;
	public String nomeMedico;

	public void solicitouExame() {
		System.out.println(this.nomeMedico+" solicitou um exame.");
	}
	
	public void prescreveuRemedio(String nomeRemedio){
		System.out.println(this.nomeMedico+" prescreveu "+nomeRemedio+".");
	}
}
