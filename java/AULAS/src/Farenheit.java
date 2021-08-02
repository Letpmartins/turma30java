import java.util.Locale;
import java.util.Scanner;

public class Farenheit {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US); /*Essa linha define o padr�o de leitura num�rica pra ponto.*/
		String nome;
		double celsius;			/*Double aceita v�rgula*/
		double farenheit;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
		System.out.print("Digite a temperatura em celsius: ");
		celsius = leia.nextDouble();
		
		farenheit = (celsius*1.8) + 32;
		
		System.out.print("Ol�, "+nome+". A temperatura � "+farenheit+" graus Farenheit.");
		leia.close();	/*n�o � obrigat�rio, mas tira o warning do leia.*/
	}
}
