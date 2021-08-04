import java.util.Scanner;

public class exemploLaco1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String time1="Santos", time2="Palmeiras", time3="SPFC" , time4="Corinthians";
		int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
		char op; //G=ganhou-3, P=perdeu-0, E=empatou-1
		Scanner read = new Scanner(System.in);
		
		for(int i=1; i<=4; i++) {
			System.out.print(time1 +" G-ganhou, P-perdeu, E-empatou: ");
			op = read.next().toUpperCase().charAt(0);
			
			if(op == 'G') {
				ponto1 += 3;
			} else if(op == 'P') {
				ponto1 += 0;
			} else if(op == 'E') {
				ponto1 += 1;
			} else {
				System.out.print("ERRO!");
			}
		}
		
		for(int i=1; i<=4; i++) {
			System.out.print(time2 +" G-ganhou, P-perdeu, E-empatou: ");
			op = read.next().toUpperCase().charAt(0);
			
			if(op == 'G') {
				ponto2 += 3;
			} else if(op == 'P') {
				ponto2 += 0;
			} else if(op == 'E') {
				ponto2 += 1;
			} else {
				System.out.print("ERRO!");
			}
		}
		
		for(int i=1; i<=4; i++) {
			System.out.print(time3 +" G-ganhou, P-perdeu, E-empatou: ");
			op = read.next().toUpperCase().charAt(0);
			
			if(op == 'G') {
				ponto3 += 3;
			} else if(op == 'P') {
				ponto3 += 0;
			} else if(op == 'E') {
				ponto3 += 1;
			} else {
				System.out.print("ERRO!");
			}
		}
		
		for(int i=1; i<=4; i++) {
			System.out.print(time4 +" G-ganhou, P-perdeu, E-empatou: ");
			op = read.next().toUpperCase().charAt(0);
			
			if(op == 'G') {
				ponto4 += 3;
			} else if(op == 'P') {
				ponto4 += 0;
			} else if(op == 'E') {
				ponto4 += 1;
			} else {
				System.out.print("ERRO!");
			}
		}
		
		System.out.println("TABELA");
		System.out.printf("Time: %s - Pontos: %d.\n", time1, ponto1);
		System.out.printf("Time: %s - Pontos: %d.\n", time2, ponto2);
		System.out.printf("Time: %s - Pontos: %d.\n", time3, ponto3);
		System.out.printf("Time: %s - Pontos: %d.\n", time4, ponto4);
	}

}
