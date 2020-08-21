
public class Pessoa {
	private int     numId;
	private String  nome;
	private String  email;
	private String  telefone;
	private String  logradouro;
	private int     numero;
	private String  complemento;
	private String  cidade;
	private String  bairro;
	private String  estado;
	private String  cep;
	private boolean habilitado;
	

	public Pessoa(int numId, String nome, String email, String telefone, String logradouro, int numero,
			      String complemento, String cidade, String bairro, String estado, String cep, boolean habilitado) {
		this.numId = numId;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.cep = cep;
		this.habilitado = habilitado;
	}
	
	public Pessoa() {
		// aqui infelizmente nao faço nada, porém deixo disponível para o programador poder criar um
		// objeto com conteúdo "vazio"
	}
	
	public Pessoa(String nome, String email) {
		this.nome  = nome;
		this.email = email;
	}
	public Pessoa(int numId, int numero) {
		
	}

	
	
	public Pessoa(int numId, String nome, String email, String telefone) {
		this.numId = numId;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}


	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public int getNumId() {
		return numId;
	}
	public void setNumId(int numId) {
		this.numId = numId;
	}
	
	public void setNumId(String txtId) {
		this.numId = Integer.parseInt(txtId);
	}
	 String getNome() {
			return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	 String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	 String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
