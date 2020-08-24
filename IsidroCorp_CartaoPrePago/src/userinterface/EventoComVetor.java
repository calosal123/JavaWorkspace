package userinterface;

import model.CartaoCashBack;
import model.CartaoPrePago;

public class EventoComVetor {
	public static void main(String args[]) {
		
		CartaoPrePago cartoes[];
		
		cartoes = new CartaoPrePago[6];
		
		cartoes[0] = new CartaoPrePago ("111222333444","Cliente 1", 2023, 1, 600);
		cartoes[1] = new CartaoPrePago ("222333444555","Cliente 2", 2022, 2, 500);
		cartoes[2] = new CartaoPrePago ("333444555666","Cliente 3", 2024, 3, 300);
		cartoes[3] = new CartaoCashBack("444555666777","Cliente 4", 2025, 1, 800, 0);
		cartoes[4] = new CartaoCashBack("555666777888","Cliente 5", 2024, 8, 700, 1);
		cartoes[5] = new CartaoCashBack("666777888999","Cliente 6", 2022, 9, 900, 2);
		
		for (int pos = 0; pos < cartoes.length; pos++) {
			CartaoPrePago c = cartoes[pos];
			if (c.comprar(350)) {
				System.out.println("Compra autorizada no cartao  "+c.getNumeroCartao());
			}
			else {
				System.out.println("ERRO - Compra nao autorizada ");
			}
		}
		
		// quero exibir o cartao e seus respectivos saldos
		// como interpreto esse novo formato de FOR?
		// Para cada CartaPrePago c na lista "CARTOES"
		for (CartaoPrePago c : cartoes) {
			System.out.printf("%s - R$ %.2f\n", c.getNumeroCartao(), c.getSaldo());	
		}
	}

}
