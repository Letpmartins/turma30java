package listas.lista8;
/*Crie uma classe funcionário e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto funcionário, defina as instancias deste objeto e apresente as informações deste objeto no console.*/

public class lista8exercicio4teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario exemplo = new Funcionario();
		
		exemplo.nome = "Letícia";
		exemplo.matricula = "XZY-01";
		exemplo.horaEntrada = 8;
		exemplo.horaSaida = 17;
		exemplo.salario = 5000;
		
		System.out.println("Nome do Funcionário: "+exemplo.nome);
		System.out.println("Matrícula do Funcionário: "+exemplo.matricula);
		System.out.println("Salário do Funcionário: "+exemplo.salario);
		System.out.println("Jornada: "+exemplo.horaEntrada+" às "+exemplo.horaSaida+".");
		
		exemplo.estaTrabalhando(14);
		exemplo.estaTrabalhando(20);
	}

}
