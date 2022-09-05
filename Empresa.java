
public class Empresa {
	private String nome;
	private String cnpj;
	private String ramo;
	public Empresa(String nome, String cnpj, String ramo) {
		this.cnpj = cnpj;
		this.nome = nome;
		this.ramo = ramo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
}
