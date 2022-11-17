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
	
	public boolean isKO() {
		
		if( this.hp == 0) {
			return true;
		}
		return false;
	}
	
	public void soigner() {
		this.hp = this.getNiveau() * 2;
	}
	
	public void attaquer(Pokemon0 p) {
		
		p.hp -= this.getAtk();
		
	}
	
	public String toString() {
		String msg = " Je m'appelle "+this.getNom()+" !\n je suis de niveau "+this.getNiveau()+" \n j'ai "+this.getHp()+" points de vie \n mon attaque de base est de "+this.getAtk();
		return msg;
	}
	
	private String prefixe() {
		String msg = "[Pokemon "+this.getNom()+ "] : ";
		return msg;
	}
	public void log(String msg) {
		System.out.println(this.prefixe() + msg);
		
		
	}
	
	public static void main(String[] args) {
		Pokemon0 p1 = new Pokemon0("Carapuce");
		Pokemon0 p2 = new Pokemon0("Salamèche");
		
		p1.log(p1.toString());
		p2.log(p2.toString());
		
		p1.attaquer(p2);
		p2.log(p2.toString());

	
	}

}
