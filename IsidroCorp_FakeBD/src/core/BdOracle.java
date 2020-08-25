package core;

public class BdOracle implements InterfaceBD {

	@Override
	public void conectar() {
		System.out.println("Conectando no banco Oracle");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando banco Oracle");
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("oracle> "+comando);
		
	}
	

}
