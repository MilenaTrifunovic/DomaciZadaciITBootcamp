package metodeUtorak;

import java.util.Scanner;

public class DomaciPonedeljak1 {

public static void main(String[] argas) {
	
	/*Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
	(znaci da korisnik unosi tri broja) 
	i taj program treba da pozove i ispise (u mainu) najmanji od ta tri unesena broja.*/
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("Unesite prvi broj");
	int prvi=s.nextInt();
	System.out.println("Unesite drugi broj");
	int drugi=s.nextInt();
	System.out.println("Unesite treci broj");
	int treci=s.nextInt();
	int najmanji= najmanjiOdTri(prvi,drugi,treci);
	
	
	System.out.println("Najmanji je "+najmanji);
	
}
public static int manjiOdDva(int a, int b) {
	
	
	if (a<b) 
	return a;
	
	else {return b;}
	
	
}

public static int najmanjiOdTri (int a, int b, int c) {

a=manjiOdDva(a,b);
if(a<c)
	return a;
else 
	return c;}


}
