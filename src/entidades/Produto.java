package entidades;

public abstract class Produto {
	
	private int c�digo;
	private String nome;
	private double preco;
	
	public Produto(int c�digo, String nome,double preco) {
		super();
		this.c�digo = c�digo;
		this.nome = nome;
		
		this.preco = preco;
	}
	
	public Produto() {	
	}
	
	public int getC�digo() {
		return c�digo;
	}
	public void setC�digo(int c�digo) {
		this.c�digo = c�digo;
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
