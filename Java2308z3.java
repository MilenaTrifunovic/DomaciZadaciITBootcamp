package metodeUtorak;

import java.util.Scanner;

public class domaciPonedeljak3 {

	public static void main(String[] args) {
		/*  Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva i ispisuje dve metode. 
		 * Prva ispisuje zbir tri unesena broja, a druga vraca najveci od unetih brojeva. */
		 
		Scanner s=new Scanner (System.in);
        
		System.out.println("Unesite prvi broj");
		int prvi=s.nextInt();
		s.nextLine();
		
		System.out.println("Unesite drugi broj");
		int drugi=s.nextInt();
		s.nextLine();
		
		System.out.println("Unesite treæi broj");
		int treæi=s.nextInt();
		s.nextLine();
		
		int najmanji3=najmanjiOdTriBroja(prvi,drugi,treæi);
		int proizvod3=proizvodTriBroja(prvi, drugi,treæi);
		
		System.out.println("Najmanji od tri uneta broja je " + najmanji3);
		System.out.println("Proizvod unetih brojeva je " + proizvod3);
		
	}
	
	public static int najmanjiOdTriBroja(int a, int b, int c) {
		
		if(a<b && a<c)
			return a;
			else if (b<a && b<c)
				return b;
			else
				return c;
	}
	
	
	public static int proizvodTriBroja(int a , int b, int c) {
		
		return a*b*c;
		
		
	}

}
