import java.util.Scanner;

public class exemploVetor {

	public static void main(String[] args) {
		
		String nomesTimes[] = {"Santos     ","Palmeiras","SPFC     ","Corinthians"};
		int pontosTimes[] = {0,0,0,0};
		String codTimes[] = new String[4];
		char op;
		String aux;
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<codTimes.length;i++) {
			codTimes[i]="CPF-0"+(i+1);
		}
		
		System.out.println("INÍCIO DA TABELA");
		System.out.println("COD\tTIME    \tPONTOS");
		for(int x=0; x<codTimes.length;x++) {
			System.out.printf("%s\t%s\t%d\n", codTimes[x], nomesTimes[x], pontosTimes[x]);
		}
		System.out.println();
		
		//laço que indica a rodada:
		for(int y=1; y<=3; y++) {
			System.out.println();
			System.out.println("RODADA "+y);
			//laço que lê os pontos
			for(int z=0; z<nomesTimes.length; z++) {
				System.out.print(nomesTimes[z] + " G-ganhou, P-perdeu, E-empatou: ");
				op = scan.next().toUpperCase().charAt(0);
				if(op == 'G') {
					pontosTimes[z] += 3;
				} else if(op == 'P') {
					pontosTimes[z] += 0;
				} else if(op == 'E') {
					pontosTimes[z] += 1;
				} else {
					System.out.print("ERRO!");
				}
			}
			
			//saída da tabela
			System.out.println();
			System.out.println("COD\tTIME    \tPONTOS");
			for(int x=0; x<codTimes.length;x++) {
				System.out.printf("%s\t%s\t%d\n", codTimes[x], nomesTimes[x], pontosTimes[x]);
			}
		}
		
		//seleciona um código
		System.out.println();
		System.out.print("Digite o código do time que deseja selecionar: ");
		aux = scan.next();
		System.out.println("COD\tTIME    \tPONTOS");
		for(int x=0; x<codTimes.length;x++) {
			if(aux.equalsIgnoreCase(codTimes[x])) {
				System.out.printf("%s\t%s\t%d\n", codTimes[x], nomesTimes[x], pontosTimes[x]);
			}
		}
		

		scan.close();
	}

}
