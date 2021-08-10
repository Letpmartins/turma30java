package entities;

public class Cachorro extends Pet {
	private boolean latidoAlto;

	public Cachorro(String raca, boolean latidoAlto) {
		super(raca);
		this.latidoAlto = latidoAlto;
	}

	public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {
		super(raca, anoNascimento);
		this.latidoAlto = latidoAlto;
	}

	public boolean isLatidoAlto() {
		return latidoAlto;
	}

	public void setLatidoAlto(boolean latidoAlto) {
		this.latidoAlto = latidoAlto;
	}
	
	@Override
	public void emiteSom() {
		if(latidoAlto == true) {
			System.out.print("AU AU AU AU AU");
		} else {
			System.out.print("Au au au au au");
		}
	}
	
	
	
}
