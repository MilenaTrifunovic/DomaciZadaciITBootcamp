package metodeUtorak;

import java.util.Scanner;

public class domaciPonedeljak2 {

	public static void main(String[] args) {
		/* Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.*/
		 
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
		
		int proizvod= proizvodTriBroja(prvi,drugi,treæi);
		
		System.out.println("Proizvod unetih brojeva je "+proizvod);
		
	}

	public static int proizvodTriBroja (int a, int b, int c) {
		
		return a*b*c;
		
		
	}
	
	
}
