package programas;

import classes.Funcionario;
import classes.Terceiro;

public class testeFuncionarioPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Terceiro func1 = new Terceiro("000", 10, 20.0, 50.00);
		Funcionario func2 = new Funcionario("001", 10, 20.0);
		
		System.out.printf("Matrícula: %s - Salário: %.2f. \n", func1.getMatricula(), func1.salario());
		System.out.printf("Matrícula: %s - Salário: %.2f. \n", func2.getMatricula(), func2.salario());
	}

}
