package projekat4;

import java.util.Scanner;

public class domaciUtorak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Napisati program koji oponasa kviz za pogadjanje glavnog grada.
- Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa.
    1. Francuska
    2. Italija
    3. Srbija
    4. Izlaz
- Nakon odabira drzave, potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?'
- Ako korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan'
- Ako korisnik odgovori netacno, ispisuje se poruka 'Odgovor nije tacan'
- Nakon davanja odgovora (bilo da je tacan ili netacan), ponovo treba da se postave
sve pocetne opcije i ponudi korisniku da odabere neku od njih.
- Program se zavrsava kad korisni odabere 4. opciju 'Izlaz'
- Program uraditi koriscenjem dosad naucenog + do-while petlje*/
		
		
		Scanner s=new Scanner (System.in);
		String franc= "1.Francuska";
	    String it="2.Italija";
	    String srb="3.Srbija";
	    String izlaz="4.Izlaz";
	    
	    String pariz= "Pariz";
	    String rim="Rim";
	    String bg="Beograd";
	    
	    String odgovorGlGrad="";
	    String izborOpcije="";
	    
		do {System.out.println("Izaberite jednu od ponuðenih opcija: \n "+franc+" \n "+it+ "\n "+srb+"\n "+izlaz);
		izborOpcije=s.nextLine();
		if (izborOpcije.equals(franc)|| izborOpcije.equals("Francuska")|| izborOpcije.equals("1")) {System.out.println("Koji je glavni grad Francuske?");
		odgovorGlGrad=s.nextLine(); if (odgovorGlGrad.equals(pariz)) {System.out.println("Odgovor je taèan");}
		
		else {System.out.println("Odgovor nije taèan");}
		}
		
		if (izborOpcije.equals(it)|| izborOpcije.equals("Italija")|| izborOpcije.equals("2")) {System.out.println("Koji je glavni grad Italije?");
		odgovorGlGrad=s.nextLine();if (odgovorGlGrad.equals(rim)) {System.out.println("Odgovor je taèan");}
		else {System.out.println("Odgovor nije taèan");}}
		
		if (izborOpcije.equals(srb)|| izborOpcije.equals("Srbija") || izborOpcije.equals("3")) {System.out.println("Koji je glavni grad Srbije?");
		odgovorGlGrad=s.nextLine(); if (odgovorGlGrad.equals(bg)) {System.out.println("Odgovor je taèan");} else {System.out.println("Odgovor nije taèan");}}
		
		if (izborOpcije.equals(izlaz)|| izborOpcije.equals("Izlaz")|| izborOpcije.equals("4")) {System.out.println("Kraj programa");break;}
		
		
		
		}
		
		while (izborOpcije!=izlaz); 
		
		
	}

}

