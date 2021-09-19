package javaUvod;

import java.util.Scanner;

public class Java1308z1 {

	public static void main(String[] args) {
		/* 1. Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda ga pomnoziti sa 100, 
		 * ako je broj veci od 100 onda ga podeliti sa 10. 
		 * Na kraju zakomentarisite koje brojeve ste koristili za proveru programa. */

	
		Scanner s= new Scanner (System.in);
		int broj=0;
		
		System.out.println("Unesite broj");
		
		
		
		
	    broj=s.nextInt();
	    s.nextLine();
	    
	    if (broj<10) {broj*=100; System.out.println("Uneti broj je pomnožen sa 100 i iznosi "+broj);}
	    else if (broj>100) {broj/=10; System.out.println("Uneti broj je podeljen sa 10 i iznosi "+broj);}
	    else {System.out.println("Nedefinisana oblast");}
	
	
	
	}

}
