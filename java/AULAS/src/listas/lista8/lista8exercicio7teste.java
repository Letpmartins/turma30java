package listas.lista8;

public class lista8exercicio7teste {

	public static void main(String[] args) {
		Paciente exemplo = new Paciente();
		
		exemplo.nome = "Let�cia";
		exemplo.dataConsulta = "24 de Abril";
		exemplo.nomeMedico = "Dr. doutor";

		
		System.out.println("Nome: "+exemplo.nome);
		System.out.println("Data de consulta: "+exemplo.dataConsulta);
		System.out.println("N�mero do m�dico: "+exemplo.nomeMedico);

		
		exemplo.solicitouExame();
		exemplo.prescreveuRemedio("Dipirona");

	}

}
