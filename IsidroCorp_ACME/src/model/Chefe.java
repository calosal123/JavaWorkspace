package model;

import datainterface.InterfaceBD;

public class Chefe extends Funcionario {
	private float salarioBase;
	private float adicionalFuncao;
	private float beneficioTerno;
	
	public Chefe(int numRegistro, String nome, float salarioBase, float adicionalFuncao, float beneficioTerno) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.adicionalFuncao = adicionalFuncao;
		this.beneficioTerno = beneficioTerno;
	}
	
	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getAdicionalFuncao() {
		return adicionalFuncao;
	}

	public void setAdicionalFuncao(float adicionalFuncao) {
		this.adicionalFuncao = adicionalFuncao;
	}

	public float getBeneficioTerno() {
		return beneficioTerno;
	}

	public void setBeneficioTerno(float beneficioTerno) {
		this.beneficioTerno = beneficioTerno;
	}

	@Override
	public void salvarNoBanco() {
		System.out.println("SALVANDO NO BANCO O OBJETO CHEFE");
		System.out.println("BD="+toString());
	}

	@Override
	public String toString() {
		return "Chefe [salarioBase=" + salarioBase + ", adicionalFuncao=" + adicionalFuncao + ", beneficioTerno="
				+ beneficioTerno + ", numRegistro=" + numRegistro + ", nome=" + nome + "]";
	}

	@Override
	public void recuperarDoBanco() {
		// TODO Auto-generated method stub
		
	}



	
	
	
	

}
