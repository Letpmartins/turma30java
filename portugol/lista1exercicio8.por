programa
{
	
	funcao inicio()
	{
		real valorFabrica, distribuidor, impostos, valorConsumidor

		escreva("digite o valor de fábrica d automóvel: ")
		leia(valorFabrica)

		distribuidor = valorFabrica*0.28
		impostos = valorFabrica*0.45

		valorConsumidor = valorFabrica + distribuidor + impostos

		escreva("O valor de venda do automóvel é: " ,valorConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */