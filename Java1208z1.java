package javaUvod;

import java.util.Scanner;

public class Java1208z1 {

	public static void main(String[] args) {
		/* Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i odstampajte adekvatno sva tri unosa. 
		 * Nakon toga preko skenera treba da unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama 
		 * i ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama, 
		 * na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj medalja. */
		 

         Scanner s=new Scanner (System.in);
         
	String ime= "Milena";
	String prezime= "Trifunoviæ";
	char pol='ž';
	System.out.println(ime+" "+prezime+" "+pol);
	
	int brojMedalja=0;
	int brojZlatnih=0;
	double procenatZlatnih=0;
	
	System.out.println("Unesite ukupan broj medalja koje je Srbija osvojila na Olimpijskim igrama ");
	
	brojMedalja=s.nextInt();
	
	System.out.println("Unesite broj zlatnih medalja koje je Srbija osvojila na Olimpijskim igrama ");
	brojZlatnih=s.nextInt();
	
	procenatZlatnih= 100*brojZlatnih/brojMedalja;
	
	System.out.println("Procenat zlatnih je "+procenatZlatnih);
	
	
	
	
	
	
	}

}
