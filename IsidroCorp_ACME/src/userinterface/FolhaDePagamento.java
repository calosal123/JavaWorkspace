package userinterface;

import model.Chefe;
import model.Funcionario;

public class FolhaDePagamento {
	public static void main(String args[]) {
		
		Funcionario lista[] = new Funcionario[10];
		
		lista[0] = new Chefe(1,"Jose Almeida", 3500, 15, 850);
		// -- preencher o resto
		
		
		for (Funcionario f: lista) {
			System.out.println(f.getNome()+" R$ "+f.calcularSalario());
		}
	}

}
