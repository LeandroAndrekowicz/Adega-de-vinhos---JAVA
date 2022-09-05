
public class Produtos {
	private String nome;
	private String uva;
	private String ano;
	private double preço;
	public Produtos(String nome, String uva, String ano, double preço) {
		this.ano = ano;
		this.nome = nome;
		this.preço = preço;
		this.uva = uva;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUva() {
		return uva;
	}
	public void setUva(String uva) {
		this.uva = uva;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}
	
}
