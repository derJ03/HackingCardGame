package aresHacking;

import aresHacking.Karte;
import aresHacking.Koenig;
import aresHacking.Generator;


@SuppressWarnings("unused")
public class KarteTest{
	
	 @SuppressWarnings("static-access")
	public static void main(String args[]) {
	/*      Karte karte = new Karte("Testkarte");
	      karte.seite = Karte.Seite.KONZERN ;
	      System.out.println("Type: " + karte.seite);
	      karte.setHP(6);
	      karte.getHP();
	      
	      karte.setArt(karte.art.MODUL);
	      karte.getArt();
	      
	      karte.setAttribute(5, 4, 3, 2);
	      


			int[]attribute = karte.getAttribute();
	      	
	      	
	      	
	     /*  	      
			System.out.println("Die Karte hat: "+attribute[0]+" Attacke");

			System.out.println("Die Karte hat: "+ attribute[1]+" Sleaze");
		
			System.out.println("Die Karte hat: "+ attribute[2]+" Data Processing");
		
			System.out.println("Die Karte hat: "+ attribute[3] +" Firewall");
		*/
	      	
//	      Koenig koenig1 = new Koenig();
//	      
//	      koenig1.getHP();
//	      
//	      koenig1.getAttribute();
//	      
	     Generator.Generate(Generator.Anzahl(), Generator.Tier());
	      
		 
	   }
	
}	