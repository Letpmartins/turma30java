package listas.lista8;
/*Lista 8 - Exercício 2*/

public class Aviao {
	public String modelo;
	public int numeroAssentos;
	public boolean statusMotor; //ligado: true - desligado: flase
	public int velocidade;
	public int altitude;
	
	public void ligaMotor() {
		this.statusMotor = true;
	}
	
	public void desligaMotor() {
		this.statusMotor = false;
	}
	
	public void decolar(int velocidade) {
		if(this.statusMotor == true) {
			this.velocidade = velocidade;
			
			if(this.velocidade < 200) {
				System.out.println("Velocidade muito baixa, acelere.");
			} else {
				System.out.println("Decolando.");
				}
			
		} else {
			System.out.println("Primeiro, ligue o motor");
		}
		
	}
	
	public void viajandoEmCruzeiro(int velocidade, int altitude) {
		this.velocidade = velocidade;
		this.altitude = altitude;
		
		if(this.velocidade < 800 || this.altitude < 9100) {
			System.out.println("Ainda não estamos em voo de cruzeiro.");
		} else {
			System.out.println("Viajando em cruzeiro");
		}
	}
	
	public void pousar(int velocidade) {
		this.velocidade = velocidade;
		if(this.velocidade > 270){
			System.out.println("Velocidade alta demais, desacelere.");
		} else {
			System.out.println("Pousando.");
		}
	}
		
	
	
}
