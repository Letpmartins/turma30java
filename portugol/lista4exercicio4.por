programa
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
{
	
	funcao inicio()
	{
		const inteiro TAMANHO = 3
		inteiro matriz[TAMANHO][TAMANHO]
		inteiro somaTotal = 0
		inteiro somaDiagonal = 0
		

		para(inteiro i=0; i<TAMANHO; i++){
			para(inteiro j=0; j<TAMANHO; j++){
				escreva("Digite um número :")
				leia(matriz[i][j])

				somaTotal += matriz[i][j] 

				se (i == j){
					somaDiagonal += matriz[i][j]
					}
				}
			}
			
		para(inteiro i=0; i<TAMANHO; i++){
			para(inteiro j=0; j<TAMANHO; j++){
				escreva(matriz[i][j] ," ")
			}
			escreva("\n")
		}
		
		escreva("Soma dos valores: " ,somaTotal)
		escreva("\n1Soma dos valores da diagonal principal: " ,somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 841; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {matriz, 11, 10, 6}-{somaTotal, 12, 10, 9}-{somaDiagonal, 13, 10, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */