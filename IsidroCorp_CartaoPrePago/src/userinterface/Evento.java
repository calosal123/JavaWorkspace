package userinterface;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class Evento {
	
	// vou alterar a Main pra ele não executar essa função
	public static void main(/*String args[]*/) {
		
		CartaoPrePago c1, c2, c3, c4;
		
		c1 = new CartaoPrePago ("1111.2222.3333.4444","Cliente Fulano  ", 2025, 10, 1000);
		c2 = new CartaoCashBack("2222.3333.4444.5555","Cliente Cicrano ", 2025, 10, 1000, 0);
		c3 = new CartaoCashBack("3333.4444.5555.6666","Cleinte Beltrano", 2025, 10, 1000, 1);
		c4 = new CartaoCashBack("4444.5555.6666.7777","Cliente Zelano  ", 2025, 10, 1000, 2);
		
		if (c1.comprar(100)) {
			System.out.println("Compra autorizada no cartao "+c1.getNumeroCartao());
		}
		else {
			System.out.println("Compra recusada");
		}
		if (c2.comprar(100)) {
			System.out.println("Compra autorizada no cartao "+c2.getNumeroCartao());
		}
		else {
			System.out.println("Compra recusada");
		}
		if (c3.comprar(100)) {
			System.out.println("Compra autorizada no cartao "+c3.getNumeroCartao());
		}
		else {
			System.out.println("Compra recusada");
		}
		if (c4.comprar(100)) {
			System.out.println("Compra autorizada no cartao "+c4.getNumeroCartao());
		}
		else {
			System.out.println("Compra recusada");
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
	}

}
