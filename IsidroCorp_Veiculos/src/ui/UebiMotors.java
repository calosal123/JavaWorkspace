package ui;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class UebiMotors {
	public static void main(String args[]) {
		Veiculo v1, v2;
		
		v1 = new Carro("Porxe");
		v2 = new Moto("Cavazáqui");
		
		v1.acelerar();
		v2.acelerar();
	}

}
