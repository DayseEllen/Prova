package entidades;

public abstract class Produto {
	
	private int código;
	private String nome;
	private double preco;
	
	public Produto(int código, String nome,double preco) {
		super();
		this.código = código;
		this.nome = nome;
		
		this.preco = preco;
	}
	
	public Produto() {	
	}
	
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
