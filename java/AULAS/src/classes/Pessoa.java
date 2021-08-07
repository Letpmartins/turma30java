package classes;

public class Pessoa {
	private String nome;
	private String cpf;
	private int anoNascimento;
	private char pronome; //O,A,E
	private boolean ativo;
	
	//construtores
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, String cpf, int anoNascimento, char pronome, boolean ativo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.pronome = pronome;
		this.ativo = ativo;
	}
	
	//encapsulamento - getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public char getPronome() {
		return pronome;
	}

	public void setPronome(char pronome) {
		this.pronome = pronome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	

	
}
