package aresHacking;

public class Karte {

	enum Seite { KONZERN,KRIMINAL,CRITTER, SÖLDNER }
	Seite seite;
	
	enum Tier {	EINS,ZWEI,DREI,VIER,FÜNF }
	

	int hp;
	
	int attack;
	int sleaze;
	int dataProcessing;
	int firewall;
	
	boolean sleazed=true;
	
	enum Art { KAMPF,MODUL,EFFEKT,HOST,DECK }
	Art art;
	
	enum Modus {	ATTACKE, VERTEIDIGUNG	}
	Modus modus;
	
	enum Sim{	HOT,COLD	}
	Sim sim;
	
	//Name	 
	public Karte(String Name) {
		System.out.println("Name: "+ Name);
	}
	//Seite
	public void setSeite(Seite karteseite) {
		seite = karteseite;
	}
	
	public Seite getSeite() {
		System.out.println("Die Seite der Karte ist: "+ seite);
		return seite;
	}
	//HP
	public void setHP(int karteHP) {
		hp = karteHP;
	}

	public int getHP() {
		System.out.println("Die Lebenspunkte der Karte sind: "+ hp);
		return hp;
	}
	//Attack
	public void setAttack(int karteAttack) {
		attack = karteAttack;
	}
	
	public int getAttack() {
		System.out.println("Die Karte hat: "+ attack+" Attacke");
		return attack;
	}
	//Sleaze
	public void setSleaze(int karteSleaze) {
		sleaze = karteSleaze;
	}
	
	public int getSleaze() {
		System.out.println("Die Karte hat: "+ sleaze+" Sleaze");
		return sleaze;
	}
	//DataProcessing
	public void setDataProcessing(int karteDataProcessing) {
		dataProcessing = karteDataProcessing;
	}
	
	public int getDataProcessing() {
		System.out.println("Die Karte hat: "+ dataProcessing+" Data Processing");
		return dataProcessing;
	}
	//Firewall
	public void setFirewall(int karteFirewall) {
		firewall = karteFirewall;
	}
	
	public int getFirewall() {
		System.out.println("Die Karte hat: "+ firewall +" Firewall");
		return firewall;
	}
	//Attribute
	public int[] getAttribute() {
		int[] attribute;
		attribute = new int[4];
		attribute[0]=attack;
		System.out.println("Die Karte hat: "+ attack+" Attacke");
		attribute[1]=sleaze;
		System.out.println("Die Karte hat: "+ sleaze+" Sleaze");
		attribute[2]=dataProcessing;
		System.out.println("Die Karte hat: "+ dataProcessing+" Data Processing");
		attribute[3]=firewall;
		System.out.println("Die Karte hat: "+ firewall +" Firewall");
		
		return attribute;
	}
	
	public void setAttribute(int karteAttack,int karteSleaze,int karteDataProcessing,int karteFirewall) {
		attack = karteAttack;
		sleaze = karteSleaze;
		dataProcessing = karteDataProcessing;
		firewall = karteFirewall;
	}
	
	
	//Art
	public void setArt(Art karteArt) {
		art = karteArt;
	}
	
	public Art getArt() {
		System.out.println("Die Karte ist eine "+ art + "karte");
		return art;
	}
	
	
	
	
}


