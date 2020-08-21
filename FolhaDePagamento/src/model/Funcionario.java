package model;

public class Funcionario {
	private int    numFuncional;
	private String nome;
	private String cargo;
	private double valorHora;
	private int    numHoras;
	
	public Funcionario(int numFuncional, String nome, String cargo, double valorHora, int numHoras) {
		super();
		
		//this.numFuncional = numFuncional;
		//this.nome = nome;
		//this.cargo = cargo;
		//this.valorHora = valorHora;
		//this.numHoras = numHoras;
		setNumFuncional(numFuncional);
		setNome(nome);
		setCargo(cargo);
		setValorHora(valorHora);
		setNumHoras(numHoras);
	}

	public int getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}
	
	public double calcularSalarioBruto() {
		return this.valorHora * this.numHoras;
	}
	
	public double calcularImposto() {
		double salBruto = this.calcularSalarioBruto();
		double imposto = 0;
		if (salBruto <= 1000) {
			imposto = 0;
		}
		else if (salBruto <= 2500) {
			imposto = salBruto * 0.15;
		}
		else if (salBruto <= 5000) {
			imposto = salBruto * 0.275;
		}
		else {
			imposto = 1650.0;
		}
		return imposto;
	}
	
	public double calcularSalarioLiquido() {
		double salLiquido = this.calcularSalarioBruto() - this.calcularImposto();
		return salLiquido;
	}
}
