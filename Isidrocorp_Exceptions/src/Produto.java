
public class Produto {
	private int id;
	private String descricao;
	private float preco;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id)  {
		if (id <= 0) {
			throw new IsiException("ID invalido!");
		}
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao == null || descricao.length() == 0) {
			throw new IsiException("Descricao invalida!");
		}
		this.descricao = descricao;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco)  {
		if (preco < 0) {
			throw new IsiException("PRECO nao pode ser negativo!");
		}
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", preco=" + preco + "]";
	}

}
