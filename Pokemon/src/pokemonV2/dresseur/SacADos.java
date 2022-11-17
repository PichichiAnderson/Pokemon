package pokemonV2.dresseur;

import java.util.ArrayList;
import java.util.Collection;

import pokemonV2.*;

public class SacADos {

	private Dresseur dresseur;
	private ArrayList<Pokemon> pokemons;
	
	
	public SacADos(Dresseur dresseur) {
		this.dresseur = dresseur;
		this.pokemons = new ArrayList<Pokemon>(3);
		
	}
	
	public int getNbPokemons() {
		return this.pokemons.size();
	}
	
	public void capurerPokemons() {
		
	}
	

}
