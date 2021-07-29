programa
/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
*/
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro LINHAS = 4
		const inteiro COLUNAS = 6

		inteiro N1[LINHAS][COLUNAS], N2[LINHAS][COLUNAS]
		inteiro M1[LINHAS][COLUNAS], M2[LINHAS][COLUNAS]
		
		//cria todas as matrizes ao mesmo tempo
		para(inteiro i=0; i<LINHAS; i++){
			para(inteiro j=0; j<COLUNAS; j++){
				escreva("Digite um valor para N1: ")
				leia(N1[i][j])
				escreva("Digite um valor para N2: ")
				leia(N2[i][j])
				limpa()
				
				M1[i][j] = N1[i][j] + N2[i][j]
				M2[i][j] = N1[i][j] - N2[i][j]
				}
			}
		//imprime N1
		escreva("N1: \n")
		para(inteiro i=0; i<LINHAS; i++){
			para(inteiro j=0; j<COLUNAS; j++){
				escreva(N1[i][j] ," ")
				}
			escreva("\n")
			}

		//imprime N2
		escreva("\nN2: \n")
		para(inteiro i=0; i<LINHAS; i++){
			para(inteiro j=0; j<COLUNAS; j++){
				escreva(N2[i][j] ," ")
				}
			escreva("\n")
			}
		//imprime M1
		escreva("\nM1: \n")
		para(inteiro i=0; i<LINHAS; i++){
			para(inteiro j=0; j<COLUNAS; j++){
				escreva(M1[i][j] ," ")
				}
			escreva("\n")
			}
			
		//imprime M2
		escreva("\nM2: \n")
		para(inteiro i=0; i<LINHAS; i++){
			para(inteiro j=0; j<COLUNAS; j++){
				escreva(M2[i][j] ," ")
				}
			escreva("\n")
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 743; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */