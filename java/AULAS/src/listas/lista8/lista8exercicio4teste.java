package listas.lista8;
/*Crie uma classe funcion�rio e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto funcion�rio, defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class lista8exercicio4teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario exemplo = new Funcionario();
		
		exemplo.nome = "Let�cia";
		exemplo.matricula = "XZY-01";
		exemplo.horaEntrada = 8;
		exemplo.horaSaida = 17;
		exemplo.salario = 5000;
		
		System.out.println("Nome do Funcion�rio: "+exemplo.nome);
		System.out.println("Matr�cula do Funcion�rio: "+exemplo.matricula);
		System.out.println("Sal�rio do Funcion�rio: "+exemplo.salario);
		System.out.println("Jornada: "+exemplo.horaEntrada+" �s "+exemplo.horaSaida+".");
		
		exemplo.estaTrabalhando(14);
		exemplo.estaTrabalhando(20);
	}

}
