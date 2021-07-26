programa
/*Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

{
	
	funcao inicio()
	{
		inteiro num1, num2, num3, num4
		

		escreva("Digite o primeiro número: ")
		leia(num1)
		escreva("Digite o segundo número: ")
		leia(num2)
		escreva("Digite o terceiro número: ")
		leia(num3)
		escreva("Digite o quarto número: ")
		leia(num4)

		se (num3*num3 >= 1000){
			escreva("Número 3: " ,num3)
			escreva("\nQuadrado 3: " ,num3*num3)
			}
		senao {
			escreva("Número 1: " ,num1)
			escreva("\nQuadrado do número 1: " ,num1*num1)
			escreva("\nNúmero 2: " ,num2)
			escreva("\nQuadrado do número 2: " ,num2*num2)
			escreva("\nNúmero 3: " ,num3)
			escreva("\nQuadrado do número 3: " ,num3*num3)
			escreva("\nNúmero 4: " ,num4)
			escreva("\nQuadrado do número 4: " ,num4*num4)
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 966; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */