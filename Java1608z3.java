package projekat4;

import java.util.Scanner;

public class domacipon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” 
	 * onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta*/
	
	Scanner s=new Scanner (System.in);
	System.out.println("Unesite broj");
	int zadatiBroj=s.nextInt();
	
	int brojPoruka=0;
	
	
	while(zadatiBroj!=brojPoruka) {System.out.println("Laku noc");
	brojPoruka++;}
	
	}

}
