package listas.lista9.classes;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void emiteSom() {
		System.out.print("Au Au Au.\n");
	}
	
	@Override
	public void seMovimenta() {
		System.out.print("Correndo.\n");
	}
}
