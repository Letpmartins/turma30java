package listas.lista9.classes;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void emiteSom() {
		System.out.print("Relinchando.\n");
	}
	
	@Override
	public void seMovimenta() {
		System.out.print("Correndo.\n");
	}
}
