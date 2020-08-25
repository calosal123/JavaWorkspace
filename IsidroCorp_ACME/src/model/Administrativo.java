package model;

public class Administrativo extends Funcionario {
	private float salarioBase;
	private float valeTransporte;
	private float ticket;

	
	public Administrativo(int numRegistro, String nome, float salarioBase, float valeTransporte, float ticket) {
		super(numRegistro, nome);
		this.salarioBase = salarioBase;
		this.valeTransporte = valeTransporte;
		this.ticket = ticket;
	}

	@Override
	public float calcularSalario() {
		// TODO Auto-generated method stub
		return salarioBase + valeTransporte + ticket;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getValeTransporte() {
		return valeTransporte;
	}

	public void setValeTransporte(float valeTransporte) {
		this.valeTransporte = valeTransporte;
	}

	public float getTicket() {
		return ticket;
	}

	public void setTicket(float ticket) {
		this.ticket = ticket;
	}

}
