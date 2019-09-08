package entidades;

public class CompraAVistaDialogo extends PagamentoAbstrato{

	public CompraAVistaDialogo(PagamentoImplementado pagamento) {
		super(pagamento);
	}


	@Override
	void pagar(Produto produto) {
		pagarCompraTipo(produto);
		
	}

	

}
