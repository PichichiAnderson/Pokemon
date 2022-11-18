package pokemonV2.dresseur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;


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
	
	public void capturerPokemons() {
		Random r = new Random();
		
		

		
		
		
	}
	
	public boolean peutCombattre() {
		for(int i=0; i < this.getNbPokemons(); i++) {
			if( !this.pokemons.get(i).isKO() ) {
				return true;
			}
		}
		return false;
		
	}
	
	public void combattre(Dresseur adversaire) {
		
	}
	
	public void pokeCenter() {
		for(int i=0; i < this.getNbPokemons(); i++) {
			this.pokemons.get(i).soigner();
		}
	}
	
	public Pokemon getNextPokemon() {
		
		for(int i = 0; i<this.getNbPokemons(); i++) {
			if ( this.pokemons.get(i).isKO() ) {
				return this.pokemons.get(i);
			}
		}
		return null;
	}

}
