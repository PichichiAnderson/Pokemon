package pokemonV2;

public class PokemonEau extends Pokemon{

	public PokemonEau(String nom) {
		super(nom, TypePokemon.EAU);
	}

	@Override
	public void attaquer(Pokemon p) {
		this.log("J'attaque "+p.getNom()+" : "+this.getType()+" VS "+p.getType());
		p.subir(this);
		
	}

	@Override
	public void subir(Pokemon p) {
		
		if (p.getType() == TypePokemon.PLANTE ) {
			this.hp -= 2 * p.getAtk(); 
			p.log("C'est très efficace !");
		}
		else  {
			this.hp -= 0.5 * p.getAtk();
			p.log("C'est peu efficace...");
		}
		
	}
	
	

}
