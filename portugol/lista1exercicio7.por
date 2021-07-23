programa
{
	
	funcao inicio()
	{
		inteiro A, B, C, D, E, F
		real x, y

		escreva("Defina os 6 coeficientes (a,b,c,d,e,f) das equações (dê ENTER para cada um): ")
		leia(A, B, C, D, E, F)

		x = ((C*E)-(B*F))/((A*E)-(B*D))
		y = ((A*F)-(C*D))/((A*E)-(B*D))

		escreva("As variáveis x e y são, respectivamente: " ,x ," e " ,y)
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 340; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */