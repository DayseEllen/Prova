package entidades;

public class GusTortaIngredientesFactory extends TortaIngredientesFactory{
	
	public GusTortaIngredientesFactory() {
		System.out.println("A torta a ser preparada terá o estilo de Garanhuns");
	}

	@Override
	public Massa criarMassa() {
		System.out.println("Massa Chiffon sendo adicionada");
		return new MassaChiffon();
		
	}

	@Override
	public Recheio criarRecheio() {
		System.out.println("Recheio Gourmet sendo adicionado");
		return new RecheioGourmet();
	}
	

}
