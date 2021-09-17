package projekat4;

import java.util.Scanner;

public class domacipon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
 * i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/
		
	Scanner s=new Scanner(System.in);
	
	int broj=1;
	int zbir=0;
	
	while(broj>0) {System.out.println("Unesite broj");
	broj=s.nextInt();
	if (broj>0) {zbir=zbir+broj; 
	System.out.println("Zbir je "+zbir);}
	
	if(broj<0) {zbir=zbir; System.out.println("Zbir je"+zbir);break;}
	
		}
		
		
		

	
	
	}
	}
	
	
	
	

	


