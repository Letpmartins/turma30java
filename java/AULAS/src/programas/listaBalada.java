package programas;

import classes.Pessoa;

public class listaBalada {

	public static void main(String[] args) {
		Pessoa primeiroFila = new Pessoa("Letícia");
		
		System.out.print(primeiroFila.getNome());
		primeiroFila.setCpf("111.222.333-44");
		System.out.print("\n"+primeiroFila.getCpf());
		
	}

}
