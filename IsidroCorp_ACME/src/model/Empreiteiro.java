package model;

import datainterface.InterfaceBD;

public class Empreiteiro extends Funcionario{
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


	@Override
	public String toString() {
		return "Empreiteiro [valorEmpreita=" + valorEmpreita + ", numRegistro=" + numRegistro + ", nome=" + nome + "]";
	}


	@Override
	public void salvarNoBanco() {
		System.out.println("SALVANDO NO BANCO O OBJETO EMPREITEIRO");
		System.out.println("BD="+toString());
	}


	@Override
	public void recuperarDoBanco() {
		// TODO Auto-generated method stub
		
	}
	

}
