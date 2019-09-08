package entidades;

import java.util.Date;

public class Torta extends Produto{
	private Date validade, fabricacao;

	public Torta(int código, String nome, double preco, Date validade, Date fabricacao) {
		super(código, nome, preco);
		this.fabricacao=fabricacao;
		this.validade=validade;
	}
   public Torta() {
	   
   }

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}
	
	

	

}

