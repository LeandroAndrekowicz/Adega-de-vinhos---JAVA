
public class NotaFiscal {
	private String formaDePagamento;
	private String banco;
	public NotaFiscal(String formaDePagamento, String banco) {
		this.banco = banco;
		this.formaDePagamento = formaDePagamento;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	
}
