package projekat4;

import java.util.Scanner;

public class domacipon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Naci sumu parnih i sumu neparnih brojeva izmedju dva proizvoljno uneta broja*/
	
	Scanner s=new Scanner (System.in);	
		
	System.out.println("Uneti prvi broj");
		int manji=s.nextInt();
		System.out.println("Uneti drugi broj");
		int veci=s.nextInt();
		
		if(manji>veci) {
			int tmp=manji;
			manji=veci;
			veci=tmp;	
		}
		
		
		int zbirParnih=0;
		int zbirNeparnih=0;
		
		while(manji<veci) {
			if(manji%2==0) 
				{zbirParnih+=manji;
				System.out.println("Zbir parnih je"+zbirParnih);
				manji++;}
			
				else {zbirNeparnih+=manji; System.out.println("Zbir neparnih je "+ zbirNeparnih);manji++;} 
		} 
		
		System.out.println("Zbir parnih "+zbirParnih +"Zbir neparnih" +zbirNeparnih);
	}

}

