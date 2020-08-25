package model;

public class Empreiteiro extends Funcionario {
	private float valorEmpreita;

	
	public Empreiteiro(int numRegistro, String nome, float valorEmpreita) {
		super(numRegistro, nome);
		this.valorEmpreita = valorEmpreita;
	}


	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorEmpreita;
	}


	public float getValorEmpreita() {
		return valorEmpreita;
	}


	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	

}
