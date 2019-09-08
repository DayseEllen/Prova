package entidades;

public class Cliente extends Pessoa {

	private String tipo;

	public Cliente(String nome, String cpf, String tipo) {
		super(nome, cpf);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
