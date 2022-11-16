package pokemon;

import java.util.Random;


public class Pokemon0 {

	private String nom;
	private int niveau;
	private int hp;
	private int atk;
	
	
	
	public Pokemon0(String nom) {
		Random niveau = new Random();
		
		this.nom = nom;
		this.niveau = niveau.nextInt(1, 11);
		this.hp = this.niveau * 2;
		this.atk = (this.niveau / 2) + 1;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getNiveau() {
		return this.niveau;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}
	
	public boolean isKo() {
		
		if( this.hp == 0) {
			return true;
		}
		return false;
	}
	
	public void soigner() {
		this.hp = this.getNiveau() * 2;
	}
	
	

}
