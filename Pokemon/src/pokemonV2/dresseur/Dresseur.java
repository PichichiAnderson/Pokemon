package pokemonV2.dresseur;

public class Dresseur {

	private String nom;
	private int argent;
	private int nbPokemon;
	
	public Dresseur(String nom) {
		this.nom = nom;
		this.argent = 0;
	}

	public String getNom() {
		return this.nom;
	}
	
	public int getNbPokemon() {
		return this.nbPokemon;
	}
	
	
}
