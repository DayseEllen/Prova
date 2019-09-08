package entidades;

public class PagamentoAPrazo implements PagamentoImplementado{
	
	@Override
	public void pagarCompraTipo(Produto produto) {
		produto.setPreco(produto.getPreco()*1.5);
		System.out.println("Pagamento a prazo");
		System.out.println("O preço do "+produto.getNome()+" passou a ser: "+produto.getPreco());
		
	}


}
