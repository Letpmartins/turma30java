programa
/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
*/
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro RODADAS = 10
		inteiro vetor[RODADAS]
		inteiro contador = 0
		inteiro media
		inteiro totalLances = 0
		inteiro maior = 0

		 para(inteiro i=0; i<RODADAS; i++){
		 	vetor[i] = Util.sorteia(1, 6)
		 	escreva(vetor[i] ," ")
		 	se (vetor[i] > maior){
		 		maior = vetor[i]
		 		}
		 	}
		 escreva("\nMaior valor: " ,maior)
		 
		 para(inteiro i=0; i<RODADAS; i++){
		 	 totalLances += vetor[i]
		 	 se (vetor[i] == maior){
		 	 	contador++
		 	 	}
		 	}
		 media = totalLances/RODADAS

		 escreva("\nMédia dos lançamentos: " ,media)
		 escreva("\nNúmero de ocorrências do maior lançamento: " ,contador)

		 		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */