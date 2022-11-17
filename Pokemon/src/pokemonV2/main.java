package pokemonV2;




public class main {


	public static void main(String[] args) {
		
		
		Pokemon p1 = new PokemonFeu("Salamèche");
		Pokemon p2 = new PokemonEau("Carapuce");
		Pokemon p3 = new PokemonPlante("Bulbizare");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		p3.log(p3.toString());

		
		p1.attaquer(p3);
		p2.attaquer(p1);
		
		p2.attaquer(p3);
	}

}
