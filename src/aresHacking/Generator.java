package aresHacking;

import aresHacking.Karte;
import java.util.Arrays;
import java.util.Scanner;

public class Generator {

	
@SuppressWarnings("static-access")
public static void Generate(int anzahl,int tier) {

	int durchschnitt=0;
	
 // anzahl= Anzahl();
	 
 // tier=Tier();
 int summe=0;
 
 float konzern=0;
 float söldner=0;
 float critter=0;
 float kriminal=0;

 
for (int i = 0; i < anzahl; i++) {
	
	String name = "Gen"+i;
	
	Karte karte = new Karte(name);
	
	switch (tier) {
	case 0: 
		karte.setAttribute(Medi(3,6), Medi(3,6), Medi(3,6), Medi(3,6));
		break;
	case 1: 
		karte.setAttribute(Medi(2,6), Medi(2,6), Medi(2,6), Medi(2,6));
		break;
	case 2: 
		karte.setAttribute(Medi(1,6), Medi(1,6), Medi(1,6), Medi(1,6));
		break;
	case 3: 
		karte.setAttribute(Medi(3,10), Medi(3,10), Medi(3,10), Medi(3,10));

		break;
	case 4: 
		karte.setAttribute(Medi(2,10), Medi(2,10), Medi(2,10), Medi(2,10));
		break;
	case 5: 
		karte.setAttribute(Medi(1,10), Medi(1,10), Medi(1,10), Medi(1,10));
		break;
	
	default: System.out.println("Bitte Zahl zwischen 0 und 4 eingeben");
	
	}//switch
	

	summe = karte.getAttack()+karte.getDataProcessing()+karte.getFirewall()+karte.getSleaze();
	durchschnitt+=summe;
	
	
	
	
//	if (summe<=11) {
//		karte.seite = karte.seite.KRIMINAL;
//		kriminal++;
//	} else if (summe<=18) {
//		karte.seite = karte.seite.CRITTER;
//		critter++;
//	} else if (summe <=25) {
//		karte.seite = karte.seite.SÖLDNER;
//		söldner++;
//	} else {
//		karte.seite = karte.seite.KONZERN;	
//		konzern++;
//		}
//    System.out.println("Type: " + karte.seite);

	
	}//for

System.out.println("Durchschnitt: "+durchschnitt/anzahl);

//System.out.println("Konzern: " + (konzern/anzahl)*100 +"%");
//System.out.println("Söldner: " + (söldner/anzahl)*100 +"%");
//System.out.println("Critter: " + (critter/anzahl)*100 +"%");
//System.out.println("Kriminal: " + (kriminal/anzahl)*100 +"%");


	
}//generate
	


public static int Medi(int anzahl, int würfel) {
	int[] medi;
	medi = new int[anzahl];
	
	for (int i = 0; i < medi.length; i++) {
		medi[i]=Würfeln(würfel);
		
	}
	

	
	Arrays.sort(medi);
	
	
	
	
	return medi[0];
}

public static int Würfeln(int x) {
	int die=0;
	
	die = (int)(Math.random()*x + 1);
	
	return die;
	
}

public static  int Anzahl(){
	int anzahl = 0;
	System.out.println("Wie viele Karten sollen generiert werden");
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in); 
	
	anzahl = scanner.nextInt();

	
		return anzahl;
	}

public static int Tier(){
	int tier = 0;
	System.out.println("Von welchem Tier sollen die Karten sein");
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in); 
	
	tier = scanner.nextInt();

	
		return tier;
	}
}
