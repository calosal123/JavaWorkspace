package userinterface;

import datainterface.InterfaceBD;
import model.Administrativo;
import model.Chefe;
import model.Comissionado;
import model.Empreiteiro;
import model.Funcionario;
import model.Horista;

public class FolhaDePagamento {
	public static void main(String args[]) {
		
		Funcionario lista[] = new Funcionario[10]; // tamanho fixo e pré-definido
		
		lista[0] = new Chefe(1,"Jose Almeida", 3500f, 15f, 850f);
		lista[1] = new Empreiteiro(2, "Ana Pires", 5000f);
		lista[2] = new Comissionado(3, "Carlos Santos", 2500f, 27.5f);
		lista[3] = new Horista(4, "Paula Torres", 85.0f, 70);
		lista[4] = new Horista(5, "Roberto Nunes", 78.50f, 112);
		lista[5] = new Comissionado(6, "Monica Silvestre", 2750f, 18f);
		lista[6] = new Comissionado(7, "Pedro Albuquerque", 1950f, 35f);
		lista[7] = new Administrativo(8, "Joao Maldonado", 4000f, 400f, 650f);
		lista[8] = new Administrativo(9, "Marcelo Moreira", 3700f, 350f, 650f);
		lista[9] = new Comissionado(10, "Felipe Cunha", 2000f, 22f);

		
		InterfaceBD ibd;
		
		System.out.println("---------> Exibindo folha de pagamento <----------");
		for (int pos=0; pos < lista.length; pos++) {
			Funcionario f = lista[pos];
			System.out.printf("%3d %-20s %-20s R$ %7.2f\n", f.getNumRegistro(), f.getNome(), f.getClass().getSimpleName(), f.calcularSalario());
		}
		
		System.out.println("---------> Gravando tudo no banco <----------");
		for (int pos=0; pos < lista.length; pos++) {
			ibd = lista[pos];
			ibd.salvarNoBanco();
		}
	}

}
