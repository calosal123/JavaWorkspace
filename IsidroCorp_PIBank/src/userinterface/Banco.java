package userinterface;

import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String args[]) {
		Conta c1;
		ContaEspecial c2;
		
		
		c1 = new Conta("Professor Isidro","123.456.789-00",1234,100);
		
		c2 = new ContaEspecial("Jose de Almeida","987.654.321-00",9876,200,100);
	
		System.out.println("Conta "+c2.getNumConta()+"/"+c2.getNomeTitular()+"  R$ "+c2.getSaldo());
		if (c2.debitar(230)) {
			System.out.println("Debito de R$230,00 efetuado");
		}
		else {
			System.out.println("Saldo insuficiente para debito");
		}
		System.out.println("Conta "+c2.getNumConta()+"/"+c2.getNomeTitular()+"  R$ "+c2.getSaldo());
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
