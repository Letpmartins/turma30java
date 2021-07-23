programa				//exercicio3
{
	
	funcao inicio(){
		inteiro intervalo
		inteiro horas
		inteiro minutos
		inteiro segundos
		
		escreva("Digite o intervalo de duração do evento, em segundos: ")
		leia(intervalo)
		
		horas = intervalo/(60*60)
		minutos = (intervalo%(60*60))/60
		segundos = (intervalo%(60*60))%60

		escreva("O evento durou " ,horas ," horas, " ,minutos ," minutos e " ,segundos ," segundos.")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 421; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */