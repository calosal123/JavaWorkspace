package model;

public class Carro extends Veiculo{

	public Carro(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando o carro "+marca+"  no pé - Vruuuummmmm");
	}
	
	

}
