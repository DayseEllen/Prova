package entidades;

public class Facade {
	private String login;
	private String senha;
	
	public Facade(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public Facade() {
		
	}
	
	public void registrarcompra(String nome, String cpf, String tipo) {
		Cliente cliente = new Cliente(nome, cpf, tipo);
		System.out.println("Iniciando a sua compra, "+cliente.getNome());
	}
	
	public void comprar(Produto produto,String cpf,PagamentoAbstrato pagamento) {
		pagamento.pagar(produto);
	}
	
	public void encerrarCompra() {
		System.out.println("Compra do(s) produtos finalizada");
		
	}
	
	public void PrepararTorta(String cidade, String tipo){
		if(verifica()) {
        if(tipo.equals("salgada")){
            new TortaSalgada(getIngredientes(cidade));
        }else if(tipo.equals("doce")){
            new TortaDoce(getIngredientes(cidade));
        }else {
        	System.out.println("Esse tipo de torta não é válido");
        }
	   }
    }
    
    private TortaIngredientesFactory getIngredientes(String cidade){
        if(cidade.equals("Garanhuns")){
            return new GusTortaIngredientesFactory();
        }else if(cidade.equals("Canhotinho")){
            return new CanhotoTortaIngredientesFactory();
        }else {
        	System.out.println("Essa cidade não está disponível para entrega");
        return null;
    }
  }
    
    public void addProdutoNoBanco(Produto produto) {
    	if(verifica()) {
    	ConexaoBD.getInstance().conectar();
		ConexaoBD.getInstance().addProduto(produto);
		ConexaoBD.getInstance().desconectar();
    	}
    }
    
    private boolean verifica() {
    	if(this.login == "Dayse" && this.senha == "Noemi") {
    		return true;
    	}else {
    		System.out.println("Você não possui o acesso");
    		return false;
    	}
    }


}
