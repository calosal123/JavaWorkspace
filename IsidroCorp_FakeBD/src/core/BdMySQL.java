package core;

public class BdMySQL implements InterfaceBD{

	@Override
	public void conectar() {
		System.out.println("Conectando no banco MySQL");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectando do banco MySQL");
		
	}

	@Override
	public void executarComando(String comando) {
		System.out.println("mysql> "+comando);
		
	}

}
