package entidades;

public abstract class PagamentoAbstrato {
	
	protected PagamentoImplementado pagamento;

	public PagamentoAbstrato(PagamentoImplementado pagamento) {
		super();
		this.pagamento = pagamento;
	}
	
	public void pagarCompraTipo(Produto produto) {
		pagamento.pagarCompraTipo(produto);
	}
	
	abstract void pagar(Produto produto);

}
