programa				//exercicio4
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro A, B, C
		inteiro R, S
		inteiro d

		escreva("Digite A: ")
		leia(A)
		escreva("Digite B: ")
		leia(B)
		escreva("Digite C: ")
		leia(C)

		R= mat.potencia((A+B), 2)
		S = mat.potencia((B+C), 2)

		d = (R + S)/2

		escreva(d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */