package model;

import datainterface.InterfaceBD;

public class Horista extends Funcionario{

	@Override
	public String toString() {
		return "Horista [valorHora=" + valorHora + ", numeroHoras=" + numeroHoras + ", numRegistro=" + numRegistro
				+ ", nome=" + nome + "]";
	}


	private float valorHora;
	private int   numeroHoras;
	
	
	public Horista(int numRegistro, String nome, float valorHora, int numeroHoras) {
		super(numRegistro, nome);
		this.valorHora = valorHora;
		this.numeroHoras = numeroHoras;
	}


	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return valorHora*numeroHoras;
	}


	public float getValorHora() {
		return valorHora;
	}


	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}


	public int getNumeroHoras() {
		return numeroHoras;
	}


	public void setNumeroHoras(int numeroHoras) {
		this.numeroHoras = numeroHoras;
	}

	@Override
	public void salvarNoBanco() {
		System.out.println("SALVANDO NO BANCO O OBJETO HORISTA");
		System.out.println("BD="+toString());
		
	}


	@Override
	public void recuperarDoBanco() {
		// TODO Auto-generated method stub
		
	}
	


	
	

}
