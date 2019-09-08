package entidades;

public class CompraAPrazoDialogo extends PagamentoAbstrato{
	
	public CompraAPrazoDialogo(PagamentoImplementado pagamento) {
		super(pagamento);
	}


	@Override
	void pagar(Produto produto) {
		pagarCompraTipo(produto);
		
	}

}