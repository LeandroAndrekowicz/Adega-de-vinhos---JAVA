import java.util.Random;
public class utilitarioNotaFiscal {
	public void mostrarNotaFiscal(Produtos[] produtos, NotaFiscal notafiscal, Cliente[] clientes, Empresa empresa){
		int min = 0;
		int max = 4;
		Random random = new Random();
		int i = random.nextInt(min + max) + min;
		System.out.println("___________________________________________________________________");
		System.out.println("|Empresa: " + empresa.getNome() + " CNPJ: " + empresa.getCnpj() + " Ramo: "+ empresa.getRamo());
		System.out.println("|Cliente: " +clientes[0].getNome()+" CPF: " + clientes[0].getCpf());
		System.out.println("|Forma de pagamento: "+ notafiscal.getFormaDePagamento() + " Banco: " + notafiscal.getBanco());
		System.out.println("|Produto comprado: " + produtos[i].getNome() + " Valor: "+produtos[i].getPreço()+" R$");
		System.out.println("--------------------------------------------------------------------");
	}
}
