package pokemonV2;


public enum TypePokemon {
	FEU("Feu"),
	EAU("Eau"),
	PLANTE("Plante");
	
	private String name;




	private TypePokemon(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}

}
