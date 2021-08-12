package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.Revista;

public class CadProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<Produto> lista = new ArrayList<>();
		
		Revista rev1 = new Revista("001", "Exame", 50.0, 10, "Abril");
		
		lista.add(new Revista("001", "Exame", 50.0, 10, "Abril"));
		
	}

}
