package listas.lista8;
/*Crie uma classe conta bancaria e apresente os atributos e m�todos referentes esta classe, 
 * em seguida crie um objeto conta bancaria, defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class lista8exercicio6teste {

	public static void main(String[] args) {
		ContaBancaria exemplo = new ContaBancaria();
		
		exemplo.nome = "Let�cia";
		exemplo.cpf = "111.222.333-44";
		exemplo.numeroCartao = "12348765-99";
		exemplo.saldo = 5000.00;
		
		
		System.out.println("Nome: "+exemplo.nome);
		System.out.println("CPF: "+exemplo.cpf);
		System.out.println("N�mero do Cart�o: "+exemplo.numeroCartao);
		System.out.println("Saldo: "+exemplo.saldo);
		
		exemplo.saque(30000);
		System.out.println("Voc� solicitou um saque. Saldo atual: "+exemplo.saque(300)+" reais.");
		System.out.println("Voc� fez um dep�sito. Saldo atual: "+exemplo.deposito(300)+" reais.");

	}

}
