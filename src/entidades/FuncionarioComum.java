package entidades;

public class FuncionarioComum extends Pessoa{
	private String funcao;
	private double salario;
	
	public FuncionarioComum(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

