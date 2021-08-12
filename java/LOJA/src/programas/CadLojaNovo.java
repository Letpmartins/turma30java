package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<String> cadastro = new ArrayList<>();
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTUS");
		
		cadastro.add(1, "GUARANI");
		
		System.out.println("Tamanho da lista: "+cadastro.size());
		int x=0;
		for (String time : cadastro) {
			System.out.println(x +" - "+time.toLowerCase());
			x++;
		}
		System.out.print("\nDigite o código do time que deseja apagar: ");
		x = scan.nextInt();
		
		System.out.println("Voçê escolheu o time "+cadastro.get(x)+". Ele será apagado.");
		cadastro.remove(x);
		
		System.out.println("\nNova Lista:");
		x=0;
		for (String time : cadastro) {
			System.out.println(x +" - "+time.toLowerCase());
			x++;
		}
		
		
	}

}
