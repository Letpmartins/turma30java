package listas.lista8;
/*Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
public class lista8exercicio2teste {

	public static void main(String[] args) {
		Aviao exemplo = new Aviao();
		exemplo.modelo = "Boeing";
		exemplo.numeroAssentos = 600;
		
		System.out.println(exemplo.modelo);
		System.out.println(exemplo.numeroAssentos);
		exemplo.decolar(190);
		exemplo.ligaMotor();
		System.out.println(exemplo.statusMotor);
		exemplo.decolar(190);
		exemplo.decolar(210);
		exemplo.viajandoEmCruzeiro(800, 100);
		exemplo.viajandoEmCruzeiro(850, 9500);
		exemplo.pousar(300);
		exemplo.pousar(260);
		exemplo.desligaMotor();
		System.out.println(exemplo.statusMotor);

	}

}
