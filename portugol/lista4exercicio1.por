programa
/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
*/
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 5
		inteiro vetor[TAMANHO]
		inteiro maior = 0
		
		para(inteiro i=0; i<TAMANHO; i++){
			escreva("Digite um valor de pontuação: ")
			leia(vetor[i])
			
		 	se (vetor[i] > maior){
		 		maior = vetor[i]
		 		}
		 	}
		 	
		 escreva("Lista das pontuações: ")
		 para(inteiro i=0; i<TAMANHO; i++){
		 	escreva(vetor[i] ," ")
		 	}

		 escreva("\nMaior pontuação: " ,maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 575; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */