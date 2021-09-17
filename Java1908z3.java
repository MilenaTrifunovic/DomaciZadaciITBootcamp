package cetvrtakZvezdice;

import java.util.Scanner;

public class domaciCetvrtak3 {

	public static void main(String[] args) {
		/*Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
       (Koristiti for petlju)
         Na primer N: 5
*
**
***
****
*****   */

		
	Scanner s=new Scanner (System.in);
	
	System.out.println("Unesite broj ");
	int n = s.nextInt();
	s.nextLine();
		
	String zv="*";
	
	for(int i=0; i<n;i++) {System.out.println(zv);zv=zv+"*";}
	
	
	
	}

}
