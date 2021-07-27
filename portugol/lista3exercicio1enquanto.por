programa
/*Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, 
 * a média e o total de valores lidos. 
 * O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos. 
 * Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/
{
	
	funcao inicio()
	{
		inteiro numero=0, soma=0
		real media
		inteiro contador=0
		enquanto (numero >= 0){
			escreva("Digite um número: ")
			leia(numero)

			soma +=numero
			contador++

			}
		media = soma/contador
		escreva("A soma é: " ,soma)
		escreva("\nA média é: " ,media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 627; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */