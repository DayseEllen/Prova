package entidades;

public class CanhotoTortaIngredientesFactory extends TortaIngredientesFactory{
	
	public CanhotoTortaIngredientesFactory() {
		System.out.println("A torta a ser preparada terá o estilo de Canhotinho");
	}

	@Override
	public Massa criarMassa() {
		System.out.println("Massa Amanteigada sendo adicionada");
		return new MassaAmanteigada();
	}

	@Override
	public Recheio criarRecheio() {
		System.out.println("Recheio Gorduroso sendo adicionado");
		return new RecheioGorduroso();
	}

}
