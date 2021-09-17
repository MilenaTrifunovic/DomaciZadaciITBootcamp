
public class Putnik extends Covek{
	
	/* Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme. */
	
	private boolean imaNovac;
	private double količinaNovca;
	
	public Putnik (String imeIPrezime, double količinaNovca) {
		
		super (imeIPrezime);
		this.imaNovac=true;
		this.količinaNovca=količinaNovca;}
	
	
	
	public boolean isImaNovac() {
		return imaNovac;
	}




	public double getKoličinaNovca() {
		return količinaNovca;
	}




	public 	double dodajNovac(double d) {
		if(d>0) {količinaNovca+=d;System.out.println("Novac je dodat i putnik sada ima "+količinaNovca);
		return količinaNovca;}
		else {System.out.println("Neuspešno dodavanje");return 0.0;}
		
	}
	
	public double oduzmiNovac (double c) {
		if (količinaNovca>c) {količinaNovca-=c;System.out.println("Novac je oduzet"); return količinaNovca;}//return ; 
		else {System.out.println("Nema dovoljno novca");return 0.0;}
	}
	
	
	@Override
	public String toString () {
		
		return super.getImeIPrezime()+" "+količinaNovca;
		
		
	}
		
	}	
	
	
	
	
	
	


