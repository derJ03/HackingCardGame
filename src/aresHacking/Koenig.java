package aresHacking;

public class Koenig {

	int hp = 12;
	
	int attack = 3;
	int sleaze = 3;
	int dataProcessing = 3;
	int firewall = 3;
	
	int logic;
	int willpower;
	int intuition;
	
	int initiative;
	

	
	//HP
		public void setHP(int koenigHP) {
			hp = koenigHP;
		}

		public int getHP() {
			System.out.println("Der König hat "+ hp +" Lebenspunkte");
			return hp;
		}
		//Attack
		public void setAttack(int koenigAttack) {
			attack = koenigAttack;
		}
		
		public int getAttack() {
			System.out.println("Der König hat: "+ attack+" Attacke");
			return attack;
		}
		//Sleaze
		public void setSleaze(int koenigSleaze) {
			sleaze = koenigSleaze;
		}
		
		public int getSleaze() {
			System.out.println("Der König hat: "+ sleaze+" Sleaze");
			return sleaze;
		}
		//DataProcessing
		public void setDataProcessing(int koenigDataProcessing) {
			dataProcessing = koenigDataProcessing;
		}
		
		public int getDataProcessing() {
			System.out.println("Der König hat: "+ dataProcessing+" Data Processing");
			return dataProcessing;
		}
		//Firewall
		public void setFirewall(int koenigFirewall) {
			firewall = koenigFirewall;
		}
		
		public int getFirewall() {
			System.out.println("Der König hat: "+ firewall +" Firewall");
			return firewall;
		}
		//Attribute
		public int[] getAttribute() {
			int[] attribute;
			attribute = new int[4];
			attribute[0]=attack;
			System.out.println("Der König hat: "+ attack+" Attacke");
			attribute[1]=sleaze;
			System.out.println("Der König hat: "+ sleaze+" Sleaze");
			attribute[2]=dataProcessing;
			System.out.println("Der König hat: "+ dataProcessing+" Data Processing");
			attribute[3]=firewall;
			System.out.println("Der König hat: "+ firewall +" Firewall");
			
			return attribute;
		}
		
		public void setAttribute(int koenigAttack,int koenigSleaze,int koenigDataProcessing,int koenigFirewall) {
			attack = koenigAttack;
			sleaze = koenigSleaze;
			dataProcessing = koenigDataProcessing;
			firewall = koenigFirewall;
		}
		
		public void setlogic(int koenigLogic) {
			logic = koenigLogic;
		}

		public int getlogic() {
			System.out.println("Der König hat "+ logic +" Logic");
			return logic;
		}
		
		public void setwillpower(int koenigWillpower) {
			willpower = koenigWillpower;
		}

		public int getwillpower() {
			System.out.println("Der König hat "+ willpower +" Willpower");
			return willpower;
		}
		
		public void setintuition(int koenigIntuition) {
			intuition = koenigIntuition;
		}

		public int getintuition() {
			System.out.println("Der König hat "+ intuition +" Intuition");
			return intuition;
		}
		

		public int getinitiative() {
			initiative = getintuition()+getDataProcessing();
			System.out.println("Der König hat "+ initiative +" Initiative");
			return initiative;
		}
		
	
	
	
}
