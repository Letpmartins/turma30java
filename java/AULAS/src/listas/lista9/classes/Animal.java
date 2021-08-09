package listas.lista9.classes;

public class Animal {
	private String nome;
	private String idade;
	private boolean emiteSom;
	
	public Animal(String nome, String idade, boolean emiteSom) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.emiteSom = emiteSom;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public boolean isEmiteSom() {
		return emiteSom;
	}
	public void setEmiteSom(boolean emiteSom) {
		this.emiteSom = emiteSom;
	}
	
	
}
