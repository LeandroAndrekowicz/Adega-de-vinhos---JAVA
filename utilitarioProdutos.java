
public class utilitarioProdutos {
	public void mostrarProdutos(Produtos[] produtos) {
		System.out.println("__________________________________________________________");
		System.out.println("|        Nome"+"           Uva"+"          Ano"+"      Preço      |");
		System.out.println("----------------------------------------------------------");
		for(int i=0; i<produtos.length;i++) {
			if(produtos[i] != null) {
				System.out.println("|"+produtos[i].getNome()+"     "+produtos[i].getUva()+"     "+produtos[i].getAno()+"     "+produtos[i].getPreço()+" R$   |");
			}
		}
		System.out.println("----------------------------------------------------------");
	}
}
