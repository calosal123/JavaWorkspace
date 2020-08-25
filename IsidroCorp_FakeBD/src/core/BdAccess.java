package core;

public class BdAccess implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco ACCESS");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do banco ACCESS");
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("access> "+comando);
		
	}

}
