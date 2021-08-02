import java.util.Locale;
import java.util.Scanner;

public class Farenheit {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); /*Essa linha define o padrão de leitura numérica pra ponto.*/
		String nome;
		double celsius;			/*Double aceita vírgula*/
		double farenheit;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite a temperatura em celsius: ");
		celsius = leia.nextDouble();
		
		farenheit = (celsius*1.8) + 32;
		
		System.out.print("Olá, "+nome+". A temperatura é "+farenheit+" graus Farenheit.");
		leia.close();	/*não é obrigatório, mas tira o warning do leia.*/
	}
}
