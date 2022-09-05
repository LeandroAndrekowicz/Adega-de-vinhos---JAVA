
public class Main {

	public static void main(String[] args) {
		Cliente clientes[] = new Cliente[2];
		clientes[0] = new Cliente("Roberto Gonçalves","109.398.356.12");
		clientes[1] = new Cliente("Marcelo Gomes","134.237.312.67");
		Empresa empresa = new Empresa("Cellar Vinhos", "34.183.235/0001-88", "Vinhos");
		Produtos produtos[] = new Produtos[4];
		produtos[0] = new Produtos("ROSÉ DES CROISILLE", "Malbec", "  2020", 175.00);
		produtos[1] = new Produtos("JET'AI DANS LA VIE", "Cabernet", "2019", 240.00);
		produtos[2] = new Produtos("ROSÉ L'AUDACIEUSE ", "Blend", "   2019", 295.00);
		produtos[3] = new Produtos("ROSÉ DE TRUFFIÈRE ", "Syrah", "   2017", 325.00);
		NotaFiscal notaFiscal = new NotaFiscal("Cartão de Crédito","Banco do Brasil");
		
		utilitarioNotaFiscal unf = new utilitarioNotaFiscal();
		unf.mostrarNotaFiscal(produtos, notaFiscal, clientes, empresa);
		
		utilitarioProdutos up = new utilitarioProdutos();
		up.mostrarProdutos(produtos);
	}

}
