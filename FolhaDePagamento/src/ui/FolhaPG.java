package ui;

import java.util.Scanner;

import model.Funcionario;

public class FolhaPG {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		Funcionario lista[];   // aqui eu tenho a possibilidade de criar uma lista de funcionarios
		
		// toda lista (array ou vetor) é um conjunto de variáveis do mesmo tipo que estão na memória
		// 2 características -> precisam ter tamanho fixo 
		//                      começam da posição 0
		
		lista = new Funcionario[35];  // eu estou aqui criando uma lista de 10 referências para
		                              // a classe Funcionario. É como se eu tivesse as seguintes
									  // variaveis: lista0, lista1, lista2, lista3... lista9
		
		
		// vou "simular" uma recuperação do banco
		for (int pos=0; pos<lista.length; pos++) {
			lista[pos] = new Funcionario((pos+1), "Funcionario"+pos, "Analista",(10 * (pos+1)), 80+(pos+1)*2);
		}
		
		// vamos então mostrar a folha de pagamento inteira!!!
		for (int pos = 0; pos < lista.length; pos++) {
			System.out.printf("%4d %-20s %-20s R$ %9.2f   R$ %9.2f    R$ %9.2f\n", lista[pos].getNumFuncional(),
					                                                          lista[pos].getNome(),
					                                                          lista[pos].getCargo(),
					                                                          lista[pos].calcularSalarioBruto(),
					                                                          lista[pos].calcularImposto(),
					                                                          lista[pos].calcularSalarioLiquido());
		}
	}

}
