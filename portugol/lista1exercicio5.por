programa
{
	
	funcao inicio()
	{
		real nota1
		real nota2
		real nota3
		real mediaPonderada

		escreva("Digite as três notas do aluno, separadas por 'ENTER': ")
		leia(nota1, nota2, nota3)

		mediaPonderada = ((nota1*2) + (nota2*3) + (nota3*5))/(2 + 3 + 5)

		escreva("A média ponderada do alune é: " ,mediaPonderada)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 334; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */