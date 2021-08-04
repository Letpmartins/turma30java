import java.util.Scanner;

public class exemploWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome="", nomeMaior="";
		double salario, maiorSalario = 0;
		Scanner read = new Scanner(System.in);
		
		
		do {
			System.out.print("digite o nome: ");
			nome = read.next();
			System.out.print("digite o salário: ");
			salario = read.nextDouble();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaior = nome;
			}
			
		} while(salario > 0);
		
		System.out.println();
		System.out.printf("O mior salario é %.2f, da pessoa %s.", maiorSalario, nomeMaior);
		read.close();
	}

}
