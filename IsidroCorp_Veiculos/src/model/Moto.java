package model;

public class Moto extends Veiculo{

	public Moto(String marca) {
		super(marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando a moto "+marca+" na mao - Propropropropro");
	}
	

}
