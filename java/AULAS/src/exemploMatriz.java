import java.util.Scanner;

public class exemploMatriz {

	public static void main(String[] args) {
		String agenda[][] = new String[24][31];
		char op;
		int dia;
		int hora;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("Digite o dia do evento: ");
			dia = scan.nextInt()-1;
			System.out.print("Digite a hora do evento: ");
			hora = scan.nextInt();
			scan.nextLine();
			System.out.print("Digite o agendamento: ");
			agenda[hora][dia] = scan.nextLine();
			System.out.print("Continua S/N :");
			op = scan.next().toUpperCase().charAt(0);
		} while(op=='S');

		System.out.println("Mostrando a agenda.");
		for(int auxDia=0; auxDia<31; auxDia++) {
			for(int auxHora=0; auxHora<24; auxHora++) {
				if(agenda[auxHora][auxDia] != null) {
					System.out.printf("Dia - %d | Hora - %d | Evento: %s \n", auxDia, auxHora, agenda[auxHora][auxDia]);
				}
			}
		}
		
		scan.close();
	}

}
/*programa
{

	funcao inicio()
	{
		cadeia agenda[24][31] //linha- hora coluna-dia
		caracter op
		inteiro dia
		inteiro hora

		faca {
			escreva("Digite o dia do evento  : ")
			leia(dia)
			dia--
			escreva("Digite a hora do evento : ")
			leia(hora)
			escreva("Digite o agendamento    : ")
			leia(agenda[hora][dia])
			escreva("Continua S/N :")
			leia(op)

		} enquanto (op=='S' ou op=='s')
		para(inteiro l=0;l<24;l++){
			para(inteiro c=0; c<31; c++){
				se(agenda[l][c] != ""){
					escreva("Dia ",c+1," hora ",l," evento : ",agenda[l][c],"\n")	
				}

			}
		}

	}
}*/
