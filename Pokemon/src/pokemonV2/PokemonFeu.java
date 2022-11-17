package pokemonV2;

public class PokemonFeu extends Pokemon{

	
	
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}

	
	public void attaquer(Pokemon p) {
		this.log("J'attaque "+p.getNom()+" : "+this.getType()+" VS "+p.getType());
		p.subir(this);
		
	}

	
	public void subir(Pokemon p) {
		
		if (p.getType() == TypePokemon.EAU ) {
			this.hp -= 2 * p.getAtk();
			p.log("C'est très efficace !");
		}
		else  {
			this.hp -= 0.5 * p.getAtk();
			p.log("C'est peu efficace...");
		}
		
		
	}
	
	
	

}
