package listas.lista9.classes;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emiteSom() {
		System.out.print("Awnn.\n");
	}
	
	@Override
	public void seMovimenta() {
		System.out.print("Subindo em árvore.\n");
	}
}
