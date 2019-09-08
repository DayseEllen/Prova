package entidades;

import java.util.Date;

public class TortaDoce extends Torta{
	
	private TortaIngredientesFactory ingredientes;
	private Massa massa;
	private Recheio recheio; 

	public TortaDoce(int c�digo, String nome, double preco, Date validade, Date fabricacao) {
		super(c�digo, nome, preco, validade, fabricacao);
		// TODO Auto-generated constructor stub
	}
	
	public TortaDoce(TortaIngredientesFactory ingredientes) {
		this.ingredientes = ingredientes;
		PreparaTorta();
	}
	
	public void PreparaTorta() {
		System.out.println("Preparando torta doce");
		massa = ingredientes.criarMassa();
		recheio = ingredientes.criarRecheio();
	}
	

}
