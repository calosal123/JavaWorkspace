package model;

import datainterface.InterfaceBD;

public class Comissionado extends Funcionario  {

	private float salarioBase;
	private float comissao;
	
	
	public Comissionado(int numRegistro, String nome, float salarioBase, float comissao) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase * comissao / 100;
	}

	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Comissionado [salarioBase=" + salarioBase + ", comissao=" + comissao + ", numRegistro=" + numRegistro
				+ ", nome=" + nome + "]";
	}

	@Override
	public void salvarNoBanco() {
		System.out.println("SALVANDO NO BANCO O OBJETO COMISSIONADO");
		System.out.println("BD="+toString());
		
	}

	@Override
	public void recuperarDoBanco() {
		// TODO Auto-generated method stub
		
	}
}
