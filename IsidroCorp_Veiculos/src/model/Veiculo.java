package model;

public abstract class Veiculo {
	protected String marca;

	public Veiculo(String marca) {
		super();
		this.marca = marca;
	}
	
	// declarar um método abstrato
	// pra que criamos métodos abstratos?
	
	/* O propósito de declararmos métodos abstratos (e eles só podem ser declarados em classes
	 * abstratas) é firmarmos uma "cláusula de compromisso" entre pais e filhos (superclasse e subclasses)
	 * de modo que toda classe que herdar da classe abstrata (neste caso, qualquer classe que der EXTENDS
	 * em VEÍCULO) se compromete a implementar uma lógica específica
	 */
	
     public abstract void acelerar(); // aqui eu só defino o cabeçalho - obrigatoriamente não tenho corpo;
	
	

}
