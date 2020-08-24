package model;

public class ContaEspecial extends Conta {
	private float limite;
	
	public ContaEspecial(String nomeTitular, String cpf, int numConta, float saldo, float limite) {
		super(nomeTitular, cpf, numConta, saldo);
		this.limite = limite;
	}

	public boolean debitar(float valor) {
		if (saldo + limite >= valor) {
			saldo = saldo - valor;
			return true;
		}
		else {
			return false;
		}
	}

	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numConta="
				+ numConta + ", saldo=" + saldo + "]";
	}
	
	
	
	
}
