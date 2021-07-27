programa
/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
*E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
*uando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, 
*caso contrário zerar tal variável. 
*A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
*/

{
	
	funcao inicio()
	{
		inteiro N, E, salario
		cadeia C
		E=0
		
		escreva("Digite o códogo do operário: ")
		leia(C)
		escreva("Digite o número de horas trabalhadas:")
		leia(N)
		
		se (N <= 50) {
			salario = N*10
			escreva("Funcionário código: " ,C)
			escreva("\nSalário total: R$" ,salario ,",00.")
			escreva("\nSalário excedente: R$" ,E ,"0,00")
			}
		senao {
			E = (N-50)*20
			salario = 500 + E
			escreva("Funcionário código: " ,C)
			escreva("\nSalário total: R$" ,salario ,",00.")
			escreva("\nSalário excedente: R$" ,E ,",00")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 512; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */