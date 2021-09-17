package petak;

public class domaciPetak2 {

	public static void main(String[] args) {
		/*Napisati program gde u nizu napisete ovih 5 gradova (Lisabon, London, Helsinki, Prag i Madrid) a program
stampa gradove sve dok ne dodje do "Prag"-a*/

		String[]gradovi= {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
		System.out.println("Gradovi:\n"+gradovi[0]+"\n"+gradovi[1]+"\n"+gradovi[2]);
		
		
	
	for(int i=1; i<gradovi.length-1; i++)	{System.out.println("Grad " +i+gradovi[i]);}
		 
		
	}

}
