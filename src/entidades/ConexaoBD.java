package entidades;

public class ConexaoBD {
	
	private static ConexaoBD instancia; 
	private String url; 
	private String usuario = "admin";
	private String senha = "admin";
	private boolean status;
	
	private ConexaoBD() {
		
	}

	public static synchronized ConexaoBD getInstance(){	
		if(instancia == null) {
			instancia = new ConexaoBD();
		}
		return instancia; 
	}
	
	public void conectar() {
		this.status = true;
		System.out.println("Conectando BD");
	}

	public void desconectar() {
		this.status = false;
		System.out.println("Desconectando BD");
	}
	
	public void addProduto(Produto produto) {
		if(this.status) {
			System.out.println("Adicionando o produto " +produto.getNome()+ " no Banco de Dados");
		}else {
		System.out.println("O Banco de Dados está desconectado");
	}
	}
	
	

}
