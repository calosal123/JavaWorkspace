package core;

public class Produto {
	private int codigo;
	private String nome;
	private String detalhes;
	private float  preco;
	
	public Produto(int codigo, String nome, String detalhes, float preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
