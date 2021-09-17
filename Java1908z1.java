package cetvrtakZvezdice;

import java.util.Scanner;

public class domaciCetvrtak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Napisati program gde korisnik unosi pozitivne brojeve, 
	 * kad unese negativan broj prikaze mu se suma svih prethodno unetih brojeva 
	 * i na kraju zakomentarisati koje ste brojeve sve unosili po testu
   na primer:
   //test 1 x, y, z
   //test 2 x, y, z
   //test 3 x, y, z
    (Koristiti do while petlju)*/
	
	Scanner s=new Scanner (System.in);
	
	int broj=0;
	int zbir=0;
	
	do {
	System.out.println("Unesite broj");	
	broj=s.nextInt();
	s.nextLine();
	if (broj>0) {zbir+=broj;}
	if(broj<0) {zbir=zbir;System.out.println("zbir je "+zbir);}
		
	}
	
	while(broj>0);
	
	
	//test 1: 5, 5, -5
	//test 2: 2, 6, 12, -5
	//test 3: 10, 7, 23, 10, -10
	
	
	
	
	}

}
