package listas.lista8;
/*Crie uma classe patinete e apresente os atributos e m�todos referentes esta classe, em seguida crie um objeto patinete, 
 * defina as instancias deste objeto e apresente as informa��es deste objeto no console.*/

public class lista8exercicio5teste {

	public static void main(String[] args) {
		
		Patinete exemplo = new Patinete();
		
		exemplo.marca = "Town";
		exemplo.modelo = "X7L";
		exemplo.eEletrico = true;
		
		System.out.println("Marca: "+exemplo.marca);
		System.out.println("Modelo: "+exemplo.modelo);
		System.out.printf("� el�trico: %s \n",((exemplo.eEletrico == true)?"Sim":"N�o"));

		exemplo.anda();
		exemplo.fazManobra();
	}

}
