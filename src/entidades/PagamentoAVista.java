package entidades;

public class PagamentoAVista implements PagamentoImplementado{

	@Override
	public void pagarCompraTipo(Produto produto) {
		produto.setPreco(produto.getPreco()*0.6);
		System.out.println("Pagamento a vista");
		System.out.println("O preço do "+produto.getNome()+" passou a ser: "+produto.getPreco());
		
	}

}