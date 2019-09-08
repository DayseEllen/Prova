package entidades;

import java.util.Date;

public class TortaSalgada extends Torta {
	
	private TortaIngredientesFactory ingredientes;
	private Massa massa;
	private Recheio recheio; 

	public TortaSalgada(int c�digo, String nome, double preco, Date validade, Date fabricacao) {
		super(c�digo, nome, preco, validade, fabricacao);
		// TODO Auto-generated constructor stub
	}
	
	public TortaSalgada(TortaIngredientesFactory ingredientes) {
		this.ingredientes = ingredientes;
		PreparaTorta();
	}
	
	public void PreparaTorta() {
		System.out.println("Preparando torta salgada");
		massa = ingredientes.criarMassa();
		recheio = ingredientes.criarRecheio();
	}
	

}
