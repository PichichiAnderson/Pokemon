package pokemonV2.dresseur;

import pokemonV2.Pokemon;

public class Dresseur {

	private String nom;
	private int argent;
	private int nbPokemon;
	private SacADos sac;
	
	public Dresseur(String nom) {
		this.nom = nom;
		this.argent = 0;
	}

	public String getNom() {
		return this.nom;
	}
	
	public int getNbPokemons() {
		return this.nbPokemon;
	}
	
	public void prendreArgent(Dresseur dresseur) {
		this.argent += 10;
		dresseur.argent -= 10;
	}
	
	public void pokeCenter() {
		this.sac.pokeCenter();
	}
	
	public boolean peutCombattre() {
		 return (this.argent > 0 && this.sac.peutCombattre());
		
	}
	
	public Pokemon getNextPokemon() {
		return this.sac.getNextPokemon();
	}
	
	
}
