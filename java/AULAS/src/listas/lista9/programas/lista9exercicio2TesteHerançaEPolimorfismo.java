package listas.lista9.programas;

import listas.lista9.classes.Cachorro;
import listas.lista9.classes.Cavalo;
import listas.lista9.classes.Preguica;

public class lista9exercicio2TesteHerançaEPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro animal1 = new Cachorro("Belinha", 6);
		Cavalo animal2 = new Cavalo("Pé de pano", 10);
		Preguica animal3 = new Preguica("Sid", 3);
		
		
		System.out.println("Nome: "+animal1.getNome());
		System.out.println("Idade: "+animal1.getIdade());
		animal1.emiteSom();
		animal1.seMovimenta();
		
		System.out.println();
		System.out.println("Nome: "+animal2.getNome());
		System.out.println("Idade: "+animal2.getIdade());
		animal2.emiteSom();
		animal2.seMovimenta();
		
		System.out.println();
		System.out.println("Nome: "+animal3.getNome());
		System.out.println("Idade: "+animal3.getIdade());
		animal3.emiteSom();
		animal3.seMovimenta();
		
		

	}

}
