programa
/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de 
 * filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
*/
{
	
	funcao inicio()
	{
		const inteiro TOTAL_HABITANTES = 5
		inteiro salario, filhos
		real totalSalario=0, totalFilhos=0
		inteiro maiorSalario = 0
		real mediaSalario, mediaFilhos, percentualHabitantes
		real contador=0

		para (inteiro x = 0; x < TOTAL_HABITANTES; x++){
			escreva("Digite o salário: ")
			leia(salario)
			escreva("Digite o numero de filhos: ")
			leia(filhos)

			totalSalario += salario
			totalFilhos += filhos

			se (salario <= 100){
				contador++
				}
			}
			
		mediaSalario = totalSalario/TOTAL_HABITANTES
		mediaFilhos = totalFilhos/TOTAL_HABITANTES
		percentualHabitantes = (contador/TOTAL_HABITANTES)*100

		escreva("Média salarial: R$" ,mediaSalario)
		escreva("\nMédia de Filhos: " ,mediaFilhos)
		escreva("\nHabitantes com salário de até R$100,00: " ,percentualHabitantes ,"%.")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1066; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */