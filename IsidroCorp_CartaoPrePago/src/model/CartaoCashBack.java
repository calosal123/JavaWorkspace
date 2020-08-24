package model;

public class CartaoCashBack extends CartaoPrePago {
	private int tipo; // 0 - GOLD / 1 - SILVER / 2 - BRONZE

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "CartaoCashBack [numeroCartao=" + numeroCartao + ", nomeTitular=" + nomeTitular + ", anoValidade="
				+ anoValidade + ", mesValidade=" + mesValidade + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public boolean comprar(double valor) {
		if (super.saldo >= valor) {
			super.saldo -= valor;
			switch (tipo) {
			case 0: // GOLD
				super.saldo += valor * 0.08;
				break;
			case 1:
				super.saldo += valor * 0.05;
				break;
			case 2:
				super.saldo += valor * 0.02;
				break;
			}
			return true;
		}
		return false;
	}
}
