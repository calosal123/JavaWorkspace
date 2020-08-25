package model;

import datainterface.InterfaceBD;

public abstract class Funcionario implements InterfaceBD{
	
	protected int    numRegistro;
	protected String nome;
	
	public Funcionario(int numRegistro, String nome) {
		super();
		this.numRegistro = numRegistro;
		this.nome = nome;
	}
	
	// esta é minha cláusula contratual
	public abstract float calcularSalario();

	public int getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(int numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void salvarNoBanco() {
		System.out.println("TILT-------------");
	}
	public void recuperarDoBanco() {
		
	}
}
