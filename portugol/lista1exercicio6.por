programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real x1, y1, x2, y2, d
		real radicandoX, radicandoY

		escreva("Digite as coordenadas do ponto 1 (dê ENTER a cada entrada): ")
		leia(x1, y1)
		escreva("Digite as coordenadas do ponto 2 (dê ENTER a cada entrada): ")
		leia(x2, y2)

		radicandoX = mat.potencia((x2 - x1), 2)
		radicandoY = mat.potencia((y2 - y1), 2)

		d = mat.raiz((radicandoX + radicandoY), 2)

		escreva("A distância entre os pontos é: " ,d)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 494; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */